
import { EventFacade } from 'liferay/src/events/eventFacade';
import React, { useEffect, useState } from 'react';
import { PortletProps } from '.';
import UserSearchResults from './components/UserSearchResults/UserSearchResults';
import { UserAddress } from './domain/UserAddress';

interface Props {

}

const AppComponent = ({ portletElementId, portletNamespace, contextPath, configuration }: PortletProps) => {

	return (
		<div >
			<UserSearchResults />
		</div >
	)
}

export default AppComponent
