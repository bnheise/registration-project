# Profile Project

## Reqs

### Modules
    * profile-api
    * profile-service
    * profile-web

### Basic Info
    * Stored in core tables
    * is updatable
    * Permissions
        * try to define with respect to the portlet

```
<model-resource>
    <model-name>com.liferay.portal.kernel.model.User</model-name>
    <portlet-ref>
        <portlet-name>com_amf_registration_web_portlet_UserProfile</portlet-name>
    </portlet-ref>
    <weight>2</weight>
    <permissions>
        <supports>
            <action-key>VIEW</action-key>
            <action-key>UPDATE</action-key>
        </supports>
        <site-member-defaults>
            <action-key>VIEW</action-key>
        </site-member-defaults>
        <guest-defaults>
            <action-key>VIEW</action-key>
        </guest-defaults>
        <guest-unsupported>
            <action-key>UPDATE</action-key>
        </guest-unsupported>
        <site-member-unsupported>
            <action-key>UPDATE</action-key>
        </site-member-unsupported>
    </permissions>
</model-resource>
```