
-- Use Case 30: Demonstrate Isolation Levels

-- Transaction 1: Prevent dirty reads
SET TRANSACTION ISOLATION LEVEL READ COMMITTED;

START TRANSACTION;

SELECT *
FROM covid_cases
WHERE country='India';

COMMIT;


-- Transaction 2: Prevent non-repeatable reads
SET TRANSACTION ISOLATION LEVEL REPEATABLE READ;

START TRANSACTION;

SELECT deaths
FROM covid_cases
WHERE country='India';

SELECT deaths
FROM covid_cases
WHERE country='India';

COMMIT;


-- Transaction 3: Prevent phantom reads
SET TRANSACTION ISOLATION LEVEL SERIALIZABLE;

START TRANSACTION;

SELECT *
FROM covid_cases
WHERE confirmed_cases > 1000000;

COMMIT;


-- MySQL examples:
-- READ UNCOMMITTED  -> Allows dirty reads
-- READ COMMITTED    -> Prevents dirty reads
-- REPEATABLE READ   -> Prevents non-repeatable reads
-- SERIALIZABLE      -> Prevents phantom reads
