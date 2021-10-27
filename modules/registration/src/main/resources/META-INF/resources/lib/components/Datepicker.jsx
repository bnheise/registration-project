import React from "react";
import PropTypes from "prop-types";
import ClayDatePicker from "@clayui/date-picker";
import { toCamel } from "../utils/utils";

const DatePicker = ({ label, value, handleChange }) => {
  const camelLabel = toCamel(label);

  return (
    <div>
      <label htmlFor={camelLabel}>{label}</label>
      <ClayDatePicker
        id={camelLabel}
        onValueChange={handleChange}
        placeholder="YYYY-MM-DD"
        value={value}
        spritemap={`${Liferay.ThemeDisplay.getCDNBaseURL()}/documents/37341/0/icons.svg`}
        years={{
          end: 2024,
          start: 1997,
        }}
      />
    </div>
  );
};

DatePicker.propTypes = {
  label: PropTypes.string.isRequired,
  value: PropTypes.string.isRequired,
  handleChange: PropTypes.func.isRequired,
};

export default DatePicker;
