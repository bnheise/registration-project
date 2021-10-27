import React, { useRef } from "react";

import FormSection from "./components/FormSection";
import TwoColGroup from "./components/TwoColGroup";
import Select from "./components/Select";
import Datepicker from "./components/Datepicker";
import Input from "./components/Input";
import ClayButton from "@clayui/button";

export default function RegistrationForm() {
  const genderOptions = [
    { label: "Male", value: "male" },
    { label: "Female", value: "female" },
  ];
  const firstNameRef = useRef(null);
  const lastNameRef = useRef(null);
  const emailRef = useRef(null);
  const usernameRef = useRef(null);
  const birthdayRef = useRef(null);
  const genderRef = useRef(null);
  const passwordRef = useRef(null);
  const confrimPasswordRef = useRef(null);

  const handleClick = () => {
    console.log(firstNameRef.current.value);
    console.log(lastNameRef.current.value);
    console.log(emailRef.current.value);
    console.log(usernameRef.current.value);
    console.log(birthdayRef.current.value);
    console.log(genderRef.current.value);
    console.log(passwordRef.current.value);
    console.log(confrimPasswordRef.current.value);
  };

  return (
    <div>
      <h2>User Registration</h2>
      <FormSection heading="Basic Info">
        <TwoColGroup>
          <Input label="First Name" reference={firstNameRef} />
          <Input label="Last Name" reference={lastNameRef} />
        </TwoColGroup>
        <TwoColGroup>
          <Input label="Email" reference={emailRef} type="email" />
          <Input label="Username" reference={usernameRef} />
        </TwoColGroup>
        <TwoColGroup>
          <Select
            label="Gender"
            options={genderOptions}
            reference={genderRef}
          />
          <Datepicker label="Birthday" reference={birthdayRef} />
        </TwoColGroup>
        <TwoColGroup>
          <Input label="Password" reference={passwordRef} type="password" />
          <Input
            label="Confirm Password"
            reference={confrimPasswordRef}
            type="password"
          />
        </TwoColGroup>
      </FormSection>
      <ClayButton onClick={handleClick} displayType="primary">
        Submit
      </ClayButton>
    </div>
  );
}
