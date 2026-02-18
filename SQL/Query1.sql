laptopnext_valSELECT c.customer_id,
       c.first_name,
       c.last_name,
       c.email
FROM customer c
JOIN address a ON c.address_id = a.address_id
JOIN city ci ON a.city_id = ci.city_id
JOIN country co ON ci.country_id = co.country_id
WHERE co.country = 'India'
ORDER BY customer_id ASC;
