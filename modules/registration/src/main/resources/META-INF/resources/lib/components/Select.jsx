import React from "react";
import PropTypes from "prop-types";
import ClayForm, { ClaySelect } from "@clayui/form";
import Label from "./Label";
import { toCamel } from "../utils/utils";
import useErrors from "../hooks/useError";

const Select = ({
  label,
  options,
  value,
  handleChange,
  isRequired = false,
  errors = "",
}) => {
  const camelLabel = toCamel(label);
  const [className, errorUI] = useErrors(errors);
  return (
    <ClayForm.Group className={className}>
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
      {errorUI}
    </ClayForm.Group>
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
  errors: PropTypes.oneOfType([
    PropTypes.string,
    PropTypes.arrayOf(PropTypes.string),
  ]),
};

export default Select;
