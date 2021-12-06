import ClayLayout from "@clayui/layout";
import ClayLoadingIndicator from "@clayui/loading-indicator";
import React, { FC, ReactElement, useEffect, useState } from "react";
import { SelectOption } from "../domain/options";
import { ProfileViewPermissions } from "../domain/ProfileViewPermissions";
import { UserProfile } from "../domain/UserProfile";
import { getOwnProfile } from "./effects";
import ProfileDisplay from "./ProfileDisplay";

interface Props { }

const ProfileEdit: FC<Props> = (): ReactElement => {
    const [profile, setProfile] = useState<UserProfile>();
    const [viewPermissions, setViewPermissions] =
        useState<ProfileViewPermissions>();
    const [genreOptions, setGenreOptions] = useState<SelectOption[]>();
    const userId = Liferay.ThemeDisplay.getUserId();

    useEffect(getOwnProfile(userId, setProfile, setViewPermissions, setGenreOptions), []);
    console.log(profile);

    // TODO: load permissions information for requested user; this info only tells what to display
    // TODO: load actual information for requested user; if permission doesn't exist the data should be blank
    return (
        <ClayLayout.Container>
            <div>
                <h1>Edit Profile</h1>
                {profile && viewPermissions && genreOptions ? (
                    <ProfileDisplay
                        userProfile={profile}
                        isEditContent={true}
                        viewPermissions={viewPermissions}
                        genreOptions={genreOptions}
                        setProfile={
                            setProfile as React.Dispatch<React.SetStateAction<UserProfile>>
                        }
                    />
                ) : (
                    <ClayLoadingIndicator />
                )}
            </div>
        </ClayLayout.Container>
    );
};

export default ProfileEdit;
