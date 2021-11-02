import React from "react";
import ClayForm from "@clayui/form";

const useErrors = (errors: string | string[] | undefined): [string, JSX.Element | null] => {
  const errorArray = errors ? !Array.isArray(errors) ? [errors] : errors : [];
  const className = `${errorArray.length > 0 ? "has-error" : undefined}`;

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
