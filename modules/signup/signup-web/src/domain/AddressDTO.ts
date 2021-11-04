interface IAddressDTO {
  street1: string;
  street2?: string;
  city: string;
  regionId: number;
  countryId?: number;
  zip: number;
}

export default class AddressDTO implements IAddressDTO {
  street1;
  street2;
  city;
  regionId;
  countryId;
  zip;

  constructor({
    street1,
    street2,
    city,
    regionId,
    countryId,
    zip,
  }: IAddressDTO) {
    this.street1 = street1;
    this.street2 = street2 || "";
    this.city = city;
    this.regionId = regionId;
    this.zip = zip;
    this.countryId = countryId;
  }
}
