-- Use Case 23: Stored Procedure for Updating COVID Statistics

DELIMITER //

CREATE PROCEDURE UpdateCovidStats(
    IN input_country VARCHAR(100),
    IN input_date DATE,
    IN new_confirmed INT,
    IN new_deaths INT,
    IN new_recovered INT
)
BEGIN

    START TRANSACTION;

    UPDATE covid_cases
    SET
        confirmed_cases = new_confirmed,
        deaths = new_deaths,
        recovered = new_recovered
    WHERE country = input_country
    AND report_date = input_date;

    COMMIT;

END //

DELIMITER ;

-- Example:
-- CALL UpdateCovidStats('India','2024-01-01',100000,2000,95000);
