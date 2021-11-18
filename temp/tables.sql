DROP VIEW useraddress;
CREATE VIEW useraddress
    AS SELECT 
        u.companyid,
        u.userid,
        u.emailaddress,
        u.screenname,
        CONCAT(u.firstname, ' ', SUBSTRING(u.lastname, 1, 1), '.') as name,
        a.zip
    FROM user_ u
    INNER JOIN address a
        USING(userid)
    WHERE
        a.primary_ = true;
