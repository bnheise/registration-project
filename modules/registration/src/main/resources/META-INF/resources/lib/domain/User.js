import { isValidDate } from "../utils/utils";

export default class User {
  constructor({
    screenName,
    emailAddress,
    firstName,
    lastName,
    gender,
    birthday,
    password,
    passwordConfirmation,
  }) {
    if (gender !== "male" || gender !== "female")
      throw new Error(
        `Expected 'gender' property of User constructor object to be 'male' or 'female' but insead got ${gender}`
      );
    const male = gender.toLowerCase() === "male";

    const parsedBirthday = new Date(birthday);
    if (!isValidDate(parsedBirthday))
      throw new Error("Invalid date passed to User as birthday");

    this.screenName = screenName;
    this.emailAddress = emailAddress;
    this.firstName = firstName;
    this.lastName = lastName;
    this.male = male;
    this.birthdayMonth = parsedBirthday.getMonth();
    this.birthdayDay = parsedBirthday.getDate();
    this.birthdayYear = parsedBirthday.getFullYear();
    this.password1 = password;
    this.password2 = passwordConfirmation;
  }
}
