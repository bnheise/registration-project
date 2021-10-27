import React, { useState } from "react";
import PropTypes from "prop-types";
import ClayDatePicker from "@clayui/date-picker";
import { toCamel } from "../utils/utils";

const DatePicker = ({ label, reference }) => {
  const [value, setValue] = useState("");
  const handleChange = ({ target: { value: inputValue } }) => {
    setValue(inputValue);
  };
  const camelLabel = toCamel(label);

  return (
    <div>
      <label htmlFor={camelLabel}>{label}</label>
      <ClayDatePicker
        id={camelLabel}
        onValueChange={setValue}
        placeholder="YYYY-MM-DD"
        value={value}
        onChange={handleChange}
        ref={reference}
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
  reference: PropTypes.oneOfType([
    PropTypes.func,
    PropTypes.shape({ current: PropTypes.instanceOf(Element) }),
  ]).isRequired,
};

export default DatePicker;
