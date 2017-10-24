
create database mts;
use mts;

create table ACCOUNTS(
	num varchar(255) not null,
	balance double precision not null, 
	acc_type varchar(255), 
	primary key (num)
); 

insert into ACCOUNTS values('1',1000.00,'SAVING')
insert into ACCOUNTS values('2',1000.00,'SAVING')