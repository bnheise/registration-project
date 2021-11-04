import React, { ChangeEventHandler, FC, ReactElement, useState } from "react";

import FormSection from "../components/FormSection";
import TwoColGroup from "../components/TwoColGroup";
import Select from "../components/Select";
import Datepicker from "../components/Datepicker";
import Input from "../components/Input";
import Checkbox from "../components/Checkbox";
import ClayButton from "@clayui/button";

import RegistrationFormInputs, { IRegistrationFormInputs } from "../domain/RegistrationFormInputs";
import { genderOptions } from "../domain/genderOptions";
import { genChangeHandlers } from "../utils/utils";
import UserDTO, { IUserDTO } from "../domain/UserDTO";
import { ValueChangeHandler } from "../utils/utils";
import ClayLayout from "@clayui/layout";
import StatesDropdown from "../components/StatesDropdown";

export interface IErrors {
  [key: string | symbol]: string | undefined;
}

const RegistrationForm: FC = (): ReactElement => {
  const [formValues, setFormValues] = useState<IRegistrationFormInputs>(
    new RegistrationFormInputs({})
  );
  const handlers = genChangeHandlers(formValues, setFormValues);
  const [agreedToTermsOfUse, setAgreedToTermsOfUse] = useState(false);
  const [errors, setErrors] = useState<IErrors>({});

  const handleSubmit = () => {
    Liferay.Service(
      "/signup.signup/signup",
      new UserDTO(formValues),
      (response) => {
        setErrors({});
        console.log(response);
        console.log("SUCCESS");
      },
      (error) => {
        try {
          setErrors(JSON.parse(error));
        } catch (e) {
          console.log(e);
        }
      }
    );
  };

  return (
    <div>
      <FormSection heading="Basic Info">
        <TwoColGroup>
          <Input
            label="First Name"
            value={formValues.firstName}
            handleChange={handlers.handleFirstNameChange as ChangeEventHandler}
            isRequired={true}
            errors={errors.firstName}
          />
          <Input
            label="Last Name"
            value={formValues.lastName}
            handleChange={handlers.handleLastNameChange as ChangeEventHandler}
            isRequired={true}
            errors={errors.lastName}
          />
        </TwoColGroup>
        <TwoColGroup>
          <Input
            label="Email"
            value={formValues.emailAddress}
            handleChange={
              handlers.handleEmailAddressChange as ChangeEventHandler
            }
            type="email"
            isRequired={true}
            errors={errors.emailAddress}
          />
          <Input
            label="Username"
            value={formValues.screenName}
            handleChange={handlers.handleScreenNameChange as ChangeEventHandler}
            isRequired={true}
            errors={errors.screenName}
          />
        </TwoColGroup>
        <TwoColGroup>
          <Select
            label="Gender"
            value={formValues.gender}
            handleChange={handlers.handleGenderChange as ChangeEventHandler}
            options={genderOptions}
            isRequired={true}
            errors={errors.gender}
          />
          <Datepicker
            label="Birthday"
            value={formValues.birthday}
            handleValueChange={
              handlers.handleBirthdayChange as ValueChangeHandler
            }
            isRequired={true}
            errors={errors.birthday}
          />
        </TwoColGroup>
        <TwoColGroup>
          <Input
            label="Password"
            value={formValues.password1}
            handleChange={handlers.handlePassword1Change as ChangeEventHandler}
            type="password"
            isRequired={true}
            errors={errors.password}
          />
          <Input
            label="Confirm Password"
            value={formValues.password2}
            handleChange={handlers.handlePassword2Change as ChangeEventHandler}
            type="password"
            isRequired={true}
          />
        </TwoColGroup>
      </FormSection>
      <FormSection heading="Phone">
        <TwoColGroup>
          <Input
            label="Home Phone"
            value={formValues.homePhone}
            handleChange={handlers.handleHomePhoneChange as ChangeEventHandler}
            errors={errors.homePhone}
          />
          <Input
            label="Mobile Phone"
            value={formValues.mobilePhone}
            handleChange={
              handlers.handleMobilePhoneChange as ChangeEventHandler
            }
            errors={errors.mobilePhone}
          />
        </TwoColGroup>
      </FormSection>
      <FormSection heading="Billing Address">
        <TwoColGroup>
          <Input
            label="Address Line 1"
            isRequired={true}
            value={formValues.address1}
            handleChange={handlers.handleAddress1Change as ChangeEventHandler}
          />
          <Input
            label="Address Line 2"
            value={formValues.address2}
            handleChange={handlers.handleAddress2Change as ChangeEventHandler}
          />
        </TwoColGroup>
        <TwoColGroup>
          <Input
            label="City"
            isRequired={true}
            value={formValues.city}
            handleChange={handlers.handleCityChange as ChangeEventHandler}
          />
          <StatesDropdown value={formValues.state} handleChange={handlers.handleStateChange as ChangeEventHandler} />
        </TwoColGroup>
        <ClayLayout.Row justify="start">
          <ClayLayout.Col md={4} lg={4} sm={8} xs={12}>
            <Input
              label="Zip Code"
              isRequired={true}
              value={formValues.zip}
              handleChange={handlers.handleZipChange as ChangeEventHandler}
            />
          </ClayLayout.Col>
        </ClayLayout.Row>
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
};

export default RegistrationForm;
