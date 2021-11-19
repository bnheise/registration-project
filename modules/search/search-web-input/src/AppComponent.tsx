import React, {
	FC,
	ReactElement,
} from "react";

import { PortletProps } from ".";
import SearchForm from "./components/SearchForm/SearchForm";

const AppComponent: FC<PortletProps> = ({
	portletElementId,
	portletNamespace,
	contextPath,
	configuration,
}: PortletProps): ReactElement => {
	return (
		<div>
			<p>{Liferay.Language.get("instructions")}</p>
			<SearchForm />
		</div>
	);
};

export default AppComponent;
