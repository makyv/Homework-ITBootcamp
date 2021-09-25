
SELECT e.first_name, e.last_name, e.phone_number, e.email, r.region_name
FROM regions r JOIN countries cs ON r.region_id = cs.region_id 
JOIN locations l ON l.country_id = cs.country_id
JOIN departments d ON l.location_id = d.location_id
JOIN employees e ON d.department_id = e.department_id
WHERE e.phone_number IS NOT NULL 
AND r.region_name = 'Europe'


SELECT first_name, last_name FROM dependents
WHERE relationship = 'Child' AND employee_id IN(
	SELECT employee_id FROM employees
  	WHERE salary = (
    	SELECT MAX(salary) FROM employees
    )
);



SELECT country_name, SUM(salary)
FROM  locations l JOIN countries cs ON l.country_id = cs.country_id
JOIN departments d ON l.location_id = d.location_id
JOIN employees e ON d.department_id = e.department_id
GROUP BY country_name
ORDER BY SUM(salary) DESC;
