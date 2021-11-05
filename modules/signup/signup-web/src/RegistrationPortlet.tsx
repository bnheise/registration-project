import React, { FC, ReactElement, useState } from "react";
import RegistrationForm from "./pages/RegistrationForm";
import AlreadyLoggedIn from "./pages/AlreadyLoggedIn";

const RegistrationPortlet: FC = (): ReactElement => {
  const [registrationComplete, setRegistrationComplete] = useState<boolean>(false);

  if (registrationComplete) return (<p>Thank you for registering!</p>)

  return (
    <div>
      <h2>User Registration</h2>
      {Liferay.ThemeDisplay.isSignedIn() ? (
        <AlreadyLoggedIn />
      ) : (
        <RegistrationForm setRegistrationComplete={setRegistrationComplete} />
      )}
    </div>
  );
};

export default RegistrationPortlet;
