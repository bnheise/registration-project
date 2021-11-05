create index IX_53C12AC3 on Monitor_UserEvents (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E20B8605 on Monitor_UserEvents (uuid_[$COLUMN_LENGTH:75$], groupId);