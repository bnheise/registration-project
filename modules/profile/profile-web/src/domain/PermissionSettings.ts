export enum PermissionSettingOption {
  anyone = "anyone",
  members = "members",
  private = "private",
}

export interface PermissionSettings {
  VIEW_FIRST_NAME: PermissionSettingOption;
  VIEW_FAVORITE_MOVIE: PermissionSettingOption;
  VIEW_LAST_NAME: PermissionSettingOption;
  VIEW_GENERAL_PROFILE: PermissionSettingOption;
  VIEW_MOVIE_INTEREST: PermissionSettingOption;
  VIEW_MALE: PermissionSettingOption;
  VIEW_FAVORITE_GENRE: PermissionSettingOption;
  VIEW_LEAST_FAV_MOVIE: PermissionSettingOption;
  VIEW_ABOUT_ME: PermissionSettingOption;
  VIEW_BASIC_INFO: PermissionSettingOption;
  VIEW_BIRTHDAY: PermissionSettingOption;
  VIEW_FAVORITE_QUOTES: PermissionSettingOption;
  VIEW_FAVORITE_ACTOR: PermissionSettingOption;
}

export interface SubmitPermissionSettings {
  viewFirstName: PermissionSettingOption;
  viewFavoriteMovie: PermissionSettingOption;
  viewLastName: PermissionSettingOption;
  viewGeneralProfile: PermissionSettingOption;
  viewMovieInterest: PermissionSettingOption;
  viewMale: PermissionSettingOption;
  viewFavoriteGenre: PermissionSettingOption;
  viewLeastFavMovie: PermissionSettingOption;
  viewAboutMe: PermissionSettingOption;
  viewBasicInfo: PermissionSettingOption;
  viewBirthday: PermissionSettingOption;
  viewFavoriteQuotes: PermissionSettingOption;
  viewFavoriteActor: PermissionSettingOption;
}
