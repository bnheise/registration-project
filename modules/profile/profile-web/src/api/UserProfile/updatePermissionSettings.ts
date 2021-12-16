import { SubmitPermissionSettings } from "../../domain/PermissionSettings";

export type UpdatePermissionSettingsRequest =
  Liferay.RequestObject<SubmitPermissionSettings>;
export const UPDATE_PERMISSION_SETTINGS =
  "/userprofile.userprofile/update-permission-settings";
