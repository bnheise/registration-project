import React, { FC, ReactElement } from "react";
import ClayForm from "@clayui/form";

interface IFormSectionProps {
  heading: string,
}

const FormSection: FC<IFormSectionProps> = ({ heading, children }): ReactElement => {
  return (
    <div>
      <h3>{heading}</h3>
      <ClayForm>{children}</ClayForm>
    </div>
  );
};

export default FormSection;
