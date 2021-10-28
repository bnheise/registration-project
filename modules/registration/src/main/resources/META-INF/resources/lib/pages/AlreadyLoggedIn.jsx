import React from "react";

const AlreadyLoggedIn = () => {
  return (
    <div>
      <p>You are already logged in as {Liferay.ThemeDisplay.getUserName()}.</p>
    </div>
  );
};

export default AlreadyLoggedIn;
