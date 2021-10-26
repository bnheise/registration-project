import React from "react";
import { ClaySelect } from '@clayui/form';

export default function GenderSelect() {
    const options = [
        { label: "Male", value: "1" },
        { label: "Female", value: "2" }
    ];
    return (
        <ClaySelect aria-label="Select Label" id="mySelectId">
            {options.map(item => (
                <ClaySelect.Option
                    key={item.value}
                    label={item.label}
                    value={item.value}
                />
            ))}
        </ClaySelect>
    )
}