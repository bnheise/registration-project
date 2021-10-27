export default class RegistrationFormInputs {
  constructor({
    screenName,
    emailAddress,
    firstName,
    lastName,
    gender,
    birthday,
    password,
    passwordConfirmation,
  } = {}) {
    this.screenName = screenName || "";
    this.emailAddress = emailAddress || "";
    this.firstName = firstName || "";
    this.lastName = lastName || "";
    this.gender = gender || "male";
    this.birthday = birthday || "";
    this.password1 = password || "";
    this.password2 = passwordConfirmation || "";
  }
}
