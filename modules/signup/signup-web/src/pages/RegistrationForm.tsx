import React, { ChangeEventHandler, FC, ReactElement, useState } from "react";

import FormSection from "../components/FormSection";
import TwoColGroup from "../components/TwoColGroup";
import Select from "../components/Select";
import Datepicker from "../components/Datepicker";
import Input from "../components/Input";
import Checkbox from "../components/Checkbox";
import ClayButton from "@clayui/button";

import RegistrationFormInputs, {
  IRegistrationFormInputs,
} from "../domain/RegistrationFormInputs";
import { genderOptions } from "../domain/genderOptions";
import { genChangeHandlers, ValueChangeHandler } from "../utils/utils";
import UserDTO from "../domain/UserDTO";
import ClayLayout from "@clayui/layout";
import ClayLink from "@clayui/link";
import StatesDropdown from "../components/StatesDropdown";
import { securityQuestionOptions } from "../domain/SecurityQuestions";

export interface IErrors {
  [key: string | symbol]: string | undefined;
}

const RegistrationForm: FC = (): ReactElement => {
  const [formValues, setFormValues] = useState<IRegistrationFormInputs>(
    new RegistrationFormInputs({})
  );
  const handlers = genChangeHandlers(formValues, setFormValues);
  const [errors, setErrors] = useState<IErrors>({});

  const handleSubmit = () => {
    Liferay.Service(
      "/signup.signup/signup",
      new UserDTO(formValues),
      (response) => {
        setErrors({});
      },
      (error) => {
        try {
          setErrors(JSON.parse(error));
        } catch (e) {
          console.error(e);
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
            errors={errors.address1}
          />
          <Input
            label="Address Line 2"
            value={formValues.address2}
            handleChange={handlers.handleAddress2Change as ChangeEventHandler}
            errors={errors.address2}
          />
        </TwoColGroup>
        <TwoColGroup>
          <Input
            label="City"
            isRequired={true}
            value={formValues.city}
            handleChange={handlers.handleCityChange as ChangeEventHandler}
            errors={errors.city}
          />
          <StatesDropdown
            errors={errors.state}
            value={formValues.state}
            handleChange={handlers.handleStateChange as ChangeEventHandler}
          />
        </TwoColGroup>
        <ClayLayout.Row justify="start">
          <ClayLayout.Col md={4} lg={4} sm={8} xs={12}>
            <Input
              label="Zip Code"
              isRequired={true}
              value={formValues.zip}
              handleChange={handlers.handleZipChange as ChangeEventHandler}
              errors={errors.zip}
            />
          </ClayLayout.Col>
        </ClayLayout.Row>
      </FormSection>
      <FormSection heading="Misc.">
        <ClayLayout.Row justify="start">
          <ClayLayout.Col md={8} lg={8} sm={8} xs={12}>
            <Select
              label="Security Question"
              value={formValues.securityQuestion}
              options={securityQuestionOptions}
              handleChange={
                handlers.handleSecurityQuestionChange as ChangeEventHandler
              }
              isRequired={true}
              errors={errors.securityQuestion}
            />
            <Input
              label="Answer"
              isRequired={true}
              value={formValues.securityAnswer}
              handleChange={
                handlers.handleSecurityAnswerChange as ChangeEventHandler
              }
              errors={errors.securityAnswer}
            />
          </ClayLayout.Col>
        </ClayLayout.Row>
        <Checkbox
          value={formValues.agreedToTerms}
          handleChange={
            handlers.handleAgreedToTermsChange as ChangeEventHandler
          }
          label={
            <div>
              "I have read, understand, and agree with the{" "}
              <ClayLink
                target="_blank"
                href={`${Liferay.ThemeDisplay.getCDNBaseURL()}/web/amf/terms-of-use`}
              >
                Terms of Use
              </ClayLink>{" "}
              governing my access to and use of the Acme Movie Fanatics web
              site."
            </div>
          }
          errors={errors.agreedToTerms}
        />
      </FormSection>
      <ClayButton onClick={handleSubmit} displayType="primary">
        Submit
      </ClayButton>
    </div>
  );
};

export default RegistrationForm;
