export const convertConstCaseToCamel = (key: string): string =>
  key
    .split("_")
    .map((part, index) =>
      index === 0
        ? part.toLowerCase()
        : part[0].toUpperCase() + part.substring(1).toLowerCase()
    )
    .join("");

export const convertObjKeysToCamel = (obj: any) => {
  const copy: any = {};
  for (let key in obj) {
    const val = obj[key];
    const camelKey = convertConstCaseToCamel(key);
    copy[camelKey] = val;
  }
  return copy;
};
