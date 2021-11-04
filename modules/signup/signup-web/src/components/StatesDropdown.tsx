import React, { ChangeEventHandler, FC, ReactElement, useEffect, useState } from "react";
import { ClaySelect } from "@clayui/form";
import { RegionDTO } from "../domain/RegionDTO";
import Label from "./Label";

interface IStatesDropdownProps {
    value: number | undefined,
    handleChange?: ChangeEventHandler,
}

const StatesDropdown: FC<IStatesDropdownProps> = ({value, handleChange}): ReactElement => {
  const [states, setStates] = useState<RegionDTO[]>([]);
  useEffect(() => {
      let mounted = true;
        Liferay.Service(
            "/signup.signup/get-states",
            (reponse: RegionDTO[]) => {
              console.log(reponse);
              if (mounted) {
                setStates(reponse);
              }
            },
            (error) => console.log(error)
          );
      return () => {mounted = false};
  }, []);
  
  return (
    <div>
      <Label text="State" isRequired={true} />
      <ClaySelect onChange={handleChange} value={value}>{states.map((state) => (
        <ClaySelect.Option
          key={state.regionId}
          label={state.name}
          value={state.regionId}
        />
      ))}</ClaySelect>
    </div>
  );
};

export default StatesDropdown;
