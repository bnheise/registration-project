import React from "react";
import PropTypes from "prop-types";
import ClayForm, { ClayInput } from "@clayui/form";
import { toCamel } from "../utils/utils";
import Label from "./Label";

const Input = ({
  label,
  value,
  handleChange,
  type = "text",
  isRequired = false,
  errors = "",
}) => {
  const camelLabel = toCamel(label);
  errors = typeof errors === "string" && errors.length > 0 ? [errors] : errors;
  return (
    <ClayForm.Group className={`${errors.length > 0 ? "has-error" : null}`}>
      <Label text={label} isRequired={isRequired} />
      <ClayInput
        id={camelLabel}
        value={value}
        onChange={handleChange}
        placeholder={label.toLowerCase()}
        type={type}
      />
      {errors.length > 0 ? (
        <ClayForm.FeedbackGroup>
          {errors.map((error, index) => (
            <ClayForm.FeedbackItem key={index}>{error}</ClayForm.FeedbackItem>
          ))}
        </ClayForm.FeedbackGroup>
      ) : null}
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
