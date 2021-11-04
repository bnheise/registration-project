interface IPhoneDTO {
  number: string | number;
}

export default class PhoneDTO implements IPhoneDTO {
  number;
  constructor({ number }: IPhoneDTO) {
    this.number = number;
  }
}
