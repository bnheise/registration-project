export type GetPermissionsByIdRequest = Liferay.RequestObject<{
  userId: string | boolean;
}>;
export const GET_VIEW_PERMISSIONS_BY_ID =
  "/userprofile.userprofile/get-permissions-by-user-id";
