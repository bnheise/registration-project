package com.amf.registration.monitor;

import com.liferay.portal.kernel.service.UserLocalServiceWrapper;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.service.component.annotations.Component;

/**
 * @author brianheise
 */
@Component(
	immediate = true,
	property = {
	},
	service = ServiceWrapper.class
)
public class MonitorUserLocalServiceWrapper extends UserLocalServiceWrapper {

	public MonitorUserLocalServiceWrapper() {
		super(null);
	}

}