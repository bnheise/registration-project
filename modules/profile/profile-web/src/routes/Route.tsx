import React, { FC, ReactElement } from 'react'
import { Route } from 'react-router-dom';

import { Route as IRoute } from './routes';

const RouteWithSubRoutes: FC<IRoute> = (route): ReactElement => {
    return (
        <Route
            path={route.path}
            render={(props: any) => (
                <route.component {...props} routes={route.routes} />
            )}
        />
    );
}

export default RouteWithSubRoutes;
