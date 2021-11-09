package com.amf.registration.monitor.hooks.login;

import javax.servlet.http.HttpServletRequest;

import com.amf.registration.monitor.service.UserEventLocalService;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author brianheise
 */
@Component(immediate = true, property = "key=login.events.post", service = LifecycleAction.class)
public class LoginPostAction implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		_log.info("Recording user login start...");
		HttpServletRequest request = lifecycleEvent.getRequest();
		userEventLocalService.addUserEvent(request);
		_log.info("Recording user login end");
	}

	private static final Log _log = LogFactoryUtil.getLog(LoginPostAction.class);

	@Reference
	private UserEventLocalService userEventLocalService;

}