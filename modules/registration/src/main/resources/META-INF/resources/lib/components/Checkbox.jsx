import React from "react";
import PropTypes from "prop-types";
import { ClayCheckbox } from "@clayui/form";
import { toCamel } from "../utils/utils";

const Checkbox = ({ label, handler, value = false }) => {
  const camelLabel = toCamel(label);
  return (
    <div>
      <label htmlFor={camelLabel}>{label}</label>
      <ClayCheckbox checked={value} onChange={() => handler((val) => !val)} />
    </div>
  );
};

Checkbox.propTypes = {
  label: PropTypes.string.isRequired,
  handler: PropTypes.func.isRequired,
  value: PropTypes.bool.isRequired,
};

export default Checkbox;
