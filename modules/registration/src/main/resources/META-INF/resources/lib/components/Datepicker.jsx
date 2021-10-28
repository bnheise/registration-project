import React from "react";
import PropTypes from "prop-types";
import ClayDatePicker from "@clayui/date-picker";
import Label from "./Label";
import { toCamel } from "../utils/utils";

const DatePicker = ({ label, value, handleChange, isRequired }) => {
  const camelLabel = toCamel(label);

  return (
    <div>
      <Label text={label} isRequired={isRequired} />
      <ClayDatePicker
        id={camelLabel}
        onValueChange={handleChange}
        placeholder="YYYY-MM-DD"
        value={value}
        spritemap={`${Liferay.ThemeDisplay.getCDNBaseURL()}/documents/37341/0/icons.svg`}
        years={{
          end: Number(new Date().getFullYear),
          start: Number(new Date().getFullYear) - 123,
        }}
      />
    </div>
  );
};

DatePicker.propTypes = {
  label: PropTypes.string.isRequired,
  value: PropTypes.string.isRequired,
  handleChange: PropTypes.func.isRequired,
  isRequired: PropTypes.bool,
};

export default DatePicker;
