
-- Use Case 27: Covering Index for Top 10 Infection Rate Queries

CREATE INDEX idx_infection_rate_covering
ON covid_cases(infection_rate, country, confirmed_cases, deaths);

-- Example optimized query
SELECT country, infection_rate
FROM covid_cases
ORDER BY infection_rate DESC
LIMIT 10;
