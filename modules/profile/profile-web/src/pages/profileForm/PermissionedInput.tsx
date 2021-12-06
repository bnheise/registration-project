import { ClayInput } from '@clayui/form'
import React, { ChangeEventHandler, FC, ReactElement } from 'react'

interface Props {
    hasPermission: boolean;
    isEdit: boolean;
    label: string;
    value: string | number | readonly string[] | undefined;
    type?: string;
    component?: "input" | "textarea",
    changeHandler?: ((value: any) => void);
}

const PermissionedInput: FC<Props> = ({ hasPermission, isEdit, label, value, component = "input", type = "text", changeHandler }): ReactElement => {
    const handleChange: ChangeEventHandler<HTMLInputElement> = ({ currentTarget: { value: newValue } }): void => { if (changeHandler) changeHandler(newValue) }
    return (
        <>
            {
                hasPermission ?
                    <>
                        <label>{label}</label>
                        <ClayInput component={component} type={type} value={value} disabled={!isEdit} onChange={handleChange} />
                    </> :
                    null
            }
        </>
    )
}

export default PermissionedInput
