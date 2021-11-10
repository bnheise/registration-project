import React, { FC } from 'react'
import ClayTable from '@clayui/table'
import EventTable from '../components/eventTable/EventTable';

interface IEventMonitorProps {

}

const EventMonitor: FC<IEventMonitorProps> = (props: IEventMonitorProps) => {
    return (
        <div>
            <h2>Event Monitor</h2>
            <EventTable />
        </div>
    )
}

export default EventMonitor;