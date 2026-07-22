
-- Use Case 29: ACID Transaction for Vaccine Data

START TRANSACTION;

INSERT INTO vaccine_distribution(
    country,
    vaccine_name,
    doses_received,
    distribution_date
)
VALUES
('India','Covaxin',100000,'2024-01-01');

INSERT INTO vaccination_centers(
    country,
    center_name,
    available_doses
)
VALUES
('India','Delhi Center',100000);

-- If all statements succeed
COMMIT;

-- If any statement fails
-- ROLLBACK;
