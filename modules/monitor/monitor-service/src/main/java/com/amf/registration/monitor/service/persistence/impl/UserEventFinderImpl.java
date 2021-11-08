package com.amf.registration.monitor.service.persistence.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.amf.registration.monitor.service.persistence.UserEventFinder;
import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.kernel.dao.orm.ORMException;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = UserEventFinder.class)
public class UserEventFinderImpl extends UserEventFinderBaseImpl implements UserEventFinder {
    @Reference
    private CustomSQL customSQL;

    public List<HashMap<String, Object>> findAll(int start, int end) {
        Session session = null;
        try {

            session = openSession();
            String queryString = customSQL.get(getClass(), "findAll");
            System.out.println("HERE1");
            System.out.println(queryString);
            SQLQuery sqlQuery = session.createSQLQuery(queryString);
            sqlQuery.setCacheable(false);
            System.out.println("HERE1.5");
            // sqlQuery.addEntity("UserEvent", UserEventImpl.class);
            // sqlQuery.addEntity("User_",
            // PortalClassLoaderUtil.getClassLoader().loadClass("com.liferay.portal.model.impl.UserImpl"));
            QueryPos queryPos = QueryPos.getInstance(sqlQuery);
            System.out.println("HERE2");
            queryPos.add(end - start);
            queryPos.add(start);
            System.out.println(queryPos);

            List<Object[]> result = sqlQuery.list();
            System.out.println("HERE2.5");
            List<HashMap<String, Object>> finalResult = new ArrayList<>();
            for (Object[] objects : result) {
                HashMap<String, Object> event = new HashMap<>();
                System.out.println("UUID " + (String) objects[0]);
                event.put("uuid", objects[0]);
                event.put("userEventId", Long.parseLong(String.valueOf(objects[1])));
                event.put("groupId", Long.parseLong(String.valueOf(objects[2])));
                event.put("companyId", Long.parseLong(String.valueOf(objects[3])));
                event.put("userId", Long.parseLong(String.valueOf(objects[3])));
                event.put("createDate", objects[5]);
                event.put("modifiedDate", objects[6]);
                event.put("ipAddress", objects[7]);
                event.put("type", objects[8]);
                event.put("screenName", objects[9]);
                finalResult.add(event);
            }
            System.out.println(finalResult);
            System.out.println(result);
            // System.out.println(result.get(0).getScreenName());
            return finalResult;
        } catch (

        ORMException e) {
            return new ArrayList<>();
        } finally {
            closeSession(session);
        }
    }
}
