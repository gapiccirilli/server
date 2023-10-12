use flicks_feed;

create table posts (
	id int NOT NULL AUTO_INCREMENT,
	title varchar(100) NOT NULL,
    genre varchar(100),
    director varchar(100),
    rated varchar(10),
    released datetime,
    rotten_score tinyint,
    imdb_score tinyint,
    rating tinyint,
    content varchar(255),
    image varchar(255),
    PRIMARY KEY (id)
);

create table comments (
	id int NOT NULL AUTO_INCREMENT,
    content varchar(255),
    post_id int NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (post_id) REFERENCES posts(id)
);

create table conversations (
	id int NOT NULL AUTO_INCREMENT,
    post_id int NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (post_id) REFERENCES posts(id)
);

create table messages (
	id int NOT NULL AUTO_INCREMENT,
    message varchar(255),
    conversation_id int NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (conversation_id) REFERENCES conversations(id)
);

create table friends (
	id int NOT NULL AUTO_INCREMENT,
    user_sender int NOT NULL,
    user_receiver int NOT NULL,
	request_sent datetime,
    request_accepted datetime,
    request_denied datetime,
    PRIMARY KEY (id),
    FOREIGN KEY (user_sender) REFERENCES users (id)
);

create table likes (
	id int NOT NULL AUTO_INCREMENT,
    user_id int NOT NULL,
    post_id int NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (post_id) REFERENCES posts (id)
);

create table users (
	id int NOT NULL AUTO_INCREMENT,
    username varchar(25) NOT NULL,
    email varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    profile_image varchar(255),
    PRIMARY KEY(id)
);

