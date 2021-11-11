import { TCountUserEventEndpoint } from "../constants";
import { TSetterFunction } from "../types";

export const fetchEventCount =
  (
    setEventCount: React.Dispatch<React.SetStateAction<number>>,
    currentEndpoint: TCountUserEventEndpoint
  ) =>
  () => {
    let mounted = true;
    setEventCount(0);
    Liferay.Service(
      currentEndpoint,
      (count: number) => {
        if (mounted) {
          setEventCount(count);
        }
      },
      (error) => console.error(error)
    );
    return () => {
      mounted = false;
    };
  };
