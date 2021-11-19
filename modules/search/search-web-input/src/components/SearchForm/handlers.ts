import { ChangeEvent, Dispatch, SetStateAction } from "react";
import { UserAddress } from "../../domain/UserAddress";

export const handleClick = (zip: string, start: number, end: number) => () => {
  Liferay.Service(
    "/registrationsearch.useraddress/get-users-by-zip",
    { zip, start, end },
    (users: UserAddress[]) => {
      Liferay.fire("usersReceived", users);
    },
    (error) => {
      console.error("Error occurred while receiving users from the database.");
      console.error(`${error.name}: ${error.message}`);
    }
  );
};
export const handleChange =
  (setZip: Dispatch<SetStateAction<string>>) =>
  ({ currentTarget: { value } }: ChangeEvent<HTMLInputElement>) =>
    setZip(value);
