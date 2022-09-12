create table hibernate_sequence
(
    nex_val bigint
);

insert into hibernate_sequence
values (1);

insert into hibernate_sequence
values (1);

CREATE TABLE user_table
(
    id INT GENERATED ALWAYS AS IDENTITY,
    password varchar(64) not null,
    username varchar(64) not null unique
);

CREATE TABLE todo
(
    id        INT      GENERATED ALWAYS AS IDENTITY,
    title     varchar(64) not null,
    completed boolean     not null
)