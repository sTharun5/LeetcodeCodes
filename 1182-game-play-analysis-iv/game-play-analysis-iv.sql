SELECT 
    ROUND(COUNT(a.player_id) / COUNT(DISTINCT f.player_id), 2) AS fraction
FROM 
    (SELECT player_id, MIN(event_date) + INTERVAL 1 DAY AS next_day
     FROM Activity
     GROUP BY player_id) f
LEFT JOIN 
    Activity a
ON f.player_id = a.player_id AND f.next_day = a.event_date;