import React, { FC } from "react";
import PropTypes from "prop-types";
import { ClayInput } from "@clayui/form";
import ClayLayout from "@clayui/layout";

interface ITwoColGroup {
  children: [JSX.Element, JSX.Element]
}

const TwoColGroup: FC<ITwoColGroup> = ({ children }) => {
  if (children && children.length > 2)
    throw new Error("TwoColGroup only accepts two child components");

  const [input1, input2] = children;
  return (
    <ClayLayout.Row justify="start">
      <ClayLayout.Col md={4} lg={4} sm={8} xs={12}>
        {input1}
      </ClayLayout.Col>
      <ClayLayout.Col md={4} lg={4} sm={8} xs={12}>
        {input2}
      </ClayLayout.Col>
    </ClayLayout.Row>
  );
};

export default TwoColGroup;
