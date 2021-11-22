import React, { Dispatch, FC, ReactElement, SetStateAction } from "react";
import { UserAddress } from "../../domain/UserAddress";
import ClayTable from "@clayui/table";
import ClayPaginationBar, {
    ClayPaginationBarWithBasicItems,
} from "@clayui/pagination-bar";
import { handlePageChangeRequested } from "./handlers";

interface Props {
    zip: string;
    users: UserAddress[];
    count: number;
    delta: number;
    activePage: number;
    setActivePage: Dispatch<SetStateAction<number>>;
}

const UserSearchResultsDisplay: FC<Props> = ({
    zip,
    users = [],
    count,
    activePage,
    delta,
    setActivePage
}): ReactElement => {
    const titleText =
        !zip || users.length === 0
            ? Liferay.Language.get("noResults")
            : Liferay.Language.get("heading").replace("{0}", zip);
    return (
        <div>
            <h2>{titleText}</h2>
            <ClayTable>
                <ClayTable.Body>
                    {users.map(({ name, screenName, emailAddress, userId }) => (
                        <ClayTable.Row id={userId} key={userId}>
                            <ClayTable.Cell>{name}</ClayTable.Cell>
                            <ClayTable.Cell>{screenName}</ClayTable.Cell>
                            <ClayTable.Cell>{emailAddress}</ClayTable.Cell>
                        </ClayTable.Row>
                    ))}
                </ClayTable.Body>
            </ClayTable>

            {users.length === 0 ? <div /> :
                <ClayPaginationBar>
                    <ClayPaginationBarWithBasicItems
                        showDeltasDropDown={false}
                        totalItems={count}
                        activeDelta={delta}
                        activePage={activePage}
                        spritemap={`${Liferay.ThemeDisplay.getCDNBaseURL()}/documents/37341/0/icons.svg`}
                        onPageChange={(newPage) => {
                            if (newPage !== activePage) {
                                handlePageChangeRequested(delta, newPage, zip)
                                setActivePage(newPage);
                            }
                        }
                        }
                    />
                </ClayPaginationBar>
            }

        </div>
    );
};

export default UserSearchResultsDisplay;
