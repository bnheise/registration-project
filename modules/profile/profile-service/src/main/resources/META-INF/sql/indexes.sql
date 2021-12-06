create index IX_5268CA62 on UserProfile_GeneralProfile (userId);
create index IX_AABB621C on UserProfile_GeneralProfile (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_58ADBF9E on UserProfile_GeneralProfile (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_F4EBF84C on UserProfile_Genre (uuid_[$COLUMN_LENGTH:75$]);

create index IX_C71595D9 on UserProfile_MovieInterest (userId);
create index IX_C87584D3 on UserProfile_MovieInterest (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_912F2415 on UserProfile_MovieInterest (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_454E4811 on UserProfile_UserProfile (uuid_[$COLUMN_LENGTH:75$]);