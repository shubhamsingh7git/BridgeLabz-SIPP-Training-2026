-- Use Case 19
SELECT country,
       vaccinated_population AS population_count,
       'Vaccinated' AS category
FROM covid_vaccinations

UNION

SELECT country,
       (total_population - vaccinated_population) AS population_count,
       'Unvaccinated' AS category
FROM covid_vaccinations
ORDER BY country;
