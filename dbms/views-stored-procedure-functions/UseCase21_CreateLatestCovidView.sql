-- Use Case 21: Create View for Latest COVID Data

CREATE VIEW latest_covid_data AS
SELECT
    c.country,
    c.report_date,
    c.confirmed_cases,
    c.deaths,
    c.recovered
FROM covid_cases c
WHERE c.report_date = (
    SELECT MAX(report_date)
    FROM covid_cases
    WHERE country = c.country
);
