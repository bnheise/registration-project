const rootEndpoint = "/monitor.userevent"

export const UserEventEndpoints = {
    GET_USER_EVENTS: `${rootEndpoint}/get-user-events`,
    GET_LOGIN_EVENTS: `${rootEndpoint}/get-login-events`,
    GET_REGISTRATION_EVENTS: `${rootEndpoint}/get-registration-events`,
} as const;

type t = typeof UserEventEndpoints;
export type TUserEventEndpoint = t[keyof t];
