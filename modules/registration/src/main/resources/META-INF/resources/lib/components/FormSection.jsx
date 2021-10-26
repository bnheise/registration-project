import React from "react";

import ClayForm from '@clayui/form';

export default function FormSection({ heading, children }) {
    return (
        <div>
            <h3>{heading}</h3>
            <ClayForm>
                {children}
            </ClayForm>
        </div>
    )
}