import React from "react";
import { ClaySelect } from '@clayui/form';
import { toCamel } from "../utils/utils";

const Select = ({ label, options, reference }) => {
    const camelLabel = toCamel(label);
    return (
        <div>
            <label htmlFor={camelLabel}>{label}</label>
            <ClaySelect ref={reference} id={camelLabel} aria-label="Select Label" >
                {options.map(item => (
                    <ClaySelect.Option
                        key={item.value}
                        label={item.label}
                        value={item.value}
                    />
                ))}
            </ClaySelect>
        </div>
    )
}

export default Select;