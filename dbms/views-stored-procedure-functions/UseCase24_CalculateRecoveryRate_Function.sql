-- Use Case 24: Recovery Rate Function

DELIMITER //

CREATE FUNCTION CalculateRecoveryRate(
    input_country VARCHAR(100)
)
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN

    DECLARE recovery_rate DECIMAL(10,2);

    SELECT
        (recovered / confirmed_cases) * 100
    INTO recovery_rate
    FROM covid_cases
    WHERE country = input_country
    ORDER BY report_date DESC
    LIMIT 1;

    RETURN IFNULL(recovery_rate,0);

END //

DELIMITER ;

-- Example:
-- SELECT CalculateRecoveryRate('India');
