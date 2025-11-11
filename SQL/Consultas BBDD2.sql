select * from country;

-- 1. ¿Cuál es la esperanza de vida máxima?
select  MAX(LifeExpectancy) from country;
-- 2. Saca la lista de las capitales de todos los paises
select name , capital from country;
-- 3. Saca la lista de las capitales europeas
select name, capital from country where Continent = 'Europe'  ;
-- 4. Saca las lista de las capitales africanas y norteamericanas
select name, capital, Continent from country where (Continent like  '%America%') or  Continent = 'Africa';
-- 5. Halla la población media
select AVG(Population) from country;
-- 6. Saca los países con mayor y menor esperanza de vida
select name , LifeExpectancy from country where LifeExpectancy IS NOT NULL order by LifeExpectancy ASC ;
select name , LifeExpectancy from country where LifeExpectancy IS NOT NULL  order by LifeExpectancy DESC;
-- 7. Saca una lista de continentes ordenadas por la esperanza de vida media de forma descendente.
 select  Continent, LifeExpectancy from country where LifeExpectancy Is NOT NULL group by Continent order by LifeExpectancy DESC;
-- 8. Cuál es la mayor esperanza de vida (Dos formas de hacerlo, con una variable y de una forma nueva, usar una select como tabla)
select name , LifeExpectancy from country where LifeExpectancy=(select MAX(LifeExpectancy) from country);
-- 9. Sacar el país con mayor extensión de terreno
select name , SurfaceArea from country where SurfaceArea=(select MAX(SurfaceArea) from country);
-- 10. Cuántas regiones distintas tenemos
select COUNT( Distinct Region) from country;
-- 11. Saca el nombre local de todos los países
select LocalName from country;
-- 12. Saca el nombre local de todos los países Europeos y asiáticos
select LocalName, Continent from country where Continent='Europe' OR Continent='Asia';
-- 13. Saca las distintas formas de gobierno.
select name ,GovernmentForm from country;
-- 14. ¿Qué forma de gobierno tienen, España, Francia, China? Saca los países ordenados por forma de gobierno.
select name ,GovernmentForm from country where name ='Spain' OR name='France' OR name = 'China';
-- 15. Saca todos los países islámicos.
select name ,GovernmentForm from country where GovernmentForm like ('%islamic%') OR GovernmentForm like ('%Emirate%') OR GovernmentForm like ('%Sultanate%');
-- 16. Saca el país que antes se independizó.
select name , IndepYear from country where IndepYear=(select MIN(IndepYear) from country);
-- 17. Cuál es el país con menor extensión.
select name , SurfaceArea from country where SurfaceArea=(select min(SurfaceArea) from country);
-- 18. Cuál es el país con mayor población.country
select name , Population from country where Population=(select MAX(Population) from country);
