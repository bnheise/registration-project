import React from "react";
import PropTypes from "prop-types";
import { ClaySelect } from "@clayui/form";
import { toCamel } from "../utils/utils";

const Select = ({ label, options, value, handleChange }) => {
  const camelLabel = toCamel(label);
  return (
    <div>
      <label htmlFor={camelLabel}>{label}</label>
      <ClaySelect
        value={value}
        onChange={handleChange}
        id={camelLabel}
        aria-label="Select Label"
      >
        {options.map((item) => (
          <ClaySelect.Option
            key={item.value}
            label={item.label}
            value={item.value}
          />
        ))}
      </ClaySelect>
    </div>
  );
};

Select.propTypes = {
  label: PropTypes.string.isRequired,
  value: PropTypes.string.isRequired,
  options: PropTypes.arrayOf(
    PropTypes.shape({
      label: PropTypes.string,
      value: PropTypes.string.isRequired,
    })
  ).isRequired,
  handleChange: PropTypes.func.isRequired,
};

export default Select;
