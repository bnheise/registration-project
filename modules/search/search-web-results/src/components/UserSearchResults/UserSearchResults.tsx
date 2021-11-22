import React, { FC, ReactElement, useEffect, useState } from 'react'
import { UserAddress } from '../../domain/UserAddress';
import { handleSearchResultReceived } from './handlers';
import UserSearchResultsDisplay from './UserSearchResultsDisplay';


const UserSearchResults: FC = (): ReactElement => {
    const [zip, setZip] = useState<string>("");
    const [count, setCount] = useState<number>(0);
    const [users, setUsers] = useState<UserAddress[]>([]);
    const [delta] = useState<number>(5);
    const [activePage, setActivePage] = useState<number>(1);

    useEffect(handleSearchResultReceived(setUsers, setZip, setCount))
    return (
        <div>
            <UserSearchResultsDisplay count={count} zip={zip} users={users} activePage={activePage} delta={delta} setActivePage={setActivePage} />
        </div>
    )
}

export default UserSearchResults;