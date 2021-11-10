import React, { FC, ReactElement, useEffect, useState } from 'react'
import { GET_USER_EVENTS } from '../../constants';
import { UserEvent } from '../../dtos/UserEventDTO';
import EventTableDisplay from './EventTableDisplay';
import ClayLoadingIndicator from '@clayui/loading-indicator';

interface Props {

}

const EventTable: FC<Props> = (): ReactElement => {
    const [userEvents, setUserEvents] = useState<UserEvent[]>();

    useEffect(() => {
        let mounted = true;
        Liferay.Service(
            GET_USER_EVENTS,
            {
                start: 0,
                end: 20
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
    }, []);
    return (
        <div>
            {userEvents ? <EventTableDisplay userEvents={userEvents} /> : <ClayLoadingIndicator />}
        </div>
    )
}

export default EventTable
