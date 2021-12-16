create table Newsletter_Article (
	issueNumber LONG not null primary key,
	title VARCHAR(75) null,
	author VARCHAR(75) null,
	order_ INTEGER,
	content VARCHAR(75) null
);

create table Newsletter_Issue (
	issueNumber LONG not null primary key,
	title VARCHAR(75) null,
	description VARCHAR(75) null,
	issueDate DATE null,
	byline VARCHAR(75) null
);