import React, { FC, ReactChildren } from "react";
import PropTypes from "prop-types";
import ClayForm from "@clayui/form";

interface IFormSectionProps {
  heading: string,
}

const FormSection: FC<IFormSectionProps> = ({ heading, children }) => {
  return (
    <div>
      <h3>{heading}</h3>
      <ClayForm>{children}</ClayForm>
    </div>
  );
};

export default FormSection;
