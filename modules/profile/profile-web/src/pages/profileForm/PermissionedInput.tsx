import { ClayInput } from '@clayui/form'
import React, { FC, ReactElement } from 'react'

interface Props {
    hasPermission: boolean;
    isEdit: boolean;
    label: string;
    value: string | number | readonly string[] | undefined;
}

const PermissionedInput: FC<Props> = ({ hasPermission, isEdit, label, value }): ReactElement => {
    return (
        <>
            {
                hasPermission ?
                    <>
                        <label>{label}</label>
                        <ClayInput value={value} disabled={!isEdit} />
                    </> :
                    null
            }
        </>
    )
}

export default PermissionedInput
