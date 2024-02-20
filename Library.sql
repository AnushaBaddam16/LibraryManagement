create schema lms;
show databases;
use lms;
create table member(memberId Integer primary key,  firstName Varchar(30),lastName varchar(30),emailAddress varchar(50),phoneNumber bigint);
alter table member add homeAddress varchar(30);
describe member;

create table Books (bookId integer primary key,title varchar(30),author varchar(30),isbn varchar(20),price integer,genre varchar(20));
alter table Books add price Double;
describe Books;
drop table Books;


