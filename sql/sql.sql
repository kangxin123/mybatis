DROP TABLE IF EXISTS people;
 CREATE TABLE people(
   people_id VARCHAR(32) PRIMARY KEY,
   people_name VARCHAR(32) 
 );
 DROP TABLE IF EXISTS card;
 CREATE TABLE card(
   card_id VARCHAR(32) PRIMARY KEY,
   people_id VARCHAR(32) ,
   address  VARCHAR(255) 
 );

 INSERT INTO people VALUES ('1','王菲' ),('2','王大拿');
 INSERT INTO card VALUES('aaa110','1','北京'),('bbbb100','2','东莞');
 
 drop table if exists palyer;
 create table player(
   player_id int(11) primary key,
   player_name varchar(32) ,
   team_id int(11)
 );
 
 
 insert into player values(1,'易建联',1),(2,'易建联2',1),(3,'奥巴马',2),(4,'川普',3);
 
 drop table if exists author;
 create table author(
   author_id int(11) primary key,
   author_name varchar(32)
 );
 
  drop table if exists blog;
 create table blog(
   blog_id int(11) primary key,
   blog_title varchar(255),
   blog_content varchar(10000),
   author_id int(11)
 );
 
 
  drop table if exists comment;
  create table comment(
   comment_id int(11) primary key,
   comment_content varchar(255),
   blog_id int(11)
 );
 
 
 
 
 
 
 