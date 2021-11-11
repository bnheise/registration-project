import { TGetUserEventEndpoint } from "../constants";
import { UserEvent } from "../domain/UserEvent";
import { TSetterFunction } from "../types";

export const fetchUserEvents =
  (
    setUserEvents: TSetterFunction<UserEvent[]>,
    currentEndpoint: TGetUserEventEndpoint,
    start: number = 0,
    pageEndIncrement: number
  ) =>
  () => {
    let mounted = true;
    setUserEvents(undefined);
    Liferay.Service(
      currentEndpoint,
      { start, end: start + pageEndIncrement },
      (response: UserEvent[]) => {
        if (mounted) {
          setUserEvents(response);
        }
      },
      (error) => console.error(error)
    );
    return () => {
      mounted = false;
    };
  };
