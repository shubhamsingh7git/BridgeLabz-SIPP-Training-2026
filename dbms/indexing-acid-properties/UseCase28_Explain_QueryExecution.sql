
-- Use Case 28: Analyze Query Execution Plans

EXPLAIN
SELECT
    c.country,
    c.report_date,
    v.vaccinated_population
FROM covid_cases c
JOIN covid_vaccinations v
ON c.country = v.country
WHERE c.report_date = '2024-01-01';

-- Check possible missing indexes:
-- SHOW INDEX FROM covid_cases;
-- SHOW INDEX FROM covid_vaccinations;
