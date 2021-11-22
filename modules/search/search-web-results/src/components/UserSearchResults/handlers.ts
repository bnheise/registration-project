import { EventFacade } from "liferay-types/src/events/eventFacade";
import { Dispatch, SetStateAction } from "react";
import { UserAddress } from "../../domain/UserAddress";

interface SearchResults {
  users: UserAddress[];
  count: number;
  zip: string;
}

export const handleSearchResultReceived =
  (
    setUsers: Dispatch<SetStateAction<UserAddress[]>>,
    setZip: Dispatch<SetStateAction<string>>,
    setCount: Dispatch<SetStateAction<number>>
  ) =>
  () => {
    Liferay.on(
      "searchResultsReceived",
      ({ users, zip, count }: EventFacade<SearchResults>) => {
        setUsers(users as UserAddress[]);
        setCount(count as number);
        setZip(zip as string);
      }
    );
  };

export const handlePageChangeRequested = (
  delta: number,
  newActivePage: number,
  zip: string
) => {
  const start = delta * (newActivePage - 1);
  const end = start + delta;
  Liferay.fire("pageChangeRequested", { start, end, zip });
};
