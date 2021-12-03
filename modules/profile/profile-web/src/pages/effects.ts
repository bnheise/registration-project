import { Dispatch, SetStateAction } from "react";
import {
  GetProfileRequest,
  GET_USER_PROFILE,
} from "../api/UserProfile/getUserProfile";
import {
  GetPermissionsRequest,
  GET_VIEW_PERMISSIONS,
} from "../api/UserProfile/getViewPermissions";
import { ProfileViewPermissions } from "../domain/ProfileViewPermissions";
import { UserProfile } from "../domain/UserProfile";

type UserProfileSetter = Dispatch<SetStateAction<UserProfile | undefined>>;
type ViewPermissionsSetter = Dispatch<
  SetStateAction<ProfileViewPermissions | undefined>
>;

export const getProfileAndPermissions =
  (
    screenName: string,
    setUserProfile: UserProfileSetter,
    setProfileViewPermissions: ViewPermissionsSetter
  ) =>
  () => {
    const getProfile: GetProfileRequest = {
      [GET_USER_PROFILE]: { screenName },
    };
    const getViewPermissions: GetPermissionsRequest = {
      [GET_VIEW_PERMISSIONS]: { screenName },
    };
    Liferay.Service(
      [getProfile, getViewPermissions],
      ([userProfile, profileViewPermissions]: [
        UserProfile,
        ProfileViewPermissions
      ]) => {
        setUserProfile(userProfile);
        setProfileViewPermissions(profileViewPermissions);
      },
      (error) => {
        console.error(error);
      }
    );
  };
