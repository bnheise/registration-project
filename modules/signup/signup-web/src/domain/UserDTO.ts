import { isValidDate } from "../utils/utils";
import AddressDTO from "./AddressDTO";
import { TGenders } from "./genderOptions";
import PhoneDTO from "./PhoneDTO";
import { IRegistrationFormInputs } from "./RegistrationFormInputs";

export interface IUserDTO {
  screenName: string;
  emailAddress: string;
  firstName: string;
  lastName: string;
  male: boolean;
  birthdayMonth: number;
  birthdayDay: number;
  birthdayYear: number;
  password1: string;
  password2: string;
  homePhone: PhoneDTO;
  mobilePhone: PhoneDTO;
  billingAddress: AddressDTO;
  agreedToTerms: boolean;
  securityQuestion: string;
  securityAnswer: string;
}

export default class UserDTO implements IUserDTO {
  password1;
  password2;
  screenName;
  emailAddress;
  firstName;
  lastName;
  male;
  birthdayMonth;
  birthdayDay;
  birthdayYear;
  homePhone;
  mobilePhone;
  billingAddress;
  agreedToTerms;
  securityAnswer;
  securityQuestion;

  constructor({
    screenName = "",
    emailAddress = "",
    firstName = "",
    lastName = "",
    gender,
    birthday,
    password1 = "",
    password2 = "",
    homePhone = "",
    mobilePhone = "",
    address1 = "",
    address2,
    city = "",
    state = -1,
    zip = -1,
    agreedToTerms = false,
    securityAnswer = "",
    securityQuestion = "",
  }: IRegistrationFormInputs) {
    const isMale = gender === "male";

    const parsedBirthday = birthday ? new Date(birthday) : new Date();
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
    this.homePhone = new PhoneDTO({ number: homePhone });
    this.mobilePhone = new PhoneDTO({ number: mobilePhone });
    this.billingAddress = new AddressDTO({
      street1: address1,
      street2: address2,
      city,
      regionId: state,
      zip,
    });
    this.agreedToTerms = agreedToTerms;
    this.securityAnswer = securityAnswer;
    this.securityQuestion = securityQuestion;
  }
}
