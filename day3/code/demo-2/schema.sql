
create database shop;
use shop;

CREATE TABLE publisher (
  code VARCHAR(6) PRIMARY KEY,
  name VARCHAR(64) NOT NULL,
  address VARCHAR(128) NOT NULL,
  UNIQUE (name)
);
CREATE TABLE book (
  isbn VARCHAR(13) PRIMARY KEY,
  name VARCHAR(64) NOT NULL,
  publish_date DATE,
  price DECIMAL(8, 2),
  publisher VARCHAR(6),
  FOREIGN KEY (publisher) REFERENCES publisher (code),
  UNIQUE (name)
);
CREATE TABLE chapter (
  id INT PRIMARY KEY,
  title VARCHAR(64) NOT NULL,
  isbn VARCHAR(6),
  FOREIGN KEY (isbn) REFERENCES book (isbn),
  UNIQUE (title)
);


insert into PUBLISHER(code, name, address)
values ('001', 'Apress', 'New York ,New York');
insert into PUBLISHER(code, name, address)
values ('002', 'Manning', 'San Francisco, CA');

insert into book(isbn, name, publisher, publishDate, price)
values ('PBN123', 'Spring Recipes', '001', DATE('2008-02-02'), 30);
insert into book(isbn, name, publisher, publishDate, price)
values ('PBN456', 'Hibernate Recipes', '002', DATE('2008-11-02'), 40);