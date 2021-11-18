import React from 'react';
import ReactDOM from 'react-dom';
import { PortletProps } from '.';

interface Props {

}

const AppComponent = ({ portletElementId, portletNamespace, contextPath, configuration }: PortletProps) => {
	return (
		<div >
			<div>
				<span className="tag">{Liferay.Language.get('portlet-namespace')}:</span>
				<span className="value">{portletNamespace}</span>
			</div>
			<div>
				<span className="tag">{Liferay.Language.get('context-path')}:</span>
				<span className="value">{contextPath}</span>
			</div>
			<div>
				<span className="tag">{Liferay.Language.get('portlet-element-id')}:</span>
				<span className="value">{portletElementId}</span>
			</div>

			<div>
				<span className="tag">{Liferay.Language.get('configuration')}:</span>
				<span className="value pre">{JSON.stringify(configuration, null, 2)}</span>
			</div>

		</div >
	)
}

export default AppComponent
