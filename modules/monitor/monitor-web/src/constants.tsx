const rootEndpoint = "/monitor.userevent"

export const GetUserEventEndpoints = {
    GET_USER_EVENTS: `${rootEndpoint}/get-user-events`,
    GET_LOGIN_EVENTS: `${rootEndpoint}/get-login-events`,
    GET_REGISTRATION_EVENTS: `${rootEndpoint}/get-registration-events`,
} as const;

export const CountUserEventEndpoints = {
    COUNT_USER_EVENTS: `${rootEndpoint}/get-user-events-count`,
    COUNT_LOGIN_EVENTS: `${rootEndpoint}/get-login-events-count`,
    COUNT_REGISTRATION_EVENTS: `${rootEndpoint}/get-registration-events-count`,
} as const;

type t = typeof GetUserEventEndpoints;
export type TGetUserEventEndpoint = t[keyof t];

type u = typeof CountUserEventEndpoints;
export type TCountUserEventEndpoint = u[keyof u];

const { GET_USER_EVENTS, GET_LOGIN_EVENTS, GET_REGISTRATION_EVENTS } = GetUserEventEndpoints;
const { COUNT_LOGIN_EVENTS, COUNT_REGISTRATION_EVENTS, COUNT_USER_EVENTS } = CountUserEventEndpoints;

export const GetToCountEnpointMap = {
    [GET_USER_EVENTS]: COUNT_USER_EVENTS,
    [GET_LOGIN_EVENTS]: COUNT_LOGIN_EVENTS,
    [GET_REGISTRATION_EVENTS]: COUNT_REGISTRATION_EVENTS
}