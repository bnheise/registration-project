package registration.portlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.frontend.js.loader.modules.extender.npm.NPMResolver;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import registration.constants.RegistrationPortletKeys;

/**
 * @author brianheise
 */
@Component(immediate = true, property = {
		"com.liferay.portlet.display-category=category.tools",
		"com.liferay.portlet.header-portlet-css=/css/index.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + RegistrationPortletKeys.REGISTRATION,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
}, service = Portlet.class)
public class RegistrationPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		renderRequest.setAttribute("mainRequire", npmResolver.resolveModuleName("registration") + " as main");

		super.doView(renderRequest, renderResponse);
	}

	@Reference
	private NPMResolver npmResolver;

}
