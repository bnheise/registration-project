import { ReactComponentLike } from "prop-types";
import ProfileEdit from "../pages/ProfileEdit";
import ProfilePrivacy from "../pages/ProfilePrivacy";
import ProfileView from "../pages/ProfileView";

export interface Route {
  path: string;
  component: ReactComponentLike;
  routes?: Route[];
}

const routes: Route[] = [
  { path: "/profile/view/:screenName", component: ProfileView },
  { path: "/profile/edit", component: ProfileEdit },
  { path: "/profile/privacy", component: ProfilePrivacy },
];

export default routes;
