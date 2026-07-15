-- Use Case 18
SELECT c1.state,
       c1.report_date,
       c1.confirmed_cases,
       CASE
           WHEN c1.confirmed_cases = (
               SELECT MAX(c2.confirmed_cases)
               FROM covid_cases c2
               WHERE c2.state = c1.state
           )
           THEN 'Peak Wave'
           ELSE 'Normal'
       END AS wave_status
FROM covid_cases c1
WHERE c1.state = 'Mumbai'
ORDER BY c1.report_date;
