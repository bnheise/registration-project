import { ClayInput } from '@clayui/form';
import React, { FC } from 'react'

interface Props {
    hasPermission: boolean;
}

const PermissionedInputGroup: FC<Props> = ({ hasPermission, children }) => {
    return (
        <>
            {
                hasPermission ?
                    <ClayInput.Group>
                        {children}
                    </ClayInput.Group>
                    :
                    null
            }
        </>
    )
}

export default PermissionedInputGroup;
