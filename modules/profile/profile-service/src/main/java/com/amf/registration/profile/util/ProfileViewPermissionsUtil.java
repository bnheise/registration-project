package com.amf.registration.profile.util;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.ResourcePermission;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ResourcePermissionLocalServiceUtil;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;

public class ProfileViewPermissionsUtil {

    private ProfileViewPermissionsUtil() {
        throw new IllegalStateException("Utility class");
      }

    public static final ProfileViewPermissions getProfileViewPermissions(long companyId, String userId, String movieInterestId, String generalInfoId) throws PortalException {
        ProfileViewPermissions permissionSettings = new ProfileViewPermissions();
        getBasicInfoPermissionSettings(permissionSettings, companyId, userId);
        return permissionSettings;
    }

    private static final ProfileViewPermissions getBasicInfoPermissionSettings(ProfileViewPermissions permissionSettings, long companyId, String primKey) throws PortalException {
        ResourcePermission generalInfoGuestPermissions = getGeneralInfoGuestPermissions(companyId, primKey);
        return permissionSettings;
    }

    private static final ResourcePermission getPermissions(long companyId, String className, String primKey, long roleId) {
        return ResourcePermissionLocalServiceUtil.fetchResourcePermission(
				companyId, className, 4,
				primKey, roleId);
    }

    private static final ResourcePermission getGeneralInfoGuestPermissions(long companyId, String primKey) throws PortalException {
        return getPermissions(companyId, User.class.getName(), primKey, getGuestRole(companyId).getRoleId());
    }

    private static final Role getGuestRole(long companyId) throws PortalException {
        return RoleLocalServiceUtil.getRole(companyId, "Guest");
    }

    // private static final String getViewFavoriteActorPermission() {
    //     if (guestPermissions.hasActionId(CustomActionKeys.VIEW_FAVORITE_ACTOR)) {
    //         permissionSettings.put(CustomActionKeys.VIEW_FAVORITE_ACTOR, "anyone");
    //     } else if (userPermissions.hasActionId(CustomActionKeys.VIEW_FAVORITE_ACTOR)) {
    //         permissionSettings.put(CustomActionKeys.VIEW_FAVORITE_ACTOR, "members");
    //     } else {
    //         permissionSettings.put(CustomActionKeys.VIEW_FAVORITE_ACTOR, "private");
    //     }
    // }
}
