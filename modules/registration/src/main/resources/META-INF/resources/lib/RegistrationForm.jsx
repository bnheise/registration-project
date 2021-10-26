import React from 'react';

import ClayForm, { ClayInput, ClaySelect } from '@clayui/form';
import ClayLayout from '@clayui/layout';
import FormSection from './components/FormSection';
import TwoColGroup from './components/TwoColGroup';

export default function RegistrationForm() {
    return (
        <div>
            <h1>User Registrations</h1>
            <FormSection heading="Basic Info">
                <TwoColGroup>
                    <label htmlFor="basicInput">First Name</label>
                    <ClayInput placeholder="FirstName" type="text"></ClayInput>
                    <label htmlFor="basicInput">Last Name</label>
                    <ClayInput placeholder="LastName" type="text"></ClayInput>
                </TwoColGroup>
                <TwoColGroup>
                    <label htmlFor="basicInput">Email</label>
                    <ClayInput placeholder="Email" type="email"></ClayInput>
                    <label htmlFor="basicInput">Username</label>
                    <ClayInput placeholder="Username" type="text"></ClayInput>
                </TwoColGroup>
            </FormSection>
        </div>
    )
}