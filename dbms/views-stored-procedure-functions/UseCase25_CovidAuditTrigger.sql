-- Use Case 25: Audit Trigger for Data Changes

CREATE TABLE IF NOT EXISTS covid_cases_audit (
    audit_id INT AUTO_INCREMENT PRIMARY KEY,
    country VARCHAR(100),
    old_confirmed INT,
    new_confirmed INT,
    old_deaths INT,
    new_deaths INT,
    old_recovered INT,
    new_recovered INT,
    changed_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

DELIMITER //

CREATE TRIGGER before_covid_cases_update
BEFORE UPDATE ON covid_cases
FOR EACH ROW
BEGIN

    INSERT INTO covid_cases_audit(
        country,
        old_confirmed,
        new_confirmed,
        old_deaths,
        new_deaths,
        old_recovered,
        new_recovered
    )
    VALUES(
        OLD.country,
        OLD.confirmed_cases,
        NEW.confirmed_cases,
        OLD.deaths,
        NEW.deaths,
        OLD.recovered,
        NEW.recovered
    );

END //

DELIMITER ;
