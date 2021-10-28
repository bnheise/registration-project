import React, { useState } from "react";

import FormSection from "../components/FormSection";
import TwoColGroup from "../components/TwoColGroup";
import Select from "../components/Select";
import Datepicker from "../components/Datepicker";
import Input from "../components/Input";
import Checkbox from "../components/Checkbox";
import ClayButton from "@clayui/button";

import RegistrationFormInputs from "../domain/RegistrationFormInputs";
import { genderOptions } from "../domain/genderOptions";
import { genChangeHandlers } from "../utils/utils";
import UserDTO from "../domain/UserDTO";
import AgreedToTermsDTO from "../domain/AgreedToTermsDTO";

export default function RegistrationForm() {
  const [formValues, setFormValues] = useState(new RegistrationFormInputs());
  const handlers = genChangeHandlers(formValues, setFormValues);
  const [agreedToTermsOfUse, setAgreedToTermsOfUse] = useState(false);

  const handleSubmit = () => {
    Liferay.Service(
      "/user/add-user",
      new UserDTO(formValues),
      ({ userId }) => {
        Liferay.Service(
          "/user/update-agreed-to-terms-of-use",
          new AgreedToTermsDTO({ userId, agreedToTermsOfUse })
        );
      },
      (error) => console.log(error)
    );
  };

  return (
    <div>
      <FormSection heading="Basic Info">
        <TwoColGroup>
          <Input
            label="First Name"
            value={formValues.firstName}
            handleChange={handlers.handleFirstNameChange}
          />
          <Input
            label="Last Name"
            value={formValues.lastName}
            handleChange={handlers.handleLastNameChange}
          />
        </TwoColGroup>
        <TwoColGroup>
          <Input
            label="Email"
            value={formValues.emailAddress}
            handleChange={handlers.handleEmailAddressChange}
            type="email"
          />
          <Input
            label="Username"
            value={formValues.screenName}
            handleChange={handlers.handleScreenNameChange}
          />
        </TwoColGroup>
        <TwoColGroup>
          <Select
            label="Gender"
            value={formValues.gender}
            handleChange={handlers.handleGenderChange}
            options={genderOptions}
          />
          <Datepicker
            label="Birthday"
            value={formValues.birthday}
            handleChange={handlers.handleBirthdayChange}
          />
        </TwoColGroup>
        <TwoColGroup>
          <Input
            label="Password"
            value={formValues.password1}
            handleChange={handlers.handlePassword1Change}
            type="password"
          />
          <Input
            label="Confirm Password"
            value={formValues.password2}
            handleChange={handlers.handlePassword2Change}
            type="password"
          />
        </TwoColGroup>
      </FormSection>
      <Checkbox
        value={agreedToTermsOfUse}
        handler={setAgreedToTermsOfUse}
        label="I have read, understand, and agree with the Terms of Use governing my access to and use of the Acme Movie Fanatics web site."
      />
      <ClayButton onClick={handleSubmit} displayType="primary">
        Submit
      </ClayButton>
    </div>
  );
}