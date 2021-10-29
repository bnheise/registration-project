import React from "react";
import PropTypes from "prop-types";
import ClayForm, { ClayInput } from "@clayui/form";
import { toCamel } from "../utils/utils";
import Label from "./Label";
import useErrors from "../hooks/useError";

const Input = ({
  label,
  value,
  handleChange,
  type = "text",
  isRequired = false,
  errors = "",
}) => {
  const camelLabel = toCamel(label);
  const [className, errorUI] = useErrors(errors);
  return (
    <ClayForm.Group className={className}>
      <Label text={label} isRequired={isRequired} />
      <ClayInput
        id={camelLabel}
        value={value}
        onChange={handleChange}
        placeholder={label.toLowerCase()}
        type={type}
      />
      {errorUI}
    </ClayForm.Group>
  );
};

Input.propTypes = {
  label: PropTypes.string.isRequired,
  value: PropTypes.string.isRequired,
  handleChange: PropTypes.func.isRequired,
  type: PropTypes.oneOf(["text", "password", "email"]),
  isRequired: PropTypes.bool,
  errors: PropTypes.oneOfType([
    PropTypes.string,
    PropTypes.arrayOf(PropTypes.string),
  ]),
};

Input.defaultProps = {
  type: "text",
  isRequired: false,
  errors: "",
};

export default Input;
