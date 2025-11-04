select * from country;

-- 1. ¿Cuál es la esperanza de vida máxima?
select  MAX(LifeExpectancy) from country;
-- 2. Saca la lista de las capitales de todos los paises
select name , capital from country;
-- 3. Saca la lista de las capitales europeas
select name, capital from country where Continent = 'Europe'  ;
-- 4. Saca las lista de las capitales africanas y norteamericanas
-- 5. Halla la población media
-- 6. Saca los países con mayor y menor esperanza de vida
-- 7. Saca una lista de continentes ordenadas por la esperanza de vida media de forma descendente.
-- 8. Cuál es la mayor esperanza de vida (Dos formas de hacerlo, con una variable y de una forma nueva, usar una select como tabla)
-- 9. Sacar el país con mayor extensión de terreno
-- 10. Cuántas regiones distintas tenemos
-- 11. Saca el nombre local de todos los países
-- 12. Saca el nombre local de todos los países Europeos y asiáticos
-- 13. Saca las distintas formas de gobierno.
-- 14. ¿Qué forma de gobierno tienen, España, Francia, China? Saca los países ordenados por forma de gobierno.
-- 15. Saca todos los países islámicos.
-- 16. Saca el país que antes se independizó.
-- 17. Cuál es el país con menor extensión.
-- 18. Cuál es el país con mayor población.country