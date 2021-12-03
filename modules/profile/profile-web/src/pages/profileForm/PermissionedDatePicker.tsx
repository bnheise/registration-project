import ClayDatePicker from '@clayui/date-picker'
import React, { FC, ReactElement, useState } from 'react'

interface Props {
    hasPermission: boolean;
    isEdit: boolean;
    date: string;
    label: string;
}

const PermissionedDatePicker: FC<Props> = ({ hasPermission, isEdit, date, label }): ReactElement => {
    const [value, setValue] = useState<string>(date);
    return (
        <>
            {
                hasPermission ?
                    <>

                        <ClayDatePicker disabled={!isEdit} value={value} onValueChange={setValue} ><label>{label}</label></ClayDatePicker>
                    </> :
                    null
            }
        </>
    )
}

export default PermissionedDatePicker