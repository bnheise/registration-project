import React from "react";
import PropTypes from "prop-types";
import { ClaySelect } from "@clayui/form";
import Label from "./Label";
import { toCamel } from "../utils/utils";

const Select = ({
  label,
  options,
  value,
  handleChange,
  isRequired = false,
}) => {
  const camelLabel = toCamel(label);
  return (
    <div>
      <Label text={label} isRequired={isRequired} />
      <ClaySelect
        value={value || options[0].value}
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
  isRequired: PropTypes.bool,
};

export default Select;
