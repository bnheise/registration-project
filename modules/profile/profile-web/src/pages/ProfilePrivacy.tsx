import ClayLoadingIndicator from "@clayui/loading-indicator";
import React, {
    Dispatch,
    FC,
    SetStateAction,
    useEffect,
    useState,
} from "react";
import { PermissionSettings } from "../domain/PermissionSettings";
import { getPermissionSettings } from "./effects";
import ProfilePrivacyDisplay from "./ProfilePrivacyDisplay";

interface Props { }

const ProfilePrivacy: FC<Props> = ({ }) => {
    const [permissionSettings, setPermissionSettings] =
        useState<PermissionSettings>();
    const userId = Liferay.ThemeDisplay.getUserId();
    useEffect(getPermissionSettings(userId, setPermissionSettings), []);
    const handleSubmit = () => { };

    return (
        <div>
            <h1>Edit Profile Privacy Settings</h1>
            {permissionSettings ? (
                <ProfilePrivacyDisplay
                    permissionSettings={permissionSettings}
                    setPermissionSettings={
                        setPermissionSettings as Dispatch<
                            SetStateAction<PermissionSettings>
                        >
                    }
                />
            ) : (
                <ClayLoadingIndicator />
            )}
        </div>
    );
};

export default ProfilePrivacy;
