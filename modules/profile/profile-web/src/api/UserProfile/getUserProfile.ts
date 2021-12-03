import { HasScreenName } from "./misc";

export type GetProfileRequest = Liferay.RequestObject<HasScreenName>;
export const GET_USER_PROFILE = "/userprofile.userprofile/get-user-profile";
