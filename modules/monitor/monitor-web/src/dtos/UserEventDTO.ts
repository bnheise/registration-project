export interface UserEvent {
  ipAddress: string;
  screenName: string;
  type: string;
  userEventId: number;
  userId: number;
  createDate: string;
}

export default class UserEventDTO {
  ipAddress: string;
  screenName: string;
  type: string;
  userEventId: number;
  userId: number;
  createDate: Date;

  constructor({
    ipAddress,
    screenName,
    type,
    userEventId,
    userId,
    createDate,
  }: UserEvent) {
    this.ipAddress = ipAddress;
    this.screenName = screenName;
    this.type = type;
    this.userEventId = userEventId;
    this.userId = userId;
    this.createDate = new Date(createDate);
  }
}
