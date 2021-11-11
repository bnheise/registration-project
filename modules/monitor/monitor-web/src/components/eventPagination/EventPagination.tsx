import ClayPaginationBar from '@clayui/pagination-bar'
import { ClayPaginationWithBasicItems } from '@clayui/pagination';
import React, { FC, ReactElement } from 'react';

interface Props {
    pageStart: number;
    pageEnd: number;
    setPageStart: React.Dispatch<React.SetStateAction<number>>;
    userEventsCount: number;
    pageIncrement: number
}

const EventPagination: FC<Props> = ({ pageStart, pageEnd, setPageStart, userEventsCount, pageIncrement }): ReactElement => {
    return (
        <ClayPaginationBar>
            <ClayPaginationBar.Results>
                Showing {pageStart + 1} to {pageEnd < userEventsCount ? pageEnd : userEventsCount} of {userEventsCount} events
            </ClayPaginationBar.Results>
            <ClayPaginationWithBasicItems
                spritemap={`${Liferay.ThemeDisplay.getCDNBaseURL()}/documents/37341/0/icons.svg`}
                activePage={(pageStart / pageIncrement) + 1}
                ellipsisBuffer={2}
                onPageChange={(number) => {
                    if (number) setPageStart((number - 1) * pageIncrement)
                }}
                totalPages={Math.ceil(userEventsCount / pageIncrement)}
            />
        </ClayPaginationBar>
    )
}

export default EventPagination
