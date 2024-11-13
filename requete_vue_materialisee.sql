CREATE MATERIALIZED VIEW project_task_count AS
SELECT p.projet_id AS project_id,
       p.name AS project_name,
       COUNT(t.task_id) AS task_count
FROM projet p
LEFT JOIN task t ON p.projet_id = t.projet_id
GROUP BY p.projet_id, p.name;
