/* INSERT
* INSERT INTO 테이블명 (컬럼명, 컬럼명, ...)
* VALUES (값, 값, ...)
*
*/
insert into ADDRS(postno, bas_addr) values('100-100', '서울 강남구');
insert into ADDRS(postno, bas_addr) values('100-101', '서울 서초구');
insert into ADDRS(postno, bas_addr) values('100-102', '서울 마포구');
insert into ADDRS(postno, bas_addr) values('100-103', '서울 영등포구');
insert into ADDRS(postno, bas_addr) values('100-104', '서울 송파구');
insert into ADDRS(postno, bas_addr) values('100-105', '서울 관악구');
insert into ADDRS(postno, bas_addr) values('100-106', '서울 동작구');
insert into ADDRS(postno, bas_addr) values('100-107', '서울 강동구');
insert into ADDRS(postno, bas_addr) values('100-108', '서울 중구');
insert into ADDRS(postno, bas_addr) values('100-109', '서울 은평구');

select * from ADDRS

insert into MEMBERS(UID,PWD,EMAIL,UNAME,TEL)
values('u01','1111','u01@test.com','홍길동','111-1111');
insert into MEMBERS(UID,PWD,EMAIL,UNAME,TEL)
values('u02','1111','u02@test.com','임꺽정','111-1111');
insert into MEMBERS(UID,PWD,EMAIL,UNAME,TEL)
values('u03','1111','u03@test.com','유관순','111-1111');
insert into MEMBERS(UID,PWD,EMAIL,UNAME,TEL)
values('u04','1111','u04@test.com','안중근','111-1111');
insert into MEMBERS(UID,PWD,EMAIL,UNAME,TEL)
values('u05','1111','u05@test.com','윤봉길','111-1111');
insert into MEMBERS(UID,PWD,EMAIL,UNAME,TEL)
values('u06','1111','u06@test.com','이순신','111-1111');
insert into MEMBERS(UID,PWD,EMAIL,UNAME,TEL)
values('u07','1111','u07@test.com','김구','111-1111');
insert into MEMBERS(UID,PWD,EMAIL,UNAME,TEL)
values('u08','1111','u08@test.com','김좌진','111-1111');
insert into MEMBERS(UID,PWD,EMAIL,UNAME,TEL)
values('u09','1111','u09@test.com','안창호','111-1111');
insert into MEMBERS(UID,PWD,EMAIL,UNAME,TEL)
values('u10','1111','u10@test.com','이봉창','111-1111');

insert into MAKERS(MKNAME,HOME,TEL)
value('애플','www.apple.com','100-1001');

insert into MAKERS(MKNAME,HOME,TEL)
value('삼성','www.samsung.com','100-1002');

insert into MAKERS(MKNAME,HOME,TEL)
value('LG','www.lg.com','100-1003');

insert into MAKERS(MKNAME,HOME,TEL)
value('IBM','www.ibm.com','100-1004');

insert into MAKERS(MKNAME,HOME,TEL)
value('인텔','www.intel.com','100-1005');

insert into MAKERS(MKNAME,HOME,TEL)
value('구글','www.google.com','100-1006');

insert into PRODUCTS(PNAME,QTY,MKNO)
values('아이폰6',100,1);

insert into PRODUCTS(PNAME,QTY,MKNO)
values('아이폰5',100,1);

insert into PRODUCTS(PNAME,QTY,MKNO)
values('아이패드',50,1);

insert into PRODUCTS(PNAME,QTY,MKNO)
values('갤럭시S5',2000,2);

insert into PRODUCTS(PNAME,QTY,MKNO)
values('갤럭시S4',1000,2);

insert into PRODUCTS(PNAME,QTY,MKNO)
values('갤럭시노트',500,2);

insert into PRODUCTS(PNAME,QTY,MKNO)
values('구글글라스',10000,6);

insert into PRODUCTS(PNAME,QTY,MKNO)
values('넥서스7',100,6);

insert into PROD_PHOTS(PNO, URL)
values(1, 'a01.gif');

insert into PROD_PHOTS(PNO, URL)
values(2, 'a02.gif');

insert into PROD_PHOTS(PNO, URL)
values(4, 'a04.gif');

insert into PROD_PHOTS(PNO, URL)
values(5, 'a05.gif');

insert into PROD_PHOTS(PNO, URL)
values(7, 'a07.gif');

insert into ORDERS(PNO, UID, QTY, ODATE)
values(1, 'u01', 1, '2014-05-07');

insert into ORDERS(PNO, UID, QTY, ODATE)
values(1, 'u02', 3, '2014-06-07');

insert into ORDERS(PNO, UID, QTY, ODATE)
values(2, 'u01', 3, '2014-07-07');

insert into ORDERS(PNO, UID, QTY, ODATE)
values(2, 'u05', 1, '2014-08-07');

insert into ORDERS(PNO, UID, QTY, ODATE)
values(3, 'u07', 6, '2014-09-07');

insert into ORDERS(PNO, UID, QTY, ODATE)
values(7, 'u10', 1, '2014-10-07');











