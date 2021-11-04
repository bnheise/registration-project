import React, {
  ChangeEventHandler,
  FC,
  ReactElement,
  useEffect,
  useState,
} from "react";
import ClayForm, { ClaySelect } from "@clayui/form";
import { RegionDTO } from "../domain/RegionDTO";
import Label from "./Label";
import useErrors from "../hooks/useError";

interface IStatesDropdownProps {
  value: number | undefined;
  handleChange?: ChangeEventHandler;
  errors?: string | string[];
}

const StatesDropdown: FC<IStatesDropdownProps> = ({
  value,
  handleChange,
  errors
}): ReactElement => {
  const [states, setStates] = useState<RegionDTO[]>([new RegionDTO({regionId: -1, regionCode: "", countryId: -1, name: ""})]);
  const [className, errorUI] = useErrors(errors);
  useEffect(() => {
    let mounted = true;
    Liferay.Service(
      "/signup.signup/get-states",
      (reponse: RegionDTO[]) => {
        if (mounted) {
          setStates([...states, ...reponse]);
        }
      },
      (error) => console.error(error)
    );
    return () => {
      mounted = false;
    };
  }, []);

  return (
    <ClayForm.Group className={className}>
      <Label text="State" isRequired={true} />
      <ClaySelect onChange={handleChange} value={value}>
        {states.map((state) => (
          <ClaySelect.Option
            key={state.regionId}
            label={state.name}
            value={state.regionId}
          />
        ))}
      </ClaySelect>
      {errorUI}
    </ClayForm.Group>
  );
};

export default StatesDropdown;
