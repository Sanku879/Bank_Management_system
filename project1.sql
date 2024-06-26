create database bankmanagement;

show databases;

use bankmanagement;

create table signup(formno varchar(20),name varchar(20),fname varchar(20),DOB varchar(20),gender varchar(20),email varchar(30),marital varchar(20),address varchar(50),city varchar(20),State varchar(20),pin varchar(20));

select * from signup;

create table signuptwo(formno varchar(20),Religion varchar(20),Income varchar(20),Qualification varchar(20),Occupation varchar(20),PanNo varchar(20),Aadhar_No varchar(20),Senior_citizen varchar(20),Existing_Account varchar(20));

select * from signuptwo;

create table Signupthree(formno varchar(20),account_type varchar(25),cardnum varchar(25),pinNum varchar(20),facility varchar(20));

create table login(formno varchar(20),cardnum varchar(25),pinNum varchar(20));

use bankmanagement;
select * from Signupthree;

select * from login;

select * from bank;

create table bank(pinNum varchar(20), date varchar(50),type varchar(20),amount varchar(20));
drop table bank;
select * from bank;
