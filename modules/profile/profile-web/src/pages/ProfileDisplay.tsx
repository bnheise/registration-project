import ClayForm, { ClayInput } from "@clayui/form";
import React, { Dispatch, FC, ReactElement, SetStateAction } from "react";
import { genderOptions, SelectOption } from "../domain/options";
import { ProfileViewPermissions } from "../domain/ProfileViewPermissions";
import { UserProfile } from "../domain/UserProfile";
import PermissionedDatePicker from "./profileForm/PermissionedDatePicker";
import PermissionedInput from "./profileForm/PermissionedInput";
import PermissionedSection from "./profileForm/PermissionedSection";
import PermissionedSelect from "./profileForm/PermissionedSelect";

interface Props {
    userProfile: UserProfile;
    viewPermissions: ProfileViewPermissions;
    isEditContent?: boolean;
    isEditPermissions?: boolean;
    setProfile: Dispatch<SetStateAction<UserProfile>>;
    genreOptions: SelectOption[];
}

const ProfileViewDisplay: FC<Props> = ({
    userProfile,
    viewPermissions,
    isEditContent = false,
    isEditPermissions = false,
    setProfile,
    genreOptions
}): ReactElement => {
    const {
        basicInfo,
        firstName: viewFirstName,
        lastName: viewLastName,
        birthday: viewBirthday,
        generalProfile,
        aboutMe: viewAboutMe,
        favoriteQuotes: viewFavQuotes,
        movieInterest,
    } = viewPermissions;
    const {
        firstName,
        lastName,
        male,
        birthMonth,
        birthYear,
        birthDay,
        aboutMe,
        favoriteQuotes,
        favoriteActor,
        leastFavMovie,
        favoriteMovie,
        favoriteGenreId
    } = userProfile;

    const setFirstName = (value: typeof userProfile.firstName) => setProfile((prevState) => ({ ...prevState, firstName: value }));
    const setLastName = (value: typeof userProfile.lastName) => setProfile((prevState) => ({ ...prevState, lastName: value }));
    const setMale = (value: string) => setProfile((prevState) => ({ ...prevState, male: value === "male" }));
    const setBirthDay = (value: string) => setProfile((prevState) => {
        const asDate = new Date(value);
        return { ...prevState, birthDay: asDate.getDate(), birthMonth: asDate.getMonth(), birthYear: asDate.getFullYear() }
    });
    const setAboutMe = (value: typeof userProfile.aboutMe) => setProfile((prevState) => ({ ...prevState, aboutMe: value }));
    const setFavoriteQuotes = (value: typeof userProfile.favoriteQuotes) => setProfile((prevState) => ({ ...prevState, favoriteQuotes: value }));
    const setFavoriteActor = (value: typeof userProfile.favoriteActor) => setProfile((prevState) => ({ ...prevState, favoriteActor: value }));
    const setLeastFavMovie = (value: typeof userProfile.leastFavMovie) => setProfile((prevState) => ({ ...prevState, leastFavMovie: value }));
    const setFavoriteMovie = (value: typeof userProfile.favoriteMovie) => setProfile((prevState) => ({ ...prevState, favoriteMovie: value }));
    const setFavoriteGenre = (value: typeof userProfile.favoriteGenreId) => setProfile((prevState) => ({ ...prevState, favoriteGenreId: value }));

    if (isEditContent && isEditPermissions)
        throw new Error(
            "Values for isEditContent and isEditPermissions cannot both be true"
        );
    return (
        <>
            <PermissionedSection heading="Basic Info" hasPermission={basicInfo}>
                <ClayForm>
                    <ClayForm.Group>
                        <ClayInput.Group>
                            <ClayInput.GroupItem>
                                <PermissionedInput
                                    label="First Name"
                                    isEdit={isEditContent}
                                    hasPermission={viewFirstName}
                                    value={firstName}
                                    changeHandler={setFirstName}
                                />
                            </ClayInput.GroupItem>
                            <ClayInput.GroupItem>
                                <PermissionedInput
                                    label="Last Name"
                                    isEdit={isEditContent}
                                    hasPermission={viewLastName}
                                    value={lastName}
                                    changeHandler={setLastName}
                                />
                            </ClayInput.GroupItem>
                            <ClayInput.GroupItem>
                                <PermissionedSelect
                                    label="Gender"
                                    options={genderOptions}
                                    isEdit={isEditContent}
                                    hasPermission={viewLastName}
                                    value={male ? "male" : "female"}
                                    changeHandler={setMale}
                                />
                            </ClayInput.GroupItem>
                        </ClayInput.Group>
                    </ClayForm.Group>
                    <ClayForm.Group>
                        <PermissionedDatePicker
                            label="Birthday"
                            isEdit={isEditContent}
                            hasPermission={viewBirthday}
                            changeHandler={setBirthDay}
                            date={new Date(
                                birthYear,
                                birthMonth,
                                birthDay
                            ).toLocaleDateString([], {
                                year: "numeric",
                                month: "long",
                                day: "numeric",
                            })}
                        />
                    </ClayForm.Group>
                </ClayForm>
            </PermissionedSection>
            <PermissionedSection
                heading="General Information"
                hasPermission={generalProfile}
            ></PermissionedSection>
            <ClayForm.Group>
                <PermissionedInput
                    label="About Me"
                    hasPermission={viewAboutMe}
                    component="textarea"
                    isEdit={isEditContent}
                    value={aboutMe}
                    changeHandler={setAboutMe}
                />
            </ClayForm.Group>
            <ClayForm.Group>
                <PermissionedInput
                    label="Favorite Quotes"
                    hasPermission={viewFavQuotes}
                    component="textarea"
                    isEdit={isEditContent}
                    value={favoriteQuotes}
                    changeHandler={setFavoriteQuotes}
                />
            </ClayForm.Group>
            <PermissionedSection
                heading="Movie Interest"
                hasPermission={movieInterest}
            >
                <ClayForm.Group>
                    <PermissionedInput
                        label="Favorite Movie"
                        hasPermission={viewFavQuotes}
                        isEdit={isEditContent}
                        value={favoriteMovie}
                        changeHandler={setFavoriteMovie}
                    />
                </ClayForm.Group>
                <ClayForm.Group>
                    <PermissionedSelect
                        label="Favorite Genre"
                        hasPermission={viewFavQuotes}
                        isEdit={isEditContent}
                        value={favoriteGenreId}
                        options={genreOptions}
                        changeHandler={setFavoriteGenre}
                    />
                </ClayForm.Group>
                <ClayForm.Group>
                    <PermissionedInput
                        label="Least Favorite Movie"
                        hasPermission={viewFavQuotes}
                        isEdit={isEditContent}
                        value={leastFavMovie}
                        changeHandler={setLeastFavMovie}
                    />
                </ClayForm.Group>
                <ClayForm.Group>
                    <PermissionedInput
                        label="Favorite Actor/Actress"
                        hasPermission={viewFavQuotes}
                        isEdit={isEditContent}
                        value={favoriteActor}
                        changeHandler={setFavoriteActor}
                    />
                </ClayForm.Group>
            </PermissionedSection>
        </>
    );
};

export default ProfileViewDisplay;
