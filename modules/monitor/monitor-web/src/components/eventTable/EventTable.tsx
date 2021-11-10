import React, { FC, ReactElement, useEffect, useState } from "react";
import { TUserEventEndpoint, UserEventEndpoints } from "../../constants";
import { UserEvent } from "../../domain/UserEvent";
import EventTableDisplay from "./EventTableDisplay";
import EventTypeTabs from "../eventTypeTabs/EventTypeTabs";

interface Props { }

const EventTable: FC<Props> = (): ReactElement => {
    const { GET_LOGIN_EVENTS } =
        UserEventEndpoints;
    const [userEvents, setUserEvents] = useState<UserEvent[]>();
    const [currentEndpoint, setCurrentEndpoint] =
        useState<TUserEventEndpoint>(GET_LOGIN_EVENTS);

    useEffect(() => {
        let mounted = true;
        setUserEvents(undefined);
        Liferay.Service(
            currentEndpoint,
            {
                start: 0,
                end: 20,
            },
            (response: UserEvent[]) => {
                if (mounted) {
                    setUserEvents(response);
                }
            },
            (error) => console.error(error)
        );
        return () => {
            mounted = false;
        };
    }, [currentEndpoint]);
    return (
        <div>
            <EventTypeTabs setCurrentEndpoint={setCurrentEndpoint} />
            <EventTableDisplay userEvents={userEvents} />
        </div>
    );
};

export default EventTable;
