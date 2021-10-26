import React from "react";
import { ClayInput } from "@clayui/form";
import { toCamel } from "../utils/utils";

const Input = ({ label, reference, type = "text" }) => {
    const camelLabel = toCamel(label);
    return (
        <div>
            <label htmlFor={camelLabel}>{label}</label>
            <ClayInput
                id={camelLabel}
                ref={reference}
                placeholder={label.toLowerCase()}
                type={type} />
        </div>
    )
}

export default Input;