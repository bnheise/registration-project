import React, { FC, ReactElement, useState } from 'react'
import { UserAddress } from '../../domain/UserAddress';
import { handleChange, handleClick } from './handlers';
import SearchFormDisplay from './SearchFormDisplay';

const SearchForm: FC = (): ReactElement => {
    const [zip, setZip] = useState<string>("");
    const [start, setStart] = useState<number>(0);
    const [end, setEnd] = useState<number>(5);

    return (
        <div>
            <SearchFormDisplay zip={zip} handleClick={handleClick(zip, start, end)} handleChange={handleChange(setZip)} />
        </div>
    )
}

export default SearchForm
