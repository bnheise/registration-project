import React from "react";
import PropTypes from "prop-types";
import { ClayInput } from "@clayui/form";
import { toCamel } from "../utils/utils";

const Input = ({ label, reference, type = "text" }) => {
  const camelLabel = toCamel(label);
  return (
    <div>
      <label htmlFor={camelLabel}>{label}</label>
      <ClayInput
        id={camelLabel}
        ref={reference}
        placeholder={label.toLowerCase()}
        type={type}
      />
    </div>
  );
};

Input.propTypes = {
  label: PropTypes.string.isRequired,
  reference: PropTypes.oneOfType([
    PropTypes.func,
    PropTypes.shape({ current: PropTypes.instanceOf(Element) }),
  ]).isRequired,
  type: PropTypes.oneOf(["text", "password", "email"]),
};

Input.defaultProps = {
  type: "text",
};

export default Input;
