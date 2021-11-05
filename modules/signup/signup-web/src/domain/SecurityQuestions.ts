import { IOption } from "./genderOptions";

interface SecurityQuestion {
  securityQuestion: string;
  securityAnswer: string;
}

const questionKeys: string[] = [
  "what-is-your-mother's-maiden-name",
  "what-is-the-make-of-your-first-car",
  "what-is-your-high-school-mascot",
  "who-is-your-favorite-actor",
];

export const securityQuestionOptions: IOption<string>[] = questionKeys.map(
  (key) =>
    ({
      value: key,
      label: keyToLabel(key),
    } as IOption<string>)
);

const keyToLabel = (key: string): string => {
  const split = key.split("-");
  split[0] = split[0].toUpperCase();
  return `${split.join(" ")}?`;
};

export class SecurityQuestionsDTO implements SecurityQuestion {
  securityQuestion;
  securityAnswer;

  constructor({ securityQuestion, securityAnswer }: SecurityQuestion) {
    this.securityQuestion = securityQuestion;
    this.securityAnswer = securityAnswer;
  }
}
