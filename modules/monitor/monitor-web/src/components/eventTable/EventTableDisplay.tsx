import ClayTable from '@clayui/table'
import React, { FC, ReactElement } from 'react'
import { UserEvent } from '../../dtos/UserEventDTO'
import { formatDate } from './utils'

interface Props {
    userEvents: UserEvent[]
}

const EventTableDisplay: FC<Props> = ({ userEvents }): ReactElement => {
    return (
        <ClayTable>
            <ClayTable.Head>
                <ClayTable.Row>
                    <ClayTable.Cell expanded headingCell>Date/Time</ClayTable.Cell>
                    <ClayTable.Cell headingCell>User</ClayTable.Cell>
                    <ClayTable.Cell headingCell>IP Address</ClayTable.Cell>
                    <ClayTable.Cell headingCell>Event Type</ClayTable.Cell>
                </ClayTable.Row>
            </ClayTable.Head>
            <ClayTable.Body>
                {userEvents.map(userEvent =>
                    <ClayTable.Row key={userEvent.userEventId}>
                        <ClayTable.Cell>{formatDate(new Date(userEvent.createDate))}</ClayTable.Cell>
                        <ClayTable.Cell>{`${userEvent.screenName} (${userEvent.userId})`}</ClayTable.Cell>
                        <ClayTable.Cell>{userEvent.ipAddress}</ClayTable.Cell>
                        <ClayTable.Cell>{userEvent.type}</ClayTable.Cell>
                    </ClayTable.Row>
                )}
            </ClayTable.Body>
        </ClayTable>
    )
}

export default EventTableDisplay
