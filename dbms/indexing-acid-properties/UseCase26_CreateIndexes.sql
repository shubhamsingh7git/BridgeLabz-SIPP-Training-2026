
-- Use Case 26: Create Indexes on Frequently Searched Columns

CREATE INDEX idx_country_date
ON covid_cases(country, report_date);

CREATE INDEX idx_report_date
ON covid_cases(report_date);
