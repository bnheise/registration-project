import { ClaySelect } from '@clayui/form'
import React, { FC, ReactElement } from 'react'
import { SelectOption } from '../../domain/options'

interface Props {
    hasPermission: boolean;
    isEdit: boolean;
    label: string;
    value: string | number | readonly string[] | undefined;
    options: SelectOption[];
}

const PermissionedSelect: FC<Props> = ({ hasPermission, isEdit, label, value, options }): ReactElement => {
    return (
        <>
            {
                hasPermission ?
                    <>
                        <label>{label}</label>
                        <ClaySelect value={value} disabled={!isEdit} >
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
