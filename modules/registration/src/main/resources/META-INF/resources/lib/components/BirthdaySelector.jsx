import React, { useState } from "react";

import ClayDatePicker from '@clayui/date-picker';

export default function BirthdaySelector() {
    const [value, setValue] = useState("");
    const handleChange = ({ target: { value: inputValue } }) => {
        setValue(inputValue)
    }

    return (
        <ClayDatePicker
            onValueChange={setValue}
            placeholder="YYYY-MM-DD"
            value={value}
            onChange={handleChange}
            spritemap="http://localhost:8080/documents/37341/0/icons.svg"
            years={{
                end: 2024,
                start: 1997
            }}
        />
    )
}