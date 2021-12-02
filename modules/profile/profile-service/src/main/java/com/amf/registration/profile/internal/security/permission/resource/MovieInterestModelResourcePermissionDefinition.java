package com.amf.registration.profile.internal.security.permission.resource;

import java.util.function.Consumer;

import com.amf.registration.profile.constants.ProfileConstants;
import com.amf.registration.profile.model.MovieInterest;
import com.amf.registration.profile.service.MovieInterestLocalService;
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
public class MovieInterestModelResourcePermissionDefinition implements ModelResourcePermissionDefinition<MovieInterest> {

    @Override
    public MovieInterest getModel(long movieInterestId) throws PortalException {
        return movieInterestLocalService.getMovieInterest(movieInterestId);
    }

    @Override
    public void registerModelResourcePermissionLogics(
            ModelResourcePermission<MovieInterest> modelResourcePermission,
            Consumer<ModelResourcePermissionLogic<MovieInterest>> modelResourcePermissionLogicConsumer) {
        modelResourcePermissionLogicConsumer
                .accept(
                        new StagedModelPermissionLogic<>(stagingPermission,
                                "com_amf_registration_profile_profileweb",
                                MovieInterest::getMovieInterestId));

    }

    @Override
    public Class<MovieInterest> getModelClass() {
        return MovieInterest.class;
    }

    @Override
    public PortletResourcePermission getPortletResourcePermission() {
        return portletResourcePermission;
    }

    @Override
    public long getPrimaryKey(MovieInterest movieInterest) {
        return movieInterest.getMovieInterestId();
    }

    @Reference
    private MovieInterestLocalService movieInterestLocalService;

    @Reference(target = "(resource.name=" + ProfileConstants.RESOURCE_NAME + ")")
    private PortletResourcePermission portletResourcePermission;

    @Reference
    private StagingPermission stagingPermission;
}
