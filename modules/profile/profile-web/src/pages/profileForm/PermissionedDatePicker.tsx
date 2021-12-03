import ClayDatePicker from "@clayui/date-picker";
import React, { FC, ReactElement, useState } from "react";

interface Props {
    hasPermission: boolean;
    isEdit: boolean;
    date: string;
    label: string;
}

const PermissionedDatePicker: FC<Props> = ({
    hasPermission,
    isEdit,
    date,
    label,
}): ReactElement => {
    const [value, setValue] = useState<string>(date);
    return (
        <>
            {hasPermission ? (
                <>
                    <label>{label}</label>
                    <ClayDatePicker
                        spritemap={`${Liferay.ThemeDisplay.getCDNBaseURL()}/documents/37341/0/icons.svg`}
                        style={{ flexGrow: 0, width: "auto" }}
                        disabled={!isEdit}
                        value={value}
                        onValueChange={setValue}
                    ></ClayDatePicker>
                </>
            ) : null}
        </>
    );
};

export default PermissionedDatePicker;
