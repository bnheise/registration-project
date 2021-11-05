import React, { FC } from "react";
import ClayForm, { ClaySelect } from "@clayui/form";
import Label from "./Label";
import { toCamel } from "../utils/utils";
import useErrors from "../hooks/useError";
import { IInputProps } from "./Input";
import { IOption } from '../domain/genderOptions';

interface ISelectProps extends IInputProps {
  options: IOption<any>[]
}

const Select: FC<ISelectProps> = ({
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

export default Select;
