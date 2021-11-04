import React, { ChangeEventHandler, FC } from "react";
import ClayForm, { ClayCheckbox } from "@clayui/form";
import { toCamel } from "../utils/utils";
import useErrors from "../hooks/useError";

interface ICheckboxProps {
  label: string,
  handleChange: ChangeEventHandler,
  value?: boolean,
  errors?: string | string[]
}

const Checkbox: FC<ICheckboxProps> = ({ label, handleChange, value = false, errors }) => {
  const camelLabel = toCamel(label);
  if (typeof value === "string") value = value === "true";
  const [className, errorUI] = useErrors(errors);
  return (
    <ClayForm.Group className={className}>
      <label htmlFor={camelLabel}>{label}</label>
      <ClayCheckbox checked={value} onChange={(event) => {
          event.target.value = event.target.value === "true" ? "false" : "true";
          handleChange(event);
        }} />
      {errorUI}
    </ClayForm.Group>
  );
};

export default Checkbox;
