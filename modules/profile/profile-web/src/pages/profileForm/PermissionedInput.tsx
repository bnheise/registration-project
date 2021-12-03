import { ClayInput } from '@clayui/form'
import React, { FC, ReactElement } from 'react'

interface Props {
    hasPermission: boolean;
    isEdit: boolean;
    label: string;
    value: string | number | readonly string[] | undefined;
    type?: string;
    component?: "input" | "textarea"
}

const PermissionedInput: FC<Props> = ({ hasPermission, isEdit, label, value, component = "input", type = "text" }): ReactElement => {
    return (
        <>
            {
                hasPermission ?
                    <>
                        <label>{label}</label>
                        <ClayInput component={component} type={type} value={value} disabled={!isEdit} />
                    </> :
                    null
            }
        </>
    )
}

export default PermissionedInput
