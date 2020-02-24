drop table if exists account cascade
drop sequence if exists hibernate_sequence
create sequence hibernate_sequence start 1 increment 1
create table account (id int8 not null, nick_name varchar(255), password varchar(255), user_name varchar(255), primary key (id))