SELECT cat.name AS category_name,
       COUNT(fc.film_id) AS total_films
FROM category cat
JOIN film_category fc ON cat.category_id = fc.category_id
GROUP BY cat.name
ORDER BY total_films DESC;
