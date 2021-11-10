package com.amf.registration.monitor.internal.security.permission.resource.definition;

import com.amf.registration.monitor.constants.MonitorConstants;
import com.liferay.exportimport.kernel.staging.permission.StagingPermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.StagedPortletPermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.definition.PortletResourcePermissionDefinition;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, service = PortletResourcePermissionDefinition.class)
public class MonitorPortletResourcePermissionDefinition implements PortletResourcePermissionDefinition {

    @Override
    public PortletResourcePermissionLogic[] getPortletResourcePermissionLogics() {
        return new PortletResourcePermissionLogic[] {
                new StagedPortletPermissionLogic(stagingPermission, "monitorweb")
        };
    }

    @Override
    public String getResourceName() {
        return MonitorConstants.RESOURCE_NAME;
    }

    @Reference
    private StagingPermission stagingPermission;
}
