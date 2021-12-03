import { HasScreenName } from "./misc";

export type GetPermissionsRequest = Liferay.RequestObject<HasScreenName>;
export const GET_VIEW_PERMISSIONS = "/userprofile.userprofile/get-permissions";
