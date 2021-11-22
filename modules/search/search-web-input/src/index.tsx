import React, { FC } from "react";
import { Liferay } from "liferay-types/src/globalObject/Liferay";
import ReactDOM from "react-dom";

import AppComponent from "./AppComponent";

/**
 * This is the main entry point of the portlet.
 *
 * See https://tinyurl.com/js-ext-portlet-entry-point for the most recent
 * information on the signature of this function.
 *
 * @param  {Object} params a hash with values of interest to the portlet
 * @return {void}
 */

export interface PortletProps {
  portletNamespace: string;
  contextPath: string;
  portletElementId: string;
  configuration: object;
}

declare global {
  const Liferay: Liferay;
}

const main = ({
  portletNamespace,
  contextPath,
  portletElementId,
  configuration,
}: PortletProps) => {
  ReactDOM.render(
    <AppComponent
      portletNamespace={portletNamespace}
      contextPath={contextPath}
      portletElementId={portletElementId}
      configuration={configuration}
    />,
    document.getElementById(portletElementId)
  );
};

export default main;
