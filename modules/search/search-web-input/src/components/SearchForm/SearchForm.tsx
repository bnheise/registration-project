import React, { FC, ReactElement, useEffect, useState } from 'react'
import { handleChange, handleClick } from './handlers';
import SearchFormDisplay from './SearchFormDisplay';

interface PageChangeRequestData {
    start: number;
    end: number;
    zip: string;
}

const SearchForm: FC = (): ReactElement => {
    const [zip, setZip] = useState<string>("");
    const [start, setStart] = useState<number>(0);
    const [end, setEnd] = useState<number>(5);
    const [errors, setErrors] = useState<Array<string>>([]);

    useEffect(() => {
        Liferay.on("pageChangeRequested", ({ start: newStart, end: newEnd, zip: newZip }: PageChangeRequestData) => {
            setStart(newStart);
            setEnd(newEnd);
            setZip(newZip);
            handleClick(newZip, newStart, newEnd, setErrors)();
        })
    }, []);

    return (
        <div>
            <SearchFormDisplay errors={errors} zip={zip} handleClick={handleClick(zip, start, end, setErrors)} handleChange={handleChange(setZip)} />
        </div>
    )
}

export default SearchForm
