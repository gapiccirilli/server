use flicks_feed;

create table posts (
	id int,
	title varchar(100),
    genre varchar(100),
    director varchar(100),
    rated varchar(10),
    released datetime,
    rotten_score tinyint,
    imdb_score tinyint,
    rating tinyint,
    content varchar(255),
    image varchar(255)
);

create table comments (
	id int,
    content varchar(255),
    post_id int
);

create table conversations (
	id int,
    post_id int
);

create table messages (
	id int,
    message varchar(255),
    conversation_id int
);

create table friends (
	id int,
    user_sender int,
    user_receiver int,
	request_sent datetime,
    request_accepted datetime,
    request_denied datetime
);

create table likes (
	id int,
    user_id int,
    post_id int
);

create table users (
	id int,
    username varchar(25),
    email varchar(255),
    password varchar(255),
    profile_image varchar(255)
);

