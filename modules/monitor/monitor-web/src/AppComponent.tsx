import React, { FC, ReactElement } from 'react';
import { IPortletDetails } from '.';
import EventMonitor from './pages/EventMonitor';


const AppComponent: FC<IPortletDetails> = ({ portletNamespace, contextPath, portletElementId, configuration }): ReactElement => {
	return (
		<div>
			<EventMonitor />
		</div>
	);
}

export default AppComponent;