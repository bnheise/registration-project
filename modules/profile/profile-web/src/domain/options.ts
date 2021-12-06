import {
  GetAllGenresRequest,
  GET_ALL_GENRES,
} from "../api/UserProfile/getAllGenres";
import { Genre } from "./Genre";

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
