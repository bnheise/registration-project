create table UserProfile_GeneralProfile (
	uuid_ VARCHAR(75) null,
	generalProfileId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	aboutMe VARCHAR(75) null,
	favoriteQuotes VARCHAR(75) null
);

create table UserProfile_Genre (
	uuid_ VARCHAR(75) null,
	genreId LONG not null primary key,
	genreName VARCHAR(75) null
);

create table UserProfile_MovieInterest (
	uuid_ VARCHAR(75) null,
	movieInterestId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	favoriteGenreId LONG,
	favoriteMovie VARCHAR(75) null,
	leastFavMovie VARCHAR(75) null,
	favoriteActor VARCHAR(75) null
);

create table UserProfile_UserProfile (
	uuid_ VARCHAR(75) null,
	userId LONG not null primary key,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	screenName VARCHAR(75) null,
	male BOOLEAN,
	birthYear INTEGER,
	birthMonth INTEGER,
	birthDay INTEGER,
	aboutMe VARCHAR(75) null,
	favoriteQuotes VARCHAR(75) null,
	favoriteMovie VARCHAR(75) null,
	favoriteGenre VARCHAR(75) null,
	favoriteGenreId LONG,
	leastFavMovie VARCHAR(75) null,
	favoriteActor VARCHAR(75) null
);