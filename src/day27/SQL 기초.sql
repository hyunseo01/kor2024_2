/*여러줄 주석*/
#한줄 주석
-- 한줄 주석

/*
	[SQL 작성 또는 실행 하는 방법]
    1. SQL 문법을 작성한다. show databases
    2. SQL 문장이 끝나면 ;으로 마친다.
    3. 실행할 명령어 줄에 (마우스)커서 두고 ctrl enter(명령어 단위 실행) ctrl shift enter(전체 실행)
    4. 실행 결과는 하단에 [Result Grid] 창에서 확인 가능
*/
show databases; #데이터베이스 : 표/테이블, 기본 테이블 4개의 테이블명이 출력된다.

show variables like 'datadir'; #db server local path 확인

create database mydbtest1; #db server 데이터베이스 생성 
