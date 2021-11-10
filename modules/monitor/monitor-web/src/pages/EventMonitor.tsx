import React, { FC } from 'react'
import ClayTable from '@clayui/table'

interface IEventMonitorProps {

}

const EventMonitor: FC<IEventMonitorProps> = (props: IEventMonitorProps) => {
    return (
        <div>
            <h2>Event Monitor</h2>
            <ClayTable>
                <ClayTable.Head>
                    <ClayTable.Row>
                        <ClayTable.Cell expanded headingCell>Date/Time</ClayTable.Cell>
                        <ClayTable.Cell headingCell>User</ClayTable.Cell>
                        <ClayTable.Cell headingCell>IP Address</ClayTable.Cell>
                        <ClayTable.Cell headingCell>Event Type</ClayTable.Cell>
                    </ClayTable.Row>
                </ClayTable.Head>
            </ClayTable>
        </div>
    )
}

export default EventMonitor;