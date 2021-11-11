import ClayPaginationBar from '@clayui/pagination-bar'
import React, { FC, ReactElement } from 'react';

interface Props {
    pageStart: number;
    pageEnd: number;
    setPageStart: React.Dispatch<React.SetStateAction<number>>;
    userEventsCount: number;
}

const EventPagination: FC<Props> = ({ pageStart, pageEnd, setPageStart, userEventsCount }): ReactElement => {
    return (
        <ClayPaginationBar>
            <ClayPaginationBar.Results>Showing {pageStart} to {pageEnd < userEventsCount ? pageEnd : userEventsCount} of {userEventsCount} events</ClayPaginationBar.Results>
        </ClayPaginationBar>
    )
}

export default EventPagination
