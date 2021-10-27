import React from "react";
import PropTypes from "prop-types";
import ClayForm, { ClayInput } from "@clayui/form";
import ClayLayout from "@clayui/layout";

const TwoColGroup = ({ children }) => {
  if (children.length > 2)
    throw new Error("TwoColGroup only accepts two child components");

  const [input1, input2] = children;
  return (
    <ClayForm.Group className="form-group-sm">
      <ClayLayout.Row justify="start">
        <ClayLayout.Col md={4} lg={4} sm={8} xs={12}>
          {input1}
        </ClayLayout.Col>
        <ClayLayout.Col md={4} lg={4} sm={8} xs={12}>
          {input2}
        </ClayLayout.Col>
      </ClayLayout.Row>
    </ClayForm.Group>
  );
};

TwoColGroup.propTypes = {
  children: PropTypes.oneOfType([
    PropTypes.arrayOf(PropTypes.node),
    PropTypes.node,
  ]),
};

TwoColGroup.defaultProps = {
  children: [ClayInput, ClayInput],
};

export default TwoColGroup;
