import { ContentSection } from '@clayui/layout';
import React, { FC } from 'react'
import ClayForm from '@clayui/form';
import { ProfileViewPermissions } from '../../domain/ProfileViewPermissions'

interface Props {
    viewPermissions: ProfileViewPermissions;
}

const BasicInfo: FC<Props> = ({ viewPermissions }) => {
    const { basicInfo, firstName, lastName, birthday } = viewPermissions;
    return (
        <ContentSection>
            <h2>Basic Info</h2>
            {
                basicInfo ?
                    <ClayForm.Group>

                    </ClayForm.Group> :
                    null
            }
        </ContentSection>
    )
}

export default BasicInfo
