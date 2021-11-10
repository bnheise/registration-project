create table Monitor_UserEvent (
	uuid_ VARCHAR(75) null,
	userEventId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	title VARCHAR(75) null,
	ipAddress VARCHAR(75) null,
	type_ VARCHAR(75) null
);

create table Monitor_UserEvents (
	uuid_ VARCHAR(75) null,
	userEventId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ipAddress VARCHAR(75) null,
	type_ VARCHAR(75) null,
	screenName VARCHAR(75) null
);