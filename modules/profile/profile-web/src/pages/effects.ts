import { Dispatch, SetStateAction } from "react";
import {
  GetAllGenresRequest,
  GET_ALL_GENRES,
} from "../api/UserProfile/getAllGenres";
import {
  GetProfileRequest,
  GET_USER_PROFILE,
} from "../api/UserProfile/getUserProfile";
import {
  GetProfileByIdRequest,
  GET_USER_PROFILE_BY_ID,
} from "../api/UserProfile/getUserProfileById";
import {
  GetPermissionsRequest,
  GET_VIEW_PERMISSIONS,
} from "../api/UserProfile/getViewPermissions";
import {
  GetPermissionsByIdRequest,
  GET_VIEW_PERMISSIONS_BY_ID,
} from "../api/UserProfile/getViewPermissionsByUserId";
import { Genre } from "../domain/Genre";
import { SelectOption } from "../domain/options";
import { ProfileViewPermissions } from "../domain/ProfileViewPermissions";
import { UserProfile } from "../domain/UserProfile";

type UserProfileSetter = Dispatch<SetStateAction<UserProfile | undefined>>;
type ViewPermissionsSetter = Dispatch<
  SetStateAction<ProfileViewPermissions | undefined>
>;
type GenreOptionsSetter = Dispatch<SetStateAction<SelectOption[] | undefined>>;

export const getProfileAndPermissions =
  (
    screenName: string,
    setUserProfile: UserProfileSetter,
    setProfileViewPermissions: ViewPermissionsSetter,
    setGenreOptions: GenreOptionsSetter
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
        setGenreOptions([
          {
            value: userProfile.favoriteGenreId,
            label: userProfile.favoriteGenre,
          },
        ]);
      },
      (error) => {
        console.error(error);
      }
    );
  };

export const getOwnProfile =
  (
    userId: string,
    setUserProfile: UserProfileSetter,
    setProfileViewPermissions: ViewPermissionsSetter,
    setGenreOptions: GenreOptionsSetter
  ) =>
  () => {
    const getProfile: GetProfileByIdRequest = {
      [GET_USER_PROFILE_BY_ID]: { userId },
    };

    const getViewPermissions: GetPermissionsByIdRequest = {
      [GET_VIEW_PERMISSIONS_BY_ID]: { userId },
    };

    const getAllGenres: GetAllGenresRequest = {
      [GET_ALL_GENRES]: {},
    };
    Liferay.Service(
      [getProfile, getViewPermissions, getAllGenres],
      ([userProfile, profileViewPermissions, genres]: [
        UserProfile,
        ProfileViewPermissions,
        Genre[]
      ]) => {
        setUserProfile(userProfile);
        setProfileViewPermissions(profileViewPermissions);
        setGenreOptions(
          genres.map(({ genreId, genreName }) => ({
            value: genreId,
            label: genreName,
          }))
        );
      },
      (error) => {
        console.error(error);
      }
    );
  };
