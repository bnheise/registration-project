import { UserProfile } from "../../domain/UserProfile";

export type UpdateUserProfileRequest = Liferay.RequestObject<UserProfile>;
export const UPDATE_USER_PROFILE =
  "/userprofile.userprofile/update-user-profile";
