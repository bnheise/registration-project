import React from 'react';

import { ClayInput } from '@clayui/form';
import FormSection from './components/FormSection';
import TwoColGroup from './components/TwoColGroup';
import GenderSelect from './components/GenderSelect';
import BirthdaySelector from './components/BirthdaySelector';

export default function RegistrationForm() {
    return (
        <div>
            <h2>User Registration</h2>
            <FormSection heading="Basic Info">
                <TwoColGroup>
                    <label htmlFor="firstName">First Name</label>
                    <ClayInput id="firstName" placeholder="FirstName" type="text"></ClayInput>
                    <label htmlFor="lastName">Last Name</label>
                    <ClayInput id="lastName" placeholder="LastName" type="text"></ClayInput>
                </TwoColGroup>
                <TwoColGroup>
                    <label htmlFor="email">Email</label>
                    <ClayInput id="email" placeholder="Email" type="email"></ClayInput>
                    <label htmlFor="username">Username</label>
                    <ClayInput id="username" placeholder="Username" type="text"></ClayInput>
                </TwoColGroup>
                <TwoColGroup>
                    <label htmlFor="genderSelect">Gender</label>
                    <GenderSelect id="genderSelect" />
                    <label htmlFor="birthday">Birthday</label>
                    <BirthdaySelector />
                </TwoColGroup>
            </FormSection>
        </div>
    )
}