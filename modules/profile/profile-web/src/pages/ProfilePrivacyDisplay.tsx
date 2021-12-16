import ClayForm, { ClayRadio, ClayRadioGroup } from "@clayui/form";
import ClayButton from '@clayui/button';
import React, { Dispatch, FC, SetStateAction } from "react";
import {
    PermissionSettingOption,
    PermissionSettings,
} from "../domain/PermissionSettings";
import { visbiltyWeights } from "../domain/permissionWeights";

interface Props {
    permissionSettings: PermissionSettings;
    setPermissionSettings: Dispatch<SetStateAction<PermissionSettings>>;
    submitHandler: () => void;
}

const ProfilePrivacyDisplay: FC<Props> = ({
    permissionSettings,
    setPermissionSettings,
    submitHandler
}) => {
    const {
        VIEW_BASIC_INFO,
        VIEW_FIRST_NAME,
        VIEW_LAST_NAME,
        VIEW_MALE,
        VIEW_BIRTHDAY,
        VIEW_GENERAL_PROFILE,
        VIEW_ABOUT_ME,
        VIEW_FAVORITE_QUOTES,
        VIEW_MOVIE_INTEREST,
        VIEW_FAVORITE_ACTOR,
        VIEW_FAVORITE_GENRE,
        VIEW_FAVORITE_MOVIE,
        VIEW_LEAST_FAV_MOVIE
    } = permissionSettings;

    return (
        <ClayForm>
            <h2>Basic Info</h2>
            <ClayRadioGroup
                inline
                selectedValue={VIEW_BASIC_INFO}
                onSelectedValueChange={(val) =>
                    setPermissionSettings((prevSetttings) => {
                        return visbiltyWeights[val as PermissionSettingOption] >
                            visbiltyWeights[prevSetttings.VIEW_BASIC_INFO]
                            ? {
                                ...prevSetttings,
                                VIEW_BASIC_INFO: val as PermissionSettingOption,
                            }
                            : {
                                ...prevSetttings,
                                VIEW_BASIC_INFO: val as PermissionSettingOption,
                                VIEW_FIRST_NAME: val as PermissionSettingOption,
                                VIEW_LAST_NAME: val as PermissionSettingOption,
                                VIEW_MALE: val as PermissionSettingOption,
                                VIEW_BIRTHDAY: val as PermissionSettingOption,
                            };
                    })
                }
            >
                <ClayRadio label="Anyone" value={PermissionSettingOption.anyone} />
                <ClayRadio
                    label="Members Only"
                    value={PermissionSettingOption.members}
                />
                <ClayRadio label="Private" value={PermissionSettingOption.private} />
            </ClayRadioGroup>

            <ClayForm.Group>
                <label>First Name</label>
                <ClayRadioGroup
                    inline
                    selectedValue={VIEW_FIRST_NAME}
                    onSelectedValueChange={(val) =>
                        setPermissionSettings((prevSetttings) => {
                            return visbiltyWeights[prevSetttings.VIEW_BASIC_INFO] <
                                visbiltyWeights[val as PermissionSettingOption]
                                ? {
                                    ...prevSetttings,
                                    VIEW_BASIC_INFO: val as PermissionSettingOption,
                                    VIEW_FIRST_NAME: val as PermissionSettingOption,
                                }
                                : {
                                    ...prevSetttings,
                                    VIEW_FIRST_NAME: val as PermissionSettingOption,
                                };
                        })
                    }
                >
                    <ClayRadio label="Anyone" value={PermissionSettingOption.anyone} />
                    <ClayRadio
                        label="Members Only"
                        value={PermissionSettingOption.members}
                    />
                    <ClayRadio label="Private" value={PermissionSettingOption.private} />
                </ClayRadioGroup>
            </ClayForm.Group>

            <ClayForm.Group>
                <label>Last Name</label>
                <ClayRadioGroup
                    inline
                    selectedValue={VIEW_LAST_NAME}
                    onSelectedValueChange={(val) =>
                        setPermissionSettings((prevSetttings) => {
                            return visbiltyWeights[prevSetttings.VIEW_BASIC_INFO] <
                                visbiltyWeights[val as PermissionSettingOption]
                                ? {
                                    ...prevSetttings,
                                    VIEW_BASIC_INFO: val as PermissionSettingOption,
                                    VIEW_LAST_NAME: val as PermissionSettingOption,
                                }
                                : {
                                    ...prevSetttings,
                                    VIEW_LAST_NAME: val as PermissionSettingOption,
                                };
                        })
                    }
                >
                    <ClayRadio label="Anyone" value={PermissionSettingOption.anyone} />
                    <ClayRadio
                        label="Members Only"
                        value={PermissionSettingOption.members}
                    />
                    <ClayRadio label="Private" value={PermissionSettingOption.private} />
                </ClayRadioGroup>
            </ClayForm.Group>

            <ClayForm.Group>
                <label>Gender</label>
                <ClayRadioGroup
                    inline
                    selectedValue={VIEW_MALE}
                    onSelectedValueChange={(val) =>
                        setPermissionSettings((prevSetttings) => {
                            return visbiltyWeights[prevSetttings.VIEW_BASIC_INFO] <
                                visbiltyWeights[val as PermissionSettingOption]
                                ? {
                                    ...prevSetttings,
                                    VIEW_BASIC_INFO: val as PermissionSettingOption,
                                    VIEW_MALE: val as PermissionSettingOption,
                                }
                                : {
                                    ...prevSetttings,
                                    VIEW_MALE: val as PermissionSettingOption,
                                };
                        })
                    }
                >
                    <ClayRadio label="Anyone" value={PermissionSettingOption.anyone} />
                    <ClayRadio
                        label="Members Only"
                        value={PermissionSettingOption.members}
                    />
                    <ClayRadio label="Private" value={PermissionSettingOption.private} />
                </ClayRadioGroup>
            </ClayForm.Group>

            <ClayForm.Group>
                <label>Birthday</label>
                <ClayRadioGroup
                    inline
                    selectedValue={VIEW_BIRTHDAY}
                    onSelectedValueChange={(val) =>
                        setPermissionSettings((prevSetttings) => {
                            return visbiltyWeights[prevSetttings.VIEW_BASIC_INFO] <
                                visbiltyWeights[val as PermissionSettingOption]
                                ? {
                                    ...prevSetttings,
                                    VIEW_BASIC_INFO: val as PermissionSettingOption,
                                    VIEW_BIRTHDAY: val as PermissionSettingOption,
                                }
                                : {
                                    ...prevSetttings,
                                    VIEW_BIRTHDAY: val as PermissionSettingOption,
                                };
                        })
                    }
                >
                    <ClayRadio label="Anyone" value={PermissionSettingOption.anyone} />
                    <ClayRadio
                        label="Members Only"
                        value={PermissionSettingOption.members}
                    />
                    <ClayRadio label="Private" value={PermissionSettingOption.private} />
                </ClayRadioGroup>
            </ClayForm.Group>

            <h2>General Profile</h2>
            <ClayRadioGroup
                inline
                selectedValue={VIEW_GENERAL_PROFILE}
                onSelectedValueChange={(val) =>
                    setPermissionSettings((prevSetttings) => {
                        return visbiltyWeights[val as PermissionSettingOption] >
                            visbiltyWeights[prevSetttings.VIEW_GENERAL_PROFILE]
                            ? {
                                ...prevSetttings,
                                VIEW_GENERAL_PROFILE: val as PermissionSettingOption,
                            }
                            : {
                                ...prevSetttings,
                                VIEW_GENERAL_PROFILE: val as PermissionSettingOption,
                                VIEW_ABOUT_ME: val as PermissionSettingOption,
                                VIEW_FAVORITE_QUOTES: val as PermissionSettingOption,
                            };
                    })
                }
            >
                <ClayRadio label="Anyone" value={PermissionSettingOption.anyone} />
                <ClayRadio
                    label="Members Only"
                    value={PermissionSettingOption.members}
                />
                <ClayRadio label="Private" value={PermissionSettingOption.private} />
            </ClayRadioGroup>

            <ClayForm.Group>
                <label>About Me</label>
                <ClayRadioGroup
                    inline
                    selectedValue={VIEW_ABOUT_ME}
                    onSelectedValueChange={(val) =>
                        setPermissionSettings((prevSetttings) => {
                            return visbiltyWeights[prevSetttings.VIEW_GENERAL_PROFILE] <
                                visbiltyWeights[val as PermissionSettingOption]
                                ? {
                                    ...prevSetttings,
                                    VIEW_GENERAL_PROFILE: val as PermissionSettingOption,
                                    VIEW_ABOUT_ME: val as PermissionSettingOption,
                                }
                                : {
                                    ...prevSetttings,
                                    VIEW_ABOUT_ME: val as PermissionSettingOption,
                                };
                        })
                    }
                >
                    <ClayRadio label="Anyone" value={PermissionSettingOption.anyone} />
                    <ClayRadio
                        label="Members Only"
                        value={PermissionSettingOption.members}
                    />
                    <ClayRadio label="Private" value={PermissionSettingOption.private} />
                </ClayRadioGroup>
            </ClayForm.Group>

            <ClayForm.Group>
                <label>Favorite Quotes</label>
                <ClayRadioGroup
                    inline
                    selectedValue={VIEW_FAVORITE_QUOTES}
                    onSelectedValueChange={(val) =>
                        setPermissionSettings((prevSetttings) => {
                            return visbiltyWeights[prevSetttings.VIEW_GENERAL_PROFILE] <
                                visbiltyWeights[val as PermissionSettingOption]
                                ? {
                                    ...prevSetttings,
                                    VIEW_GENERAL_PROFILE: val as PermissionSettingOption,
                                    VIEW_FAVORITE_QUOTES: val as PermissionSettingOption,
                                }
                                : {
                                    ...prevSetttings,
                                    VIEW_FAVORITE_QUOTES: val as PermissionSettingOption,
                                };
                        })
                    }
                >
                    <ClayRadio label="Anyone" value={PermissionSettingOption.anyone} />
                    <ClayRadio
                        label="Members Only"
                        value={PermissionSettingOption.members}
                    />
                    <ClayRadio label="Private" value={PermissionSettingOption.private} />
                </ClayRadioGroup>
            </ClayForm.Group>

            <h2>Movie Interest</h2>
            <ClayRadioGroup
                inline
                selectedValue={VIEW_MOVIE_INTEREST}
                onSelectedValueChange={(val) =>
                    setPermissionSettings((prevSetttings) => {
                        return visbiltyWeights[val as PermissionSettingOption] >
                            visbiltyWeights[prevSetttings.VIEW_MOVIE_INTEREST]
                            ? {
                                ...prevSetttings,
                                VIEW_MOVIE_INTEREST: val as PermissionSettingOption,
                            }
                            : {
                                ...prevSetttings,
                                VIEW_MOVIE_INTEREST: val as PermissionSettingOption,
                                VIEW_FAVORITE_ACTOR: val as PermissionSettingOption,
                                VIEW_FAVORITE_GENRE: val as PermissionSettingOption,
                                VIEW_FAVORITE_MOVIE: val as PermissionSettingOption,
                                VIEW_LEAST_FAV_MOVIE: val as PermissionSettingOption,
                            };
                    })
                }
            >
                <ClayRadio label="Anyone" value={PermissionSettingOption.anyone} />
                <ClayRadio
                    label="Members Only"
                    value={PermissionSettingOption.members}
                />
                <ClayRadio label="Private" value={PermissionSettingOption.private} />
            </ClayRadioGroup>

            <ClayForm.Group>
                <label>Favorite Movie</label>
                <ClayRadioGroup
                    inline
                    selectedValue={VIEW_FAVORITE_MOVIE}
                    onSelectedValueChange={(val) =>
                        setPermissionSettings((prevSetttings) => {
                            return visbiltyWeights[prevSetttings.VIEW_MOVIE_INTEREST] <
                                visbiltyWeights[val as PermissionSettingOption]
                                ? {
                                    ...prevSetttings,
                                    VIEW_MOVIE_INTEREST: val as PermissionSettingOption,
                                    VIEW_FAVORITE_MOVIE: val as PermissionSettingOption,
                                }
                                : {
                                    ...prevSetttings,
                                    VIEW_FAVORITE_MOVIE: val as PermissionSettingOption,
                                };
                        })
                    }
                >
                    <ClayRadio label="Anyone" value={PermissionSettingOption.anyone} />
                    <ClayRadio
                        label="Members Only"
                        value={PermissionSettingOption.members}
                    />
                    <ClayRadio label="Private" value={PermissionSettingOption.private} />
                </ClayRadioGroup>
            </ClayForm.Group>

            <ClayForm.Group>
                <label>Favorite Actor</label>
                <ClayRadioGroup
                    inline
                    selectedValue={VIEW_FAVORITE_ACTOR}
                    onSelectedValueChange={(val) =>
                        setPermissionSettings((prevSetttings) => {
                            return visbiltyWeights[prevSetttings.VIEW_MOVIE_INTEREST] <
                                visbiltyWeights[val as PermissionSettingOption]
                                ? {
                                    ...prevSetttings,
                                    VIEW_MOVIE_INTEREST: val as PermissionSettingOption,
                                    VIEW_FAVORITE_ACTOR: val as PermissionSettingOption,
                                }
                                : {
                                    ...prevSetttings,
                                    VIEW_FAVORITE_ACTOR: val as PermissionSettingOption,
                                };
                        })
                    }
                >
                    <ClayRadio label="Anyone" value={PermissionSettingOption.anyone} />
                    <ClayRadio
                        label="Members Only"
                        value={PermissionSettingOption.members}
                    />
                    <ClayRadio label="Private" value={PermissionSettingOption.private} />
                </ClayRadioGroup>
            </ClayForm.Group>

            <ClayForm.Group>
                <label>Favorite Genre</label>
                <ClayRadioGroup
                    inline
                    selectedValue={VIEW_FAVORITE_GENRE}
                    onSelectedValueChange={(val) =>
                        setPermissionSettings((prevSetttings) => {
                            return visbiltyWeights[prevSetttings.VIEW_MOVIE_INTEREST] <
                                visbiltyWeights[val as PermissionSettingOption]
                                ? {
                                    ...prevSetttings,
                                    VIEW_MOVIE_INTEREST: val as PermissionSettingOption,
                                    VIEW_FAVORITE_GENRE: val as PermissionSettingOption,
                                }
                                : {
                                    ...prevSetttings,
                                    VIEW_FAVORITE_GENRE: val as PermissionSettingOption,
                                };
                        })
                    }
                >
                    <ClayRadio label="Anyone" value={PermissionSettingOption.anyone} />
                    <ClayRadio
                        label="Members Only"
                        value={PermissionSettingOption.members}
                    />
                    <ClayRadio label="Private" value={PermissionSettingOption.private} />
                </ClayRadioGroup>
            </ClayForm.Group>

            <ClayForm.Group>
                <label>Least Favorite Movie</label>
                <ClayRadioGroup
                    inline
                    selectedValue={VIEW_LEAST_FAV_MOVIE}
                    onSelectedValueChange={(val) =>
                        setPermissionSettings((prevSetttings) => {
                            return visbiltyWeights[prevSetttings.VIEW_MOVIE_INTEREST] <
                                visbiltyWeights[val as PermissionSettingOption]
                                ? {
                                    ...prevSetttings,
                                    VIEW_MOVIE_INTEREST: val as PermissionSettingOption,
                                    VIEW_LEAST_FAV_MOVIE: val as PermissionSettingOption,
                                }
                                : {
                                    ...prevSetttings,
                                    VIEW_LEAST_FAV_MOVIE: val as PermissionSettingOption,
                                };
                        })
                    }
                >
                    <ClayRadio label="Anyone" value={PermissionSettingOption.anyone} />
                    <ClayRadio
                        label="Members Only"
                        value={PermissionSettingOption.members}
                    />
                    <ClayRadio label="Private" value={PermissionSettingOption.private} />
                </ClayRadioGroup>
            </ClayForm.Group>
            <ClayButton displayType="primary" onClick={submitHandler}>Submit</ClayButton>
        </ClayForm>
    );
};

export default ProfilePrivacyDisplay;
