import React, { FC, ReactElement } from 'react'
import { Route } from 'react-router-dom';

import { Route as IRoute } from './routes';

interface RouteWithSubRoutesProps {
    route: IRoute;
}

const RouteWithSubRoutes: FC<IRoute> = (route): ReactElement => {
    console.log("TRIGGERD SUBROUTE", route.component)
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
