import React, { ChangeEventHandler } from "react";

const capitalize = (word: string): string =>
  [...word[0].toUpperCase(), ...word.slice(1)].join("");

const toLowerCase = (word: string): string => word.toLowerCase();

const firstOrElse =
  (firstCallback: (item: any) => any, secondCallback: (item: any) => any) =>
  (item: any, index: number) =>
    index === 0 ? firstCallback(item) : secondCallback(item);

const camelMap = firstOrElse(toLowerCase, capitalize);

const genChangeHandler =
  (stateSetter: (state: any) => any, stateObject: {}, currentKey: string) =>
  (event: React.ChangeEvent<HTMLInputElement>) => {
    stateSetter({
      ...stateObject,
      [currentKey]: event.target ? event.target.value : event,
    });
  };

export type ValueChangeHandler = (
  value: string,
  type?: "input" | "time" | "click" | undefined
) => void;

export const genChangeHandlers = (
  stateObject: {},
  stateSetter: (state: any) => any
) =>
  Object.keys(stateObject).reduce(
    (
      allHandlers: {
        [key: string]: ChangeEventHandler<Element> | ValueChangeHandler;
      },
      currentKey: string
    ) => {
      allHandlers[`handle${capitalize(currentKey)}Change`] = genChangeHandler(
        stateSetter,
        stateObject,
        currentKey
      );
      return allHandlers;
    },
    {}
  );

export const toCamel = (string: string) =>
  string
    .split(" ")
    .map((word, index) => camelMap(word, index))
    .join("");

export const isValidDate = (date: Date) =>
  date instanceof Date && !Number.isNaN(date);
