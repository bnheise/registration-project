import React, { FC, ReactElement } from "react";
import RegistrationForm from "./pages/RegistrationForm";
import AlreadyLoggedIn from "./pages/AlreadyLoggedIn";

const RegistrationPortlet: FC = (): ReactElement => {
  return (
    <div>
      <h2>User Registration</h2>
      {Liferay.ThemeDisplay.isSignedIn() ? (
        <AlreadyLoggedIn />
      ) : (
        <RegistrationForm />
      )}
    </div>
  );
};

export default RegistrationPortlet;
