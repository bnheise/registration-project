import React, { ChangeEventHandler, FC, MouseEventHandler, ReactElement } from 'react'
import Button from '@clayui/button'
import ClayForm, { ClayInput } from '@clayui/form'

interface Props {
    handleChange: ChangeEventHandler<HTMLInputElement>;
    zip: string;
    handleClick: MouseEventHandler<HTMLButtonElement>;
    errors: string[];
}

const SearchFormDisplay: FC<Props> = ({ handleChange, handleClick, zip, errors }): ReactElement => {
    const style = errors.length > 0 ? "has-error" : "";
    return (
        <ClayForm id="userSearchBy">
            <ClayForm.Group className={style}>
                <ClayInput
                    id="zipInput"
                    name="zip"
                    onChange={handleChange}
                    value={zip}
                    type="text"
                />
                <ClayForm.FeedbackGroup>
                    {errors.map((error, index) => {
                        switch (error) {
                            case "inlcudesNonDigits":
                                return <ClayForm.FeedbackItem key={index}>{Liferay.Language.get("inlcudesNonDigits")}</ClayForm.FeedbackItem>
                            case "notFiveDigits":
                                return <ClayForm.FeedbackItem key={index}>{Liferay.Language.get("notFiveDigits")}</ClayForm.FeedbackItem>
                            default:
                                return;
                        }
                    }
                    )}
                </ClayForm.FeedbackGroup>
            </ClayForm.Group>
            <Button onClick={handleClick} displayType="primary">
                {Liferay.Language.get("search")}
            </Button>
        </ClayForm>

    )
}

export default SearchFormDisplay
