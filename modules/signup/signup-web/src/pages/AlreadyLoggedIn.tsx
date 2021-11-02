import React, { FC, ReactElement } from 'react';

const AlreadyLoggedIn: FC = (): ReactElement => {
  return (
    <div>
      <p>You are already logged in as {Liferay.ThemeDisplay.getUserName()}.</p>
    </div>
  );
};

export default AlreadyLoggedIn;
