import React, { FC } from "react";
import { ClayCheckbox } from "@clayui/form";
import { toCamel } from "../utils/utils";

interface ICheckboxProps {
  label: string,
  handler: React.Dispatch<React.SetStateAction<boolean>>
  value: boolean
}

const Checkbox: FC<ICheckboxProps> = ({ label, handler, value = false }) => {
  const camelLabel = toCamel(label);
  return (
    <div>
      <label htmlFor={camelLabel}>{label}</label>
      <ClayCheckbox checked={value} onChange={() => handler((val) => !val)} />
    </div>
  );
};

export default Checkbox;
