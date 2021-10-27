import React from "react";
import PropTypes from "prop-types";
import ClayForm from "@clayui/form";

const FormSection = ({ heading, children }) => {
  return (
    <div>
      <h3>{heading}</h3>
      <ClayForm>{children}</ClayForm>
    </div>
  );
};

FormSection.propTypes = {
  heading: PropTypes.string.isRequired,
  children: PropTypes.oneOfType([
    PropTypes.arrayOf(PropTypes.node),
    PropTypes.node,
  ]),
};

FormSection.defaultProps = {
  children: ClayForm,
};

export default FormSection;
