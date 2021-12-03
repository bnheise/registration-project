import { ContentSection } from '@clayui/layout';
import React, { FC } from 'react'

interface Props {
    hasPermission: boolean;
    heading: string;
}

const PermissionedSection: FC<Props> = ({ hasPermission, heading, children }) => {
    return (
        <ContentSection style={{ marginBottom: "20px" }}>
            <h2>{heading}</h2>
            {
                hasPermission ?
                    children :
                    null
            }
        </ContentSection>
    )
}

export default PermissionedSection;
