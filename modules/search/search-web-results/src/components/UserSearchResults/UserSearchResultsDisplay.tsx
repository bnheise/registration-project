import React, { FC, ReactElement } from 'react'
import { UserAddress } from '../../domain/UserAddress';

interface Props {
    zip: string;
    users: UserAddress[]
}

const UserSearchResultsDisplay: FC<Props> = ({ zip, users = [] }): ReactElement => {
    console.log(users)
    const titleText = !zip || users.length === 0 ? Liferay.Language.get("noResults") : Liferay.Language.get("heading").replace("{0}", zip);
    return (
        <div>
            <h2>{titleText}</h2>
        </div>
    )
}

export default UserSearchResultsDisplay
