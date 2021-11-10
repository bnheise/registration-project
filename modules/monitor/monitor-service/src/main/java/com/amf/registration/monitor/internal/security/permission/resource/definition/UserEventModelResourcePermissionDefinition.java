package com.amf.registration.monitor.internal.security.permission.resource.definition;

import java.util.function.Consumer;

import com.amf.registration.monitor.constants.MonitorConstants;
import com.amf.registration.monitor.model.UserEvent;
import com.amf.registration.monitor.service.UserEventLocalService;
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
public class UserEventModelResourcePermissionDefinition implements ModelResourcePermissionDefinition<UserEvent> {

    @Override
    public UserEvent getModel(long userEventId) throws PortalException {
        return userEventLocalService.getUserEvent(userEventId);
    }

    @Override
    public void registerModelResourcePermissionLogics(
            ModelResourcePermission<UserEvent> modelResourcePermission,
            Consumer<ModelResourcePermissionLogic<UserEvent>> modelResourcePermissionLogicConsumer) {
        modelResourcePermissionLogicConsumer
                .accept(
                        new StagedModelPermissionLogic<>(stagingPermission,
                                "monitorweb",
                                UserEvent::getUserEventId));

    }

    @Override
    public Class<UserEvent> getModelClass() {
        return UserEvent.class;
    }

    @Override
    public PortletResourcePermission getPortletResourcePermission() {
        return portletResourcePermission;
    }

    @Override
    public long getPrimaryKey(UserEvent userEvent) {
        return userEvent.getUserEventId();
    }

    @Reference
    private UserEventLocalService userEventLocalService;

    @Reference(target = "(resource.name=" + MonitorConstants.RESOURCE_NAME + ")")
    private PortletResourcePermission portletResourcePermission;

    @Reference
    private StagingPermission stagingPermission;
}
