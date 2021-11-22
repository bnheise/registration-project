
import React from 'react';
import { PortletProps } from '.';
import UserSearchResults from './components/UserSearchResults/UserSearchResults';


const AppComponent = ({ portletElementId, portletNamespace, contextPath, configuration }: PortletProps) => {

	return (
		<div >
			<UserSearchResults />
		</div >
	)
}

export default AppComponent
