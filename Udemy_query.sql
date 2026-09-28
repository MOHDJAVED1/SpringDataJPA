use mydb;

create table product(
    id int PRIMARY KEY,
    name varchar(20),
    description varchar(100),
    price decimal(8,3) 
);

create table employee(
    id int,
    name varchar(20) 
);

create table employee(
    id int PRIMARY KEY AUTO_INCREMENT,
    name varchar(20) 
);

create table id_gen(
    gen_name varchar(20) PRIMARY KEY,
    gen_val int(20)
);

select * from product;

INSERT INTO product value(1 , "Iwatch", "apple inc", 400);

INSERT INTO product VALUES (2, 'MacBook Pro', 'Apple Inc', 1999);
INSERT INTO product VALUES (3, 'AirPods Pro', 'Apple Inc', 249);
INSERT INTO product VALUES (4, 'Galaxy S24', 'Samsung', 899);
INSERT INTO product VALUES (5, 'Dell XPS 15', 'Dell', 1499);
INSERT INTO product VALUES (6, 'WH-1000XM5', 'Sony', 399);
INSERT INTO product VALUES (7, 'iPad Air', 'Apple Inc', 599);
INSERT INTO product VALUES (8, 'Kindle Paperwhite', 'Amazon', 149);
INSERT INTO product VALUES (9, 'Nintendo Switch', 'Nintendo', 349);
INSERT INTO product VALUES (10, 'MX Master 3S', 'Logitech', 99);
INSERT INTO product VALUES (11, 'Apple TV 4K', 'Apple Inc', 129);


select * from employee;
SELECT * from id_gen;


drop TABLE employee;

DELETE from product where id=1;