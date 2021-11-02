import React, { FC, ReactElement } from "react";
import PropTypes from "prop-types";
import { toCamel } from "../utils/utils";

interface ILabelProps {
  text: string,
  isRequired?: boolean
}

const Label: FC<ILabelProps> = ({ text, isRequired = false }): ReactElement => {
  const camelText = toCamel(text);
  const requiredMarker = isRequired ? (
    <span style={{ color: "red" }}>*</span>
  ) : null;
  return (
    <label htmlFor={camelText}>
      {text}
      {requiredMarker}
    </label>
  );
};

export default Label;
