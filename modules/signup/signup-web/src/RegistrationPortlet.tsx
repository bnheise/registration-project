import React from "react";
// import RegistrationForm from "./pages/RegistrationForm";
// import AlreadyLoggedIn from "./pages/AlreadyLoggedIn";

declare global {
  interface Window {
      Liferay: any;
  }
}

interface IProps {
  portletNamespace: string;
  contextPath: string;
  portletElementId: string;
  configuration: any;
}

const Liferay: any = window.Liferay;

const RegistrationPortlet = () => {
  return (
    <div>
      <h2>User Registration</h2>
      {/* {Liferay.ThemeDisplay.isSignedIn() ? (
        <AlreadyLoggedIn />
      ) : (
        <RegistrationForm />
      )} */}
    </div>
  );
};

export default RegistrationPortlet;
