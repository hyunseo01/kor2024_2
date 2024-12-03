drop database if exists mini_project01;
#데이터베이스 생성
create database mini_project01;
#데이터베이스 사용
use mini_project01;

create table User(
	user_no int auto_increment primary key unique,
    user_id varchar(20) not null unique,
    user_pwd int not null unique,
    user_name varchar(20) not null,
    user_phoneNo int not null unique,
    role enum('buyer', 'seller') not null
);

create table Categori(
	categori_no int auto_increment primary key,
    categori_name varchar(30) not null unique
);

create table Product(
	product_no int auto_increment primary key,
    product_name varchar(30) not null,
    price int not null,
    stock int not null,
    categori_no int,
    seller_no int,
    foreign key(categori_no) references Categori(categori_no),
    foreign key(seller_no) references User(user_no)
);

insert into user(user_id, user_pwd, user_name, user_phoneNo, role) values 
('aa1111', '1234', '유재석','01011112222', 'seller'
);
insert into user(user_id, user_pwd, user_name, user_phoneNo, role) values 
('bb2222', '1357', '강호동','01012345678', 'seller'
);
insert into user(user_id, user_pwd, user_name, user_phoneNo, role) values 
('cc3333', '123456', '이수근','01013572468', 'seller'
);
insert into user(user_id, user_pwd, user_name, user_phoneNo, role) values 
('dd4444', '2468', '노홍철','01098765432', 'seller'
);

select * from user where user_id = 'aa1111' and user_pwd = '1234';

insert into Categori(categori_name) values ('상의');
insert into Categori(categori_name) values ('하의');
insert into Categori(categori_name) values ('겉옷');
insert into Categori(categori_name) values ('신발');
select * from Categori;

insert into Product(product_name, price, stock, categori_no, seller_no) 
	values ('T-shirt', 15000, 10, 1, 1);
insert into Product(product_name, price, stock, categori_no, seller_no) 
	values ('pants', 10000, 10, 2, 2);
insert into Product(product_name, price, stock, categori_no, seller_no) 
	values ('outer', 30000, 5, 3, 3);
insert into Product(product_name, price, stock, categori_no, seller_no) 
	values ('shoes', 25000, 5, 4, 4);
select * from Product where product_no = 1;

select * from user;
select * from categori;
select * from product;






