import ClayForm, { ClayInput } from "@clayui/form";
import React, { FC, ReactElement } from "react";
import { genderOptions } from "../domain/options";
import { ProfileViewPermissions } from "../domain/ProfileViewPermissions";
import { UserProfile } from "../domain/UserProfile";
import PermissionedDatePicker from "./profileForm/PermissionedDatePicker";
import PermissionedInput from "./profileForm/PermissionedInput";
import PermissionedInputGroup from "./profileForm/PermissionedInputGroup";
import PermissionedSection from "./profileForm/PermissionedSection";
import PermissionedSelect from "./profileForm/PermissionedSelect";

interface Props {
    userProfile: UserProfile;
    viewPermissions: ProfileViewPermissions;
    isEditContent?: boolean;
    isEditPermissions?: boolean;
}

const ProfileViewDisplay: FC<Props> = ({
    userProfile,
    viewPermissions,
    isEditContent = false,
    isEditPermissions = false,
}): ReactElement => {
    const {
        basicInfo,
        firstName: viewFirstName,
        lastName: viewLastName,
        birthday: viewBirthday,
        generalProfile,
        movieInterest,
    } = viewPermissions;
    const { firstName, lastName, male, birthMonth, birthYear, birthDay } =
        userProfile;
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
                                />
                            </ClayInput.GroupItem>
                            <ClayInput.GroupItem>
                                <PermissionedInput
                                    label="Last Name"
                                    isEdit={isEditContent}
                                    hasPermission={viewLastName}
                                    value={lastName}
                                />
                            </ClayInput.GroupItem>
                            <ClayInput.GroupItem>
                                <PermissionedSelect
                                    label="Gender"
                                    options={genderOptions}
                                    isEdit={isEditContent}
                                    hasPermission={viewLastName}
                                    value={male ? "male" : "female"}
                                />
                            </ClayInput.GroupItem>
                        </ClayInput.Group>
                    </ClayForm.Group>
                    <ClayForm.Group>
                        <PermissionedDatePicker
                            label="Birthday"
                            isEdit={isEditContent}
                            hasPermission={viewBirthday}
                            date={new Date(
                                birthYear,
                                birthMonth,
                                birthDay
                            ).toLocaleDateString([], { year: 'numeric', month: 'long', day: 'numeric' })}
                        />
                    </ClayForm.Group>
                </ClayForm>
            </PermissionedSection>
            <PermissionedSection
                heading="General Information"
                hasPermission={generalProfile}
            ></PermissionedSection>
            <PermissionedSection
                heading="Movie Interest"
                hasPermission={movieInterest}
            ></PermissionedSection>
        </>
    );
};

export default ProfileViewDisplay;
