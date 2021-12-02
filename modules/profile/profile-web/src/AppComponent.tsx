import React, { FC, ReactElement } from 'react';
import { Switch, HashRouter } from 'react-router-dom';

import { PortletProps } from '.';
import RouteWithSubRoutes from './routes/Route';
import routes from './routes/routes';

const AppComponent: FC<PortletProps<object>> = (): ReactElement => {
	return (
		<HashRouter>
			<Switch>
				{routes.map((route, i) => (
					<RouteWithSubRoutes key={i} {...route} />
				))}
			</Switch>
		</HashRouter>
	);
}

export default AppComponent;
