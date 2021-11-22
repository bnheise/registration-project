import { RequestObject } from "liferay-types/src/globalObject/Service";
import { ChangeEvent, Dispatch, SetStateAction } from "react";
import { UserAddress } from "../../domain/UserAddress";

interface GetUsersByZipDTO {
  zip: string;
  start: number;
  end: number;
}

interface GetUserByZipCountDTO {
  zip: string;
}

interface RequestError {
  javaClass: string;
  list: string[];
}

export const handleClick =
  (
    zip: string,
    start: number,
    end: number,
    setErrors: Dispatch<SetStateAction<string[]>>
  ) =>
  () => {
    console.log("HANDLE CLICK FIRED");
    console.log("HAND CLICK ZIP", zip);
    const userRequest: RequestObject<GetUsersByZipDTO> = {
      "/registrationsearch.useraddress/get-users-by-zip": {
        zip,
        start,
        end,
      },
    };

    const userCountRequest: RequestObject<GetUserByZipCountDTO> = {
      "/registrationsearch.useraddress/get-user-count-by-zip": { zip },
    };

    Liferay.Service(
      [userRequest, userCountRequest],
      (result: unknown[]) => {
        const users = result[0] as UserAddress[];
        const count = Number(result[1]);
        const usersCountZip = {
          users,
          count,
          zip,
        };
        Liferay.fire("searchResultsReceived", usersCountZip);
        setErrors([]);
      },
      (error: string) => {
        console.error(
          "Error occurred while receiving users from the database."
        );

        const { list: errorKeys } = JSON.parse(error) as RequestError;
        setErrors(errorKeys);
      }
    );
  };

export const handleChange =
  (setZip: Dispatch<SetStateAction<string>>) =>
  ({ currentTarget: { value } }: ChangeEvent<HTMLInputElement>) =>
    setZip(value);
