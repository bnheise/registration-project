export const toCamel = (string) => string.split(' ').map(camelMap(word, index)).join('');
export const isValidDate = (date) => date instanceof Date && !isNaN(date);

const capitalize = (word) => [...word[0].toUpperCase(), ...word.slice(1)].join();
const toLowerCase = word => word.toLowerCase();
const firstOrElse = (firstCallback, secondCallback) => (item, index) => index === 0 ? firstCallback(item) : secondCallback(item);
const camelMap = firstOrElse(toLowerCase, capitalize);