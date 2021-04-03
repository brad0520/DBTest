# 기존에 t1 데이터베이스가 존재 한다면 삭제
DROP DATABASE IF EXISTS t1;

# 새 데이터베이스(`t1`) 생성
CREATE DATABASE t1;
USE t1;

# article 테이블 생성(칼럼은 id, title, body)
CREATE TABLE article(
id INT(5)  UNSIGNED PRIMARY KEY AUTO_INCREMENT,
`name` CHAR(50) NOT NULL,
address CHAR(100) NOT NULL,
phoneNumber INT(20) NOT NULL
);

SELECT * 
FROM article;

DESC article;

# 테스트 데이터 추가

INSERT INTO article
SET `name` = '홍길동',
address = '대전',
phoneNumber = '010-1234-5678';

INSERT INTO article
SET `name` = '홍길순',
address = '서울',
phoneNumber = '010-1234-1234';

INSERT INTO article
SET `name` = '임꺽정',
address = '부산',
phoneNumber = '010-6545-5678';

INSERT INTO article
SET `name` = '김철수',
address = '대구',
phoneNumber = '010-1346-8954';

INSERT INTO article
SET `name` = '이아름',
address = '광주',
phoneNumber = '010-3452-7855';

