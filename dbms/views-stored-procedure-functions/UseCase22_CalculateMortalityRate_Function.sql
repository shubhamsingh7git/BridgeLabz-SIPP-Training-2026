-- Use Case 22: Mortality Rate Function

DELIMITER //

CREATE FUNCTION CalculateMortalityRate(
    input_country VARCHAR(100),
    input_date DATE
)
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    DECLARE mortality_rate DECIMAL(10,2);

    SELECT
        (deaths / confirmed_cases) * 100
    INTO mortality_rate
    FROM covid_cases
    WHERE country = input_country
    AND report_date = input_date;

    RETURN IFNULL(mortality_rate,0);
END //

DELIMITER ;

-- Example:
-- SELECT CalculateMortalityRate('India','2024-01-01');
