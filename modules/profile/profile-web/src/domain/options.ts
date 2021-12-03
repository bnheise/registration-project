export interface SelectOption {
  label: string;
  value: string | number;
}

export const genderOptions: SelectOption[] = [
  {
    label: "Male",
    value: "male",
  },
  {
    label: "Female",
    value: "female",
  },
];
