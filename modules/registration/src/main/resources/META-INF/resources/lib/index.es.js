import React from "react";
import ReactDOM from "react-dom";

import RegistrationForm from "./RegistrationForm";

export default function (elementId) {
  ReactDOM.render(<RegistrationForm />, document.getElementById(elementId));
}
