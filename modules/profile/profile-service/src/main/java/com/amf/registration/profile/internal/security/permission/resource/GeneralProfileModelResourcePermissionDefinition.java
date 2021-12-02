package com.amf.registration.profile.internal.security.permission.resource;

import java.util.function.Consumer;

import com.amf.registration.profile.constants.ProfileConstants;
import com.amf.registration.profile.model.GeneralProfile;
import com.amf.registration.profile.service.GeneralProfileLocalService;
import com.liferay.exportimport.kernel.staging.permission.StagingPermission;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.StagedModelPermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.definition.ModelResourcePermissionDefinition;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, service = ModelResourcePermissionDefinition.class)
public class GeneralProfileModelResourcePermissionDefinition implements ModelResourcePermissionDefinition<GeneralProfile> {

    @Override
    public GeneralProfile getModel(long userEventId) throws PortalException {
        return generalProfileLocalService.getGeneralProfile(userEventId);
    }

    @Override
    public void registerModelResourcePermissionLogics(
            ModelResourcePermission<GeneralProfile> modelResourcePermission,
            Consumer<ModelResourcePermissionLogic<GeneralProfile>> modelResourcePermissionLogicConsumer) {
        modelResourcePermissionLogicConsumer
                .accept(
                        new StagedModelPermissionLogic<>(stagingPermission,
                                "com_amf_registration_profile_profileweb",
                                GeneralProfile::getGeneralProfileId));

    }

    @Override
    public Class<GeneralProfile> getModelClass() {
        return GeneralProfile.class;
    }

    @Override
    public PortletResourcePermission getPortletResourcePermission() {
        return portletResourcePermission;
    }

    @Override
    public long getPrimaryKey(GeneralProfile generalProfile) {
        return generalProfile.getGeneralProfileId();
    }

    @Reference
    private GeneralProfileLocalService generalProfileLocalService;

    @Reference(target = "(resource.name=" + ProfileConstants.RESOURCE_NAME + ")")
    private PortletResourcePermission portletResourcePermission;

    @Reference
    private StagingPermission stagingPermission;
}
