import React from "react";
import ReactDOM from "react-dom";

import RegistrationPortlet from "./RegistrationPortlet";

export default function (elementId) {
  ReactDOM.render(<RegistrationPortlet />, document.getElementById(elementId));
}
