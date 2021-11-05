import { genderOptions, TGenders } from "./genderOptions";
import { securityQuestionOptions } from "./SecurityQuestions";

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
  address1?: string;
  address2?: string;
  city?: string;
  state?: number;
  zip?: number;
  agreedToTerms?: boolean;
  securityQuestion?: string;
  securityAnswer?: string;
}

export default class RegistrationFormInputs implements IRegistrationFormInputs {
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
  address1;
  address2;
  city;
  state;
  zip;
  agreedToTerms;
  securityQuestion;
  securityAnswer;

  constructor({
    screenName = "",
    emailAddress = "",
    firstName = "",
    lastName = "",
    gender = genderOptions[0].value,
    birthday = "",
    password1 = "",
    password2 = "",
    homePhone = "",
    mobilePhone = "",
    address1 = "",
    address2 = "",
    city = "",
    state,
    zip,
    agreedToTerms = false,
    securityAnswer = "",
    securityQuestion = securityQuestionOptions[0].value,
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
    this.address1 = address1;
    this.address2 = address2;
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.agreedToTerms = agreedToTerms;
    this.securityAnswer = securityAnswer;
    this.securityQuestion = securityQuestion;
  }
}
