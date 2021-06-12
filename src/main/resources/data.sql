/*
create table person
(
    id integer not null,
    name varchar(255) not null,
    location varchar(255),
    birth_date timestamp,
    primary key(id)
);

insert into person(id,name,location,birth_date) 
values(101,'Pramod','Pune',sysdate());

insert into person(id,name,location,birth_date) 
values(102,'Amol','Mangaon',sysdate());

insert into person(id,name,location,birth_date) 
values(103,'Jayesh','Shrivardhan',sysdate());

insert into person(id,name,location,birth_date) 
values(104,'Kalyan','Sangli',sysdate());
*/
/*  Spring Security Data*/
/*
insert into users(username,password,enabled) values ('pramod','Pramod123',true);
insert into users(username,password,enabled) values ('amol','Amol',true);

insert into authorities (username,authority) values ('pramod','ROLE_ADMIN');
insert into authorities (username,authority) values ('amol','ROLE_USER');

*/