import { PermissionSettingOption } from "./PermissionSettings";

type PermissionWeight = {
  [Property in keyof typeof PermissionSettingOption]: any;
};

export const visbiltyWeights: PermissionWeight = {
  private: 0,
  members: 1,
  anyone: 2,
};
