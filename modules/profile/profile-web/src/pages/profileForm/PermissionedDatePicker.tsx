import ClayDatePicker from "@clayui/date-picker";
import React, { FC, ReactElement, useState } from "react";

interface Props {
    hasPermission: boolean;
    isEdit: boolean;
    date: string;
    label: string;
    changeHandler: (value: any) => void;
}

const PermissionedDatePicker: FC<Props> = ({
    hasPermission,
    isEdit,
    date,
    label,
    changeHandler
}): ReactElement => {
    const endYear = new Date().getFullYear();
    const startYear = endYear - 123;
    return (
        <>
            {hasPermission ? (
                <>
                    <label>{label}</label>
                    <ClayDatePicker
                        spritemap={`${Liferay.ThemeDisplay.getCDNBaseURL()}/documents/37341/0/icons.svg`}
                        style={{ flexGrow: 0, width: "auto" }}
                        disabled={!isEdit}
                        value={date}
                        years={{
                            end: endYear,
                            start: startYear,
                        }}
                        onValueChange={changeHandler}
                    ></ClayDatePicker>
                </>
            ) : null}
        </>
    );
};

export default PermissionedDatePicker;
