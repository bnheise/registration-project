package com.amf.registration.profile.util;

public class ProfileViewPermissions {
    private String viewBasicInfo = ProfileViewPermissionConstants.PRIVATE;
    private String viewFirstName = ProfileViewPermissionConstants.PRIVATE;
    private String viewLastName = ProfileViewPermissionConstants.PRIVATE;
    private String viewBirthay = ProfileViewPermissionConstants.PRIVATE;
    private String viewGender = ProfileViewPermissionConstants.PRIVATE;
    private String viewGeneralInfo = ProfileViewPermissionConstants.PRIVATE;
    private String viewAboutMe = ProfileViewPermissionConstants.PRIVATE;
    private String viewFavoriteQuotes = ProfileViewPermissionConstants.PRIVATE;
    private String viewMovieInterest = ProfileViewPermissionConstants.PRIVATE;
    private String viewFavoriteMovie = ProfileViewPermissionConstants.PRIVATE;
    private String viewLeastFavMovie = ProfileViewPermissionConstants.PRIVATE;
    private String viewFavoriteActor = ProfileViewPermissionConstants.PRIVATE;

    ProfileViewPermissions() {}

    public String getViewBasicInfo() {
        return viewBasicInfo;
    }

    public void setViewBasicInfo(String privacyKey) {
        viewBasicInfo = privacyKey;
    }

    public String getViewFirstName() {
        return viewFirstName;
    }

    public void setViewFirstName(String privacyKey) {
        viewFirstName = privacyKey;
    }

    public String getViewLastName() {
        return viewLastName;
    }

    public void setViewLastName(String privacyKey) {
        viewLastName = privacyKey;
    }

    public String getViewBirthday() {
        return viewBirthay;
    }

    public void setViewBirthday(String privacyKey) {
        viewBirthay = privacyKey;
    }

    public String getViewGender() {
        return viewGender;
    }

    public void setViewGender(String privacyKey) {
        viewGender = privacyKey;
    }

    public String getViewGeneralInfo() {
        return viewGeneralInfo;
    }

    public void setViewGeneralInfo(String privacyKey) {
        viewGeneralInfo = privacyKey;
    }

    public String getViewViewAboutMe() {
        return viewAboutMe;
    }

    public void setViewAboutMe(String privacyKey) {
        viewAboutMe = privacyKey;
    }

    public String getViewFavoriteQuotes() {
        return viewFavoriteQuotes;
    }

    public void setViewFavoriteQuotes(String privacyKey) {
        viewFavoriteQuotes = privacyKey;
    }

    public String getViewMovieInterest() {
        return viewMovieInterest;
    }

    public void setViewMovieInterest(String privacyKey) {
        viewMovieInterest = privacyKey;
    }

    public String getViewFavoriteMovie() {
        return viewFavoriteMovie;
    }

    public void setViewFavoriteMovie(String privacyKey) {
        viewFavoriteMovie = privacyKey;
    }

    public String getViewLeastFavMovie() {
        return viewLeastFavMovie;
    }

    public void setViewLeastFavMovie(String privacyKey) {
        viewLeastFavMovie = privacyKey;
    }

    public String getViewFavoriteActor() {
        return viewFavoriteActor;
    }

    public void setViewFavoriteActor(String privacyKey) {
        viewFavoriteActor = privacyKey;
    }
}
