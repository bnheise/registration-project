import React, { FC } from "react";
import ClayDatePicker from "@clayui/date-picker";
import Label from "./Label";
import { toCamel } from "../utils/utils";
import useErrors from "../hooks/useError";
import ClayForm from "@clayui/form";
import { IInputProps } from "./Input";
import { ValueChangeHandler } from '../utils/utils';

interface IDatePickerTypes extends IInputProps {
  handleValueChange?: (value: string, type?: "input" | "time" | "click" | undefined) => void
}

const DatePicker: FC<IDatePickerTypes> = ({
  label,
  value,
  handleValueChange,
  isRequired,
  errors = "",
}) => {
  const camelLabel = toCamel(label);
  const [className, errorUI] = useErrors(errors);
  const endYear = new Date().getFullYear();
  const startYear = endYear - 123;
  return (
    <ClayForm.Group className={className}>
      <Label text={label} isRequired={isRequired} />
      <ClayDatePicker
        id={camelLabel}
        onValueChange={handleValueChange as ValueChangeHandler}
        placeholder="YYYY-MM-DD"
        value={value as string}
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

export default DatePicker;
