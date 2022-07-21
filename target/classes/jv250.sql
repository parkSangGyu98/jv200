CREATE TABLE Sample10 (
   no           INT(11)       DEFAULT NULL, 
   name       VARCHAR(20)    DEFAULT NULL,
   birthday    DATE          DEFAULT NULL,
   address    VARCHAR(40)     DEFAULT NULL
);

SELECT * FROM Sample10;

INSERT INTO Sample10 VALUES(1, '유비', '1996-10-25', '대구 중구 반월당');
INSERT INTO Sample10 VALUES(2, '관우', '1997-10-25', '울산 남구 야음동');
INSERT INTO Sample10 VALUES(3, '장비', '1998-10-25', '대구 북구 대현동');

----------------------------------------------------------------------------------------------------------------------------

CREATE TABLE Customer (
   cid            BIGINT          PRIMARY KEY AUTO_INCREMENT,
   name           VARCHAR(20)       NOT NULL,
   ssn           VARCHAR(14)     NOT NULL,
   phone          VARCHAR(14)      NOT NULL,
   customerId    VARCHAR(16)       NOT NULL,
   passwd         VARCHAR(16)       NOT NULL,
   regDate         TIMESTAMP         NOT NULL    DEFAULT CURRENT_TIMESTAMP
) AUTO_INCREMENT = 1001;

SELECT * FROM Customer; 

INSERT INTO Customer (name, ssn, phone, customerId, passwd) VALUES ('유비','901213-1234567','010-2323-2323','java','1111');
INSERT INTO Customer (name, ssn, phone, customerId, passwd) VALUES ('관우','901234-5678910','010-1212-1212','java','2222');
INSERT INTO Customer (name, ssn, phone, customerId, passwd) VALUES ('장비','904321-9876543','010-3434-3434','java','3333');

UPDATE Customer SET ssn = '901212-1234567', phone = '010-7878-7878', customerId = 'Mysql' WHERE cid = 1005;
UPDATE Customer SET customerId = 'hello' where cid = 1007;

DELETE FROM Customer WHERE cid = 1009; 

--------------------------------------------------------------------------------------------------------------------------

CREATE TABLE Account(
   aid            BIGINT         PRIMARY KEY AUTO_INCREMENT,
   accountNum      VARCHAR(11)      NOT NULL,   /*--111-11-1111*/
   balance       DOUBLE         NOT NULL   DEFAULT 0.0,
   interestRate   DOUBLE         NOT NULL   DEFAULT 0.0,
   overdraft      DOUBLE         NOT NULL   DEFAULT 0.0,
   accountType      CHAR(1)         NOT NULL   DEFAULT 'S',
   customerId       BIGINT         NOT NULL,   /* type이 BIGINT인 이유는 foreign key 이기때문에 Customer테이블의 type으로 똑같이 반영된다 */
   regDate         TIMESTAMP         NOT NULL    DEFAULT CURRENT_TIMESTAMP,
   CONSTRAINT ACCOUNT_customerId_FK FOREIGN KEY (customerId) REFERENCES Customer(cid) 
   /* customerId는 foreignkey이며, Customer테이블에 cid에서 반영한것이다 */
) AUTO_INCREMENT = 3001;

SELECT * FROM Account;

INSERT INTO Account (accountNum, balance, interestRate, overdraft, accountType , customerId)
VALUES  ('123-45-6789', 10000.0 , 0.03 , 20000.0 , 'C' , 1001),
      ('123-45-1234', 5000.0 , 0.0 , 20000.0 , 'C' , 1002),
      ('123-45-7777', 20000.0 , 0.05 , 20000.0 , 'C' , 1003);

DROP TABLE Account;

-- inner join
SELECT * FROM Account, Customer WHERE Account.customerId = Customer.cid
AND Customer.ssn = '981212-1111111';

SELECT * FROM Account a INNER JOIN Customer c ON a.customerId = c.cid;
SELECT * FROM Account a INNER JOIN Customer c ON a.customerId = c.cid WHERE c.ssn = '981212-1111111';

SELECT * FROM CUSTOMER;

DELETE FROM Customer WHERE name = '여포';


   