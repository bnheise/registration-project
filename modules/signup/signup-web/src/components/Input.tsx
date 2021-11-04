import React, { ChangeEventHandler, FC } from "react";
import ClayForm, { ClayInput } from "@clayui/form";
import { toCamel } from "../utils/utils";
import Label from "./Label";
import useErrors from "../hooks/useError";
import CSS from 'csstype';

export interface IInputProps {
  label: string,
  value: string | number | undefined,
  handleChange?: ChangeEventHandler,
  type?: "text" | "password" | "email",
  isRequired?: boolean,
  errors?: string | string[]
  style?: CSS.Properties
}

const Input: FC<IInputProps> = ({
  label,
  value,
  handleChange,
  type = "text",
  isRequired = false,
  errors = "",
  style = {}
}) => {
  const camelLabel = toCamel(label);
  const [className, errorUI] = useErrors(errors);
  return (
    <ClayForm.Group className={className}>
      <Label text={label} isRequired={isRequired} />
      <ClayInput
        id={camelLabel}
        value={value}
        onChange={handleChange}
        placeholder={label.toLowerCase()}
        type={type}
        style={style}
      />
      {errorUI}
    </ClayForm.Group>
  );
};

export default Input;
