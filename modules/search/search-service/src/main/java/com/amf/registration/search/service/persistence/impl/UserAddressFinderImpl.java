package com.amf.registration.search.service.persistence.impl;

import java.util.ArrayList;
import java.util.List;

import com.amf.registration.search.model.UserAddress;
import com.amf.registration.search.model.impl.UserAddressImpl;
import com.amf.registration.search.service.persistence.UserAddressFinder;
import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = UserAddressFinder.class)
public class UserAddressFinderImpl extends UserAddressFinderBaseImpl implements UserAddressFinder {
    
    public List<UserAddress> findByZip(String zip, int start, int end) {
        Session session = null;

        try {
            session = openSession();

            String sql = customSQL.get(getClass(), "findByZip");
            SQLQuery sqlQuery = session.createSQLQuery(sql);
            sqlQuery.setCacheable(false);

            sqlQuery.addEntity("UserAddress", UserAddressImpl.class);
            QueryPos queryPos = QueryPos.getInstance(sqlQuery);
            queryPos.add(zip);
            queryPos.add(end - start);
            queryPos.add(start);

            return sqlQuery.list();
        } catch (Exception e) {
            return new ArrayList<>();
        } finally {
            closeSession(session);
        }
    }

    public long getCountByZip(String zip) {
        Session session = null;

        try {
            session = openSession();

            String sql = customSQL.get(getClass(), "getCountByZip");
            SQLQuery sqlQuery = session.createSQLQuery(sql);
            sqlQuery.setCacheable(false);

            sqlQuery.addEntity("UserAddress", UserAddressImpl.class);
            QueryPos queryPos = QueryPos.getInstance(sqlQuery);
            queryPos.add(zip);

            return (long) sqlQuery.uniqueResult();
        } catch (Exception e) {
            return 0;
        } finally {
            closeSession(session);
        }
    }
    
    @Reference
    private CustomSQL customSQL;
}
