export default class PhoneDTO {
  constructor({ number, type }) {
    const typeIds = {
      HOME: 11011,
      MOBILE: 11008,
    };
    if (!Object.keys(typeIds).find((idKey) => idKey === type.toUpperCase())) {
      throw new Error(
        `Field 'type' of PhoneDTO must be one of the following: ${Object.values(
          typeIds
        ).join(",")}. However, the value received was ${type}`
      );
    }
    this.className = "com.liferay.portal.kernel.model.Contact";
    this.classPK = 39627;
    this.number = number;
    this.extension = "";
    this.primary = type === "HOME";
    this.typeId = typeIds[type];
  }
}
