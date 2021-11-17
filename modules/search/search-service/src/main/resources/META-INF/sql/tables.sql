create table RegistrationSearch_UserAddress (
	userId LONG not null,
	copmanyId LONG not null,
	name VARCHAR(75) null,
	screenName VARCHAR(75) null,
	emailAddress VARCHAR(75) null,
	zip VARCHAR(75) null,
	primary key (userId, copmanyId)
);