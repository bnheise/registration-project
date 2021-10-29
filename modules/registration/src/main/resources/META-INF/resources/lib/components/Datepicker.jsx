import React from "react";
import PropTypes from "prop-types";
import ClayDatePicker from "@clayui/date-picker";
import Label from "./Label";
import { toCamel } from "../utils/utils";
import useErrors from "../hooks/useError";
import ClayForm from "@clayui/form";

const DatePicker = ({
  label,
  value,
  handleChange,
  isRequired,
  errors = "",
}) => {
  const camelLabel = toCamel(label);
  const [className, errorUI] = useErrors(errors);
  const endYear = new Date().getFullYear();
  const startYear = endYear - 123;
  console.log(startYear);
  console.log(endYear);
  return (
    <ClayForm.Group className={className}>
      <Label text={label} isRequired={isRequired} />
      <ClayDatePicker
        id={camelLabel}
        onValueChange={handleChange}
        placeholder="YYYY-MM-DD"
        value={value}
        spritemap={`${Liferay.ThemeDisplay.getCDNBaseURL()}/documents/37341/0/icons.svg`}
        years={{
          end: endYear,
          start: startYear,
        }}
      />
      {errorUI}
    </ClayForm.Group>
  );
};

DatePicker.propTypes = {
  label: PropTypes.string.isRequired,
  value: PropTypes.string.isRequired,
  handleChange: PropTypes.func.isRequired,
  isRequired: PropTypes.bool,
  errors: PropTypes.oneOfType([
    PropTypes.string,
    PropTypes.arrayOf(PropTypes.string),
  ]),
};

DatePicker.defaultProps = {
  errors: "",
};

export default DatePicker;
