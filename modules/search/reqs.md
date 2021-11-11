# Search Requirements

* dxp platform settings
    * create a TEC role
        * no admin access
        * only allow to view the amf-search and amf-search-results portlets
        * only allow to call the search service endpoints
    * page settings
        * 30-70 page layout
        * amf-search is 30
        * amf-search-results is 70

* search service
    * remote service endpoints
        * get-users-by-zip: zip -> User[]
            * note: only needs to return First Name, Last Initial, Screen Name, and Email Address (primary)
            * note: should filter out all addresses except for primary
            * note: try to use dynamic query
            * note: no indexing, just database search

* amf-search portlet
    * accept a zip code as input
        * validation: must be a 5-digit number
        * communicate results using Liferay.fire
        * retain postal code after clicking search (or pressing enter)

* amf-search-results portlet
    * search result header includes the zip code
    * receive results using Liferay.on
    * use pagination ClayUi (default 5 users per page)
    * if received results are empty, display ```No results found. Please try a different search criteria.```
    