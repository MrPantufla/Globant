USE nba;

#POSICION CANDADO A = 2
SELECT COUNT(Asistencias_por_partido)
	FROM estadisticas
    WHERE Asistencias_por_partido = (
		SELECT MAX(Asistencias_por_partido)
			FROM estadisticas);
            
#CLAVE CANDADO A = 14043
SELECT  SUM(j.peso)
	FROM jugadores j
    INNER JOIN equipos e ON e.Nombre = j.Nombre_equipo
    WHERE e.Conferencia = 'East' AND j.Posicion LIKE '%C%';
    
#POSICION CANDADO B = 3
SELECT COUNT(j.codigo)
	FROM jugadores j
    JOIN estadisticas e ON jugador=j.codigo
    WHERE e.Asistencias_por_partido > (
		SELECT COUNT(j.codigo)
			FROM jugadores j
			WHERE j.Nombre_equipo='Heat'
    );
    
#CLAVE CANDADO B = 3480
SELECT COUNT(codigo)
	FROM partidos
    WHERE temporada LIKE '%99%';
    
#POSICION CANDADO C = 1
SELECT ROUND(((COUNT(codigo) / (
    SELECT COUNT(codigo)
		FROM jugadores
		WHERE peso >= 195)) + 0.9945))
FROM jugadores j
JOIN equipos e 
	ON j.Nombre_equipo = e.Nombre
WHERE Procedencia = 'Michigan' AND e.Conferencia = 'West';

#CLAVE CANDADO C = 631
SELECT FLOOR(AVG(Puntos_por_partido)+COUNT(Asistencias_por_partido)+SUM(Tapones_por_partido))
	FROM estadisticas e
    JOIN jugadores j
		ON e.jugador=j.codigo
	JOIN equipos eq
		ON j.Nombre_equipo=eq.Nombre
	WHERE division='Central';

#POSICION CANDADO D = 4
SELECT ROUND(Tapones_por_partido)
	FROM estadisticas e
    JOIN jugadores j
		ON e.Jugador=j.codigo
	WHERE j.Nombre='Corey Maggette' AND e.temporada='00/01';
    
#CLAVE CANDADO D = 191
SELECT FLOOR(SUM(Puntos_por_partido))
	FROM estadisticas e
    JOIN jugadores j
		ON e.Jugador=j.codigo
	WHERE j.Procedencia='Argentina';