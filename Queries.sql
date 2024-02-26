
-- find the member by first_name and phone_number
SELECT *
FROM library_member
WHERE first_name = 'Bob' AND phone_number = 5556667777;

-- display all the members
SELECT DISTINCT first_name, last_name
FROM library_member;


-- list all the books a member has checked out
SELECT b.title
FROM checkout c
JOIN book_isbn bi ON c.isbn = bi.isbn
JOIN book b ON bi.book_id = b.book_id
WHERE c.member_id = 1;


-- checkout a book for a given member and given book
SELECT DISTINCT *
FROM book_isbn AS bi
JOIN book AS b ON bi.book_id = b.book_id
JOIN library_member AS lm ON lm.first_name = 'Bob'
WHERE b.title = '1984' AND lm.first_name = 'Bob';

-- list avaialble books and quantity that can be checked out
Select title, quantity from book where quantity is not null;


-- list all the checkouts that are due in two days
Select * from checkout where due_date between '2024-02-28 00:00:00' AND'2024-02-28 23:59:59';


-- list all the checkouts that are over due 
Select * from checkout where due_date < current_timestamp();

-- list all the books that are checked out today
Select * from checkout where due_date between '2024-02-26 00:00:00' AND'2024-02-26 23:59:59';

-- create a book

INSERT INTO book (book_id, title, author_name, year_published, quantity)
VALUES
(7, 'The Hill', 'joe hidden', 2002, 15);

Select * from book;


-- display all isbns and their checkout status along with book information ( tital, author etc,.)

Select c.isbn, c.is_returned, b.title, b.author_name 
from checkout c
Join book_isbn bi On c.isbn = bi.isbn 
Join book b On b.book_id = bi.book_id;






