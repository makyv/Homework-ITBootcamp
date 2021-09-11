SELECT e.first_name, e.last_name, e.phone_number, e.email, r.region_name
FROM regions r JOIN countries cs ON r.region_id = cs.region_id 
JOIN locations l ON l.country_id = cs.country_id
JOIN departments d ON l.location_id = d.location_id
JOIN employees e ON d.department_id = e.department_id
WHERE e.phone_number IS NOT NULL 
AND r.region_name = 'Europe'


WITH new_table(avg_salary) AS 
	(SELECT AVG(salary) FROM employees)
SELECT d.relationship, d.first_name, e.salary, ROUND(nt.avg_salary, 2) AS avg_salary
FROM dependents d JOIN employees e ON d.employee_id = e.employee_id, new_table AS nt
WHERE e.salary > nt.avg_salary



SELECT country_name, SUM(salary)
FROM  locations l JOIN countries cs ON l.country_id = cs.country_id
JOIN departments d ON l.location_id = d.location_id
JOIN employees e ON d.department_id = e.department_id
GROUP BY country_name
ORDER BY SUM(salary) DESC;
