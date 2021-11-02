export interface IOption<T> {
  label: string;
  value: T;
}

export type TGenders = "male" | "female";

export const genderOptions: IOption<TGenders>[] = [
  { label: "Male", value: "male" },
  { label: "Female", value: "female" },
];
