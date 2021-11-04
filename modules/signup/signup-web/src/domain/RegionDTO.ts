export interface IRegionDTO {
  active?: boolean;
  countryId: number;
  mvccVersion?: number;
  name: string;
  regionCode: string;
  regionId: number;
}

export class RegionDTO implements IRegionDTO {
  active;
  countryId;
  mvccVersion;
  name;
  regionCode;
  regionId;

  constructor({
    active,
    countryId,
    mvccVersion,
    name,
    regionCode,
    regionId,
  }: IRegionDTO) {
    this.active = active;
    this.regionCode = regionCode;
    this.mvccVersion = mvccVersion;
    this.countryId = countryId;
    this.name = name;
    this.regionCode = regionCode;
    this.regionId = regionId;
  }
}
