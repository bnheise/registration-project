import React from "react";
import ClayForm from "@clayui/form";

const useErrors = (errors) => {
  if (!errors) return ["", null];

  const errorArray = !Array.isArray(errors) ? [errors] : errors;
  const className = `${errorArray.length > 0 ? "has-error" : null}`;

  const errorUi =
    errorArray.length > 0 ? (
      <ClayForm.FeedbackGroup>
        {errorArray.map((error, index) => (
          <ClayForm.FeedbackItem key={index}>{error}</ClayForm.FeedbackItem>
        ))}
      </ClayForm.FeedbackGroup>
    ) : null;
  return [className, errorUi];
};

export default useErrors;
