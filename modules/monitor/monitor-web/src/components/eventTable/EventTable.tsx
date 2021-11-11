import React, { FC, ReactElement, useEffect, useState } from "react";
import { TGetUserEventEndpoint, GetUserEventEndpoints, CountUserEventEndpoints, GetToCountEnpointMap } from "../../constants";
import { UserEvent } from "../../domain/UserEvent";
import EventTableDisplay from "./EventTableDisplay";
import EventTypeTabs from "../eventTypeTabs/EventTypeTabs";
import EventPagination from "../eventPagination/EventPagination";
import { fetchUserEvents } from "../../api/fetchUserEvents";
import { fetchEventCount } from "../../api/fetchEventCount";

interface Props { }

const PAGE_END_INCREMENT = 20;

const EventTable: FC<Props> = (): ReactElement => {
    const { GET_USER_EVENTS } = GetUserEventEndpoints;
    const [userEvents, setUserEvents] = useState<UserEvent[]>();
    const [userEventsCount, setUserEventsCount] = useState<number>(0);
    const [pageStart, setPageStart] = useState<number>(0);
    const [currentGetEndpoint, setCurrentEndpoint] =
        useState<TGetUserEventEndpoint>(GET_USER_EVENTS);

    useEffect(fetchUserEvents(setUserEvents, currentGetEndpoint, pageStart, PAGE_END_INCREMENT), [currentGetEndpoint, pageStart]);
    useEffect(fetchEventCount(setUserEventsCount, GetToCountEnpointMap[currentGetEndpoint]), [currentGetEndpoint]);
    return (
        <div>
            <EventTypeTabs setCurrentEndpoint={setCurrentEndpoint} />
            <EventPagination pageStart={pageStart} pageEnd={pageStart + PAGE_END_INCREMENT} userEventsCount={userEventsCount} setPageStart={setPageStart} />
            <EventTableDisplay userEvents={userEvents} />
        </div>
    );
};

export default EventTable;
