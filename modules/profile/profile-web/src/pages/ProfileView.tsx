import React, { Dispatch, FC, ReactElement, SetStateAction, useEffect, useState } from "react";
import ClayLoadingIndicator from "@clayui/loading-indicator";
import { ProfileViewPermissions } from "../domain/ProfileViewPermissions";
import { UserProfile } from "../domain/UserProfile";
import { getProfileAndPermissions } from "./effects";
import ProfileDisplay from "./ProfileDisplay";
import ClayLayout from "@clayui/layout";
import { useParams } from "react-router";
import { SelectOption } from "../domain/options";

interface HasScreenName {
    screenName: string;
}

type UrlParams = HasScreenName;

const ProfileView: FC = (): ReactElement => {
    const [profile, setProfile] = useState<UserProfile>();
    const [viewPermissions, setViewPermissions] =
        useState<ProfileViewPermissions>();
    const [genreOptions, setGenreOptions] = useState<SelectOption[]>();
    const { screenName } = useParams<UrlParams>();

    useEffect(
        getProfileAndPermissions(
            screenName,
            setProfile,
            setViewPermissions,
            setGenreOptions
        ),
        []
    );
    console.log(profile);
    console.log(viewPermissions);
    // TODO: load permissions information for requested user; this info only tells what to display
    // TODO: load actual information for requested user; if permission doesn't exist the data should be blank
    return (
        <ClayLayout.Container>
            <div>
                <h1>Member Profile</h1>
                {profile && viewPermissions && genreOptions ? (
                    <ProfileDisplay
                        userProfile={profile}
                        viewPermissions={viewPermissions}
                        genreOptions={genreOptions}
                        setProfile={
                            setProfile as Dispatch<SetStateAction<UserProfile>>
                        }
                    />
                ) : (
                    <ClayLoadingIndicator />
                )}
            </div>
        </ClayLayout.Container>
    );
};

export default ProfileView;
