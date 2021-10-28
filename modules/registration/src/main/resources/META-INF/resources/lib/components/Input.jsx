import React from "react";
import PropTypes from "prop-types";
import { ClayInput } from "@clayui/form";
import { toCamel } from "../utils/utils";
import Label from "./Label";

const Input = ({
  label,
  value,
  handleChange,
  type = "text",
  isRequired = false,
}) => {
  const camelLabel = toCamel(label);

  return (
    <div>
      <Label text={label} isRequired={isRequired} />
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
  isRequired: PropTypes.bool,
};

Input.defaultProps = {
  type: "text",
  isRequired: false,
};

export default Input;
