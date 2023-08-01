SELECT * FROM nba.estadisticas;
/*CANDADO A POSICION:2*/
SELECT count(Asistencias_por_partido) FROM estadisticas 
WHERE Asistencias_por_partido=(SELECT max(Asistencias_por_partido) FROM estadisticas);
/*CANDADO A CLAVE:14043*/
SELECT sum(ju.Peso) as 'Suma total de pesos' FROM jugadores ju 
JOIN equipos eq on eq.Nombre=ju.Nombre_equipo
WHERE ju.Posicion like '%c%' and eq.Conferencia like 'East';
/*CANDADO B POSICION:3*/
SELECT count(ju.Nombre) FROM jugadores ju 
JOIN estadisticas es on es.jugador=ju.codigo
WHERE es.Asistencias_por_partido>(SELECT COUNT(ju.Nombre) FROM jugadores ju WHERE Nombre_equipo='HEAT');
/*CANDADO B CLAVE: 3480*/
SELECT count(*) FROM nba.partidos WHERE temporada like '%99%';
/*CANDADO C POSICION:1*/
SELECT count(*) FROM jugadores ju 
JOIN equipos eq on eq.Nombre=ju.Nombre_equipo
WHERE ju.Procedencia like 'Michigan' and eq.Conferencia like 'West';
SELECT COUNT(*) FROM jugadores ju WHERE ju.peso>=195;
/*CANDADO C CLAVE: 631
Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de 
sumar: el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de 
tapones por partido. Además, este resultado debe ser, donde la división sea central.*/
SELECT floor(avg(es.Puntos_por_partido)+count(es.Asistencias_por_partido)+sum(es.Tapones_por_partido)) 
FROM estadisticas es 
JOIN jugadores ju on ju.codigo=es.jugador
JOIN equipos eq on eq.Nombre=ju.Nombre_equipo
WHERE eq.Division='Central';
/*CANDADO D POSICION:4*/
SELECT round(es.Tapones_por_partido) FROM estadisticas es
JOIN jugadores ju on ju.codigo=es.jugador
WHERE ju.Nombre='Corey Maggette' and es.temporada like '00/01';
/*CANDADO D CLAVE:191
Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido 
de todos los jugadores de procedencia argentina */
SELECT floor(sum(es.Puntos_por_partido)) FROM estadisticas es
JOIN jugadores ju on ju.codigo=es.jugador
WHERE ju.Procedencia like 'argentina';