import { ClaySelect } from '@clayui/form'
import React, { ChangeEventHandler, FC, ReactElement } from 'react'
import { SelectOption } from '../../domain/options'

interface Props {
    hasPermission: boolean;
    isEdit: boolean;
    label: string;
    value: string | number | readonly string[] | undefined;
    options: SelectOption[];
    changeHandler?: (value: any) => void;
}

const PermissionedSelect: FC<Props> = ({ hasPermission, isEdit, label, value, options, changeHandler }): ReactElement => {
    const handleChange: ChangeEventHandler<HTMLSelectElement> = ({ currentTarget: { value: newValue } }) => { if (changeHandler) changeHandler(newValue) }
    return (
        <>
            {
                hasPermission ?
                    <>
                        <label>{label}</label>
                        <ClaySelect value={value} disabled={!isEdit} onChange={handleChange} >
                            {options.map(option => (<ClaySelect.Option
                                key={option.label}
                                label={option.label}
                                value={option.value}
                            />))}
                        </ClaySelect>
                    </> :
                    null
            }
        </>
    )
}

export default PermissionedSelect
