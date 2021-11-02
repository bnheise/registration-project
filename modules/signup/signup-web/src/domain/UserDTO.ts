import { isValidDate } from "../utils/utils";
import { TGenders } from "./genderOptions";

export interface IUserDTO {
  screenName: string;
  emailAddress: string;
  firstName: string;
  lastName: string;
  gender: TGenders;
  birthday: string;
  password1: string;
  password2: string;
  homePhone?: string;
  mobilePhone?: string;
}

export default class UserDTO {
  password1: string;
  password2: string;
  screenName: string;
  emailAddress: string;
  firstName: string;
  lastName: string;
  male: boolean;
  birthdayMonth: number;
  birthdayDay: number;
  birthdayYear: number;
  addresses: any[];
  homePhone?: string;
  mobilePhone?: string;

  constructor({
    screenName,
    emailAddress,
    firstName,
    lastName,
    gender,
    birthday,
    password1,
    password2,
    homePhone,
    mobilePhone,
  }: IUserDTO) {
    const isMale = gender === "male";

    const parsedBirthday = new Date(birthday);
    if (!isValidDate(parsedBirthday))
      throw new Error("Invalid date passed to User as birthday");

    this.screenName = screenName;
    this.emailAddress = emailAddress;
    this.firstName = firstName;
    this.lastName = lastName;
    this.male = isMale;
    this.birthdayMonth = parsedBirthday.getMonth() || -1;
    this.birthdayDay = parsedBirthday.getDate() || -1;
    this.birthdayYear = parsedBirthday.getFullYear() || -1;
    this.password1 = password1;
    this.password2 = password2;
    this.addresses = [];
    this.homePhone = homePhone;
    this.mobilePhone = mobilePhone;
  }
}
