export default class AgreedToTermsDTO {
  constructor({ userId, agreedToTermsOfUse }) {
    if (typeof agreedToTermsOfUse !== "boolean") {
      throw new Error(
        `Expected 'agreedToTermsOfUse' property of ${
          this.constructor.name
        } constructor object to be a boolean but instead got ${typeof agreedToTermsOfUse}`
      );
    }

    this.userId = userId;
    this.agreedToTermsOfUse = agreedToTermsOfUse;
  }
}
