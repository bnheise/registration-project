import React, { FC, useState } from "react";
import ClayTabs from "@clayui/tabs";
import { TUserEventType, UserEventTypes } from "../../domain/UserEvent";
import { TGetUserEventEndpoint, GetUserEventEndpoints } from "../../constants";

interface Props {
    setCurrentEndpoint: (endpoint: TGetUserEventEndpoint) => void;
}

const EventTypeTabs: FC<Props> = ({ setCurrentEndpoint }) => {
    const { REGISTRATION, ALL, LOGIN } = UserEventTypes;
    const { GET_USER_EVENTS, GET_REGISTRATION_EVENTS, GET_LOGIN_EVENTS } = GetUserEventEndpoints;
    const [activeTabKeyValue, setActiveTabKeyValue] = useState<TUserEventType>(
        ALL
    );
    return (
        <div>
            <ClayTabs>
                <ClayTabs.Item
                    active={activeTabKeyValue === ALL}
                    onClick={() => {
                        setActiveTabKeyValue(ALL);
                        setCurrentEndpoint(GET_USER_EVENTS)
                    }}
                    innerProps={{
                        "aria-controls": "tabpanel-1",
                    }}
                >
                    All
                </ClayTabs.Item>
                <ClayTabs.Item
                    active={activeTabKeyValue === REGISTRATION}
                    onClick={() => {
                        setActiveTabKeyValue(REGISTRATION);
                        setCurrentEndpoint(GET_REGISTRATION_EVENTS);
                    }}
                    innerProps={{
                        "aria-controls": "tabpanel-2",
                    }}
                >
                    Registration
                </ClayTabs.Item>
                <ClayTabs.Item
                    active={activeTabKeyValue === LOGIN}
                    onClick={() => {
                        setActiveTabKeyValue(LOGIN);
                        setCurrentEndpoint(GET_LOGIN_EVENTS)
                    }}
                    innerProps={{
                        "aria-controls": "tabpanel-3",
                    }}
                >
                    Login
                </ClayTabs.Item>
            </ClayTabs>
        </div>
    );
};

export default EventTypeTabs;
