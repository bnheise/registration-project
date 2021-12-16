import ClayLoadingIndicator from "@clayui/loading-indicator";
import React, {
    Dispatch,
    FC,
    SetStateAction,
    useEffect,
    useState,
} from "react";
import { UpdatePermissionSettingsRequest, UPDATE_PERMISSION_SETTINGS } from "../api/UserProfile/updatePermissionSettings";
import { PermissionSettings } from "../domain/PermissionSettings";
import { convertObjKeysToCamel } from "../util/utils";
import { getPermissionSettings } from "./effects";
import ProfilePrivacyDisplay from "./ProfilePrivacyDisplay";

const ProfilePrivacy: FC = () => {
    const [permissionSettings, setPermissionSettings] =
        useState<PermissionSettings>();
    const userId = Liferay.ThemeDisplay.getUserId();
    useEffect(getPermissionSettings(userId, setPermissionSettings), []);
    const submitHandler = () => {
        if (permissionSettings) {
            const updatePermissionSettings: UpdatePermissionSettingsRequest = {
                [UPDATE_PERMISSION_SETTINGS]: convertObjKeysToCamel(permissionSettings),
            };
            Liferay.Service(
                [updatePermissionSettings],
                ([updatedPermissions]: [PermissionSettings]) => setPermissionSettings(updatedPermissions),
                (error) => {
                    console.error(error);
                }
            );
        }
    };

    return (
        <div>
            <h1>Edit Profile Privacy Settings</h1>
            {permissionSettings ? (
                <ProfilePrivacyDisplay
                    permissionSettings={permissionSettings}
                    submitHandler={submitHandler}
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
