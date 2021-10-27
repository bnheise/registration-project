import React from "react";
import PropTypes from "prop-types";
import { ClayInput } from "@clayui/form";
import { toCamel } from "../utils/utils";

const Input = ({ label, value, handleChange, type = "text" }) => {
  const camelLabel = toCamel(label);
  return (
    <div>
      <label htmlFor={camelLabel}>{label}</label>
      <ClayInput
        id={camelLabel}
        value={value}
        onChange={handleChange}
        placeholder={label.toLowerCase()}
        type={type}
      />
    </div>
  );
};

Input.propTypes = {
  label: PropTypes.string.isRequired,
  value: PropTypes.string.isRequired,
  handleChange: PropTypes.func.isRequired,
  type: PropTypes.oneOf(["text", "password", "email"]),
};

Input.defaultProps = {
  type: "text",
};

export default Input;
