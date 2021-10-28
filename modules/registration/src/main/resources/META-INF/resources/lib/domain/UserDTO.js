import { isValidDate } from "../utils/utils";

export default class UserDTO {
  constructor({
    screenName,
    emailAddress,
    firstName,
    lastName,
    gender,
    birthday,
    password1,
    password2,
  }) {
    if (gender !== "male" && gender !== "female") {
      throw new Error(
        `Expected 'gender' property of User constructor object to be 'male' or 'female' but instead got ${gender}`
      );
    }
    const isMale = gender.toLowerCase() === "male";

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
    this.companyId = Number(Liferay.ThemeDisplay.getCompanyId()) || -1;
    this.autoPassword = false;
    this.autoScreenName = false;
    this.locale = Liferay.ThemeDisplay.getLanguageId();
    this.middleName = "";
    this.prefixId = -1;
    this.suffixId = -1;
    this.jobTitle = "";
    this.groupIds = [];
    this.organizationIds = [];
    this.roleIds = [];
    this.userGroupIds = [];
    this.addresses = [];
    this.emailAddresses = [];
    this.phones = [];
    this.websites = [];
    this.announcementsDelivers = [];
    this.sendEmail = false;
  }
}
