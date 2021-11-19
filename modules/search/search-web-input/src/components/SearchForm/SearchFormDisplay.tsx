import React, { ChangeEventHandler, FC, MouseEventHandler, ReactElement } from 'react'
import Button from '@clayui/button'
import ClayForm, { ClayInput } from '@clayui/form'

interface Props {
    handleChange: ChangeEventHandler<HTMLInputElement>
    zip: string;
    handleClick: MouseEventHandler<HTMLButtonElement>
}

const SearchFormDisplay: FC<Props> = ({ handleChange, handleClick, zip }): ReactElement => {
    return (
        <ClayForm id="userSearchBy">
            <ClayForm.Group>
                <ClayInput
                    id="zipInput"
                    name="zip"
                    onChange={handleChange}
                    value={zip}
                    type="text"
                />
            </ClayForm.Group>
            <Button onClick={handleClick} displayType="primary">
                {Liferay.Language.get("search")}
            </Button>
        </ClayForm>

    )
}

export default SearchFormDisplay
