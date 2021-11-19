import { EventFacade } from "liferay/src/events/eventFacade";
import { Dispatch, SetStateAction } from "react";
import { UserAddress } from "../../domain/UserAddress";

export const handleUsersReceived =
  (setUsers: Dispatch<SetStateAction<UserAddress[]>>) => () => {
    Liferay.on(
      "usersReceived",
      ({ details: [users] }: EventFacade<UserAddress[]>) => {
        setUsers(users);
      }
    );
  };

export const handleZipReceived =
  (setZip: Dispatch<SetStateAction<string>>) => () => {
    Liferay.on("zipReceived", ({ details: [zipCode] }: EventFacade<string>) => {
      setZip(zipCode);
    });
  };
