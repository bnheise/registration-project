import React, { FC, ReactElement, useEffect, useState } from 'react'
import { UserAddress } from '../../domain/UserAddress';
import { handleUsersReceived, handleZipReceived } from './handlers';
import UserSearchResultsDisplay from './UserSearchResultsDisplay';


const UserSearchResults: FC = (): ReactElement => {
    const [zip, setZip] = useState<string>("");
    const [users, setUsers] = useState<UserAddress[]>([]);
    useEffect(handleUsersReceived(setUsers));
    useEffect(handleZipReceived(setZip));
    return (
        <div>
            <UserSearchResultsDisplay zip={zip} users={users} />
        </div>
    )
}

export default UserSearchResults;