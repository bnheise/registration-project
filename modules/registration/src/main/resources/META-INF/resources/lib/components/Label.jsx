import React from "react";
import PropTypes from "prop-types";
import { toCamel } from "../utils/utils";

const Label = ({ text, isRequired = false }) => {
  const camelText = toCamel(text);
  const requiredMarker = isRequired ? (
    <span style={{ color: "red" }}>*</span>
  ) : null;
  return (
    <label htmlFor={camelText}>
      {text}
      {requiredMarker}
    </label>
  );
};

Label.propTypes = {
  text: PropTypes.string.isRequired,
  isRequired: PropTypes.bool,
};

export default Label;
