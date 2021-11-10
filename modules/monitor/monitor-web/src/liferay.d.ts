type TLiferay = {
  ThemeDisplay: {
    isSignedIn: () => boolean;
    getUserName: () => string;
    getCDNBaseURL: () => string;
  };
  Service: (
    endpoint: string,
    data?: {},
    successHandler?: (response: any) => any,
    errorHandler?: (error: any) => any
  ) => void;
  Language: {
    get: (key: string) => string;
  };
};

declare const Liferay: TLiferay;
