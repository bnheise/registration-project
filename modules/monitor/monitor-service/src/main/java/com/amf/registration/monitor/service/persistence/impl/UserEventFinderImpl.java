package com.amf.registration.monitor.service.persistence.impl;

import java.math.BigInteger;
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
            SQLQuery sqlQuery = session.createSQLQuery(queryString);
            sqlQuery.setCacheable(false);

            QueryPos queryPos = QueryPos.getInstance(sqlQuery);
            queryPos.add(end - start);
            queryPos.add(start);

            List<Object[]> result = sqlQuery.list();

            return formatResult(result);
        } catch (

        ORMException e) {
            return new ArrayList<>();
        } finally {
            closeSession(session);
        }
    }

    public long countAll() {
        Session session = null;
        try {

            session = openSession();
            String queryString = customSQL.get(getClass(), "countAll");

            SQLQuery sqlQuery = session.createSQLQuery(queryString);
            sqlQuery.setCacheable(false);
            BigInteger count = (BigInteger) sqlQuery.uniqueResult();
            return count.longValue();
        } catch (

        ORMException e) {
            return 0;
        } finally {
            closeSession(session);
        }
    }

    public List<HashMap<String, Object>> findType(int start, int end, String type) {
        Session session = null;
        try {

            session = openSession();
            String queryString = customSQL.get(getClass(), "findType");

            SQLQuery sqlQuery = session.createSQLQuery(queryString);
            sqlQuery.setCacheable(false);

            QueryPos queryPos = QueryPos.getInstance(sqlQuery);
            queryPos.add(type);
            queryPos.add(end - start);
            queryPos.add(start);

            List<Object[]> result = sqlQuery.list();

            return formatResult(result);
        } catch (

        ORMException e) {
            return new ArrayList<>();
        } finally {
            closeSession(session);
        }
    }

    public long countType(String type) {
        Session session = null;
        try {

            session = openSession();
            String queryString = customSQL.get(getClass(), "countType");

            SQLQuery sqlQuery = session.createSQLQuery(queryString);
            sqlQuery.setCacheable(false);

            QueryPos queryPos = QueryPos.getInstance(sqlQuery);
            queryPos.add(type);
            BigInteger result = (BigInteger) sqlQuery.uniqueResult();
            return result.longValue();
        } catch (

        ORMException e) {
            return 0;
        } finally {
            closeSession(session);
        }
    }

    public List<HashMap<String, Object>> findAllForUser(int start, int end, long userId) {
        Session session = null;
        try {

            session = openSession();
            String queryString = customSQL.get(getClass(), "findAllForUser");

            SQLQuery sqlQuery = session.createSQLQuery(queryString);
            sqlQuery.setCacheable(false);

            QueryPos queryPos = QueryPos.getInstance(sqlQuery);
            queryPos.add(userId);
            queryPos.add(end - start);
            queryPos.add(start);

            List<Object[]> result = sqlQuery.list();

            return formatResult(result);
        } catch (

        ORMException e) {
            return new ArrayList<>();
        } finally {
            closeSession(session);
        }
    }

    public long countAllForUser(long userId) {
        Session session = null;
        try {

            session = openSession();
            String queryString = customSQL.get(getClass(), "countAllForUser");

            SQLQuery sqlQuery = session.createSQLQuery(queryString);
            sqlQuery.setCacheable(false);

            QueryPos queryPos = QueryPos.getInstance(sqlQuery);
            queryPos.add(userId);

            BigInteger result = (BigInteger) sqlQuery.uniqueResult();

            return result.longValue();
        } catch (

        ORMException e) {
            return 0;
        } finally {
            closeSession(session);
        }
    }

    public List<HashMap<String, Object>> findTypeForUser(int start, int end, long userId, String type) {
        Session session = null;
        try {

            session = openSession();
            String queryString = customSQL.get(getClass(), "findTypeForUser");

            SQLQuery sqlQuery = session.createSQLQuery(queryString);
            sqlQuery.setCacheable(false);

            QueryPos queryPos = QueryPos.getInstance(sqlQuery);
            queryPos.add(userId);
            queryPos.add(type);
            queryPos.add(end - start);
            queryPos.add(start);

            List<Object[]> result = sqlQuery.list();

            return formatResult(result);
        } catch (

        ORMException e) {
            return new ArrayList<>();
        } finally {
            closeSession(session);
        }
    }

    public long countTypeForUser(long userId, String type) {
        Session session = null;
        try {
            session = openSession();
            String queryString = customSQL.get(getClass(), "countTypeForUser");

            SQLQuery sqlQuery = session.createSQLQuery(queryString);
            sqlQuery.setCacheable(false);

            QueryPos queryPos = QueryPos.getInstance(sqlQuery);
            queryPos.add(userId);
            queryPos.add(type);

            BigInteger result = (BigInteger) sqlQuery.uniqueResult();

            return result.longValue();
        } catch (ORMException e) {
            return 0;
        } finally {
            closeSession(session);
        }
    }

    private List<HashMap<String, Object>> formatResult(List<Object[]> result) {
        List<HashMap<String, Object>> finalResult = new ArrayList<>();
        for (Object[] objects : result) {
            HashMap<String, Object> event = new HashMap<>();

            event.put("ipAddress", objects[0]);
            event.put("type", objects[1]);
            event.put("userId", Long.parseLong(String.valueOf(objects[2])));
            event.put("userEventId", Long.parseLong(String.valueOf(objects[3])));
            event.put("createDate", String.valueOf(objects[4]));
            event.put("screenName", objects[5]);
            finalResult.add(event);
        }
        return finalResult;
    }
}
