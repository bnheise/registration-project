import { TGenders } from "./genderOptions";
import { IUserDTO } from "./UserDTO";

export interface IRegistrationFormInputs {
  screenName?: string;
  emailAddress?: string;
  firstName?: string;
  lastName?: string;
  gender?: TGenders;
  birthday?: string;
  password1?: string;
  password2?: string;
  homePhone?: string;
  mobilePhone?: string;
}

export default class RegistrationFormInputs implements IUserDTO {
  screenName;
  emailAddress;
  firstName;
  lastName;
  gender;
  birthday;
  password1;
  password2;
  homePhone;
  mobilePhone;

  constructor({
    screenName = "",
    emailAddress = "",
    firstName = "",
    lastName = "",
    gender = "male",
    birthday = "",
    password1 = "",
    password2 = "",
    homePhone = "",
    mobilePhone = "",
  }: IRegistrationFormInputs) {
    this.screenName = screenName;
    this.emailAddress = emailAddress;
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.birthday = birthday;
    this.password1 = password1;
    this.password2 = password2;
    this.homePhone = homePhone;
    this.mobilePhone = mobilePhone;
  }
}
