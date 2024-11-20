/*
[과제] 키오스크 개발 - 필요한 데이터베이스 구축 하기
	- 요구사항
		1. 여러개 카테고리 중에 하나의 카테고리를 선택하여 카테고리별 제품들을 출력a
        2. 해당 제품을 선택하여 수량 입력받아 주문 처리
        3. 주문번호를 받아서 대기한다.
	- 메모리 설계 필수 필드 속성
		1. 카테고리명 2. 제품명 3. 가격 4. 주문수량 5. 주문날짜
	- 핵심 : 여러 테이블 구성 할때는 테이블간에 데이터 중복을 최소화 한다.
    - 제출 : 위 주제에 따른 데이터베이스와 테이블 생성을 하기 위한 sql제출
    itdanja@kakao.com
*/
drop database if exists kiosk;
create database kiosk;
use kiosk;
create table coffee(
	kategorie varchar(20),
	coffee_name varchar(20),
    coffee_price int,
    order_quantity int,
    order_date date
);
create table non_coffee(
	kategorie varchar(20),
	non_coffee_name varchar(20),
    non_coffee_price int,
    order_quantity int,
    order_date date
);
create table drink(
	kategorie varchar(20),
	drink_name varchar(20),
    drink_price int,
    order_quantity int,
    order_date date
);
create table snack(
	kategorie varchar(20),
	snack_name varchar(20),
    snack_price int,
    order_quantity int,
    order_date date
);

show tables;
select * from coffee;
select * from non_coffee;
select * from drink;
select * from snack;
