-- 1. Ver estructura de la tabla
describe city;
-- 2. Ver todas las tuplas de la tabla
select * from city;
-- 3. Ver todos los nombres y distritos de las ciudades
select Name, District from city;
-- 4. Ver todas las ciudades que tienen el código ESP
select name from city
where CountryCode='ESP';
-- 5. Ver todas las ciudades y sus códigos de pais, ordenados por código de país
select name,  CountryCode from city Order By CountryCode ASC;
-- 6. Ver cuántas ciudades tiene cada país
select CountryCode, COUNT(*) from city Group by CountryCode  ;
-- 7. Sacar la población menor
select MIN(Population) from city;
-- 8. Sacar el nombre de la ciudad con más habitantes
select name , Population from city where Population = (Select MAX(Population) from city);
-- 9. Averigua la suma de todas los habitantes
select SUM(Population) from city;
-- 10. Saca la suma de habitantes agrupadas por países
select CountryCode ,SUM(Population)  from city group by CountryCode;
-- 11. Saca los distintos códigos de país
select CountryCode from city group by CountryCode;
-- 12. Cuenta los distintos códigos de país
select COUNT( distinct CountryCode) from city ;
-- 13. Saca las ciudades del país usa, que su población sea mayor de 10000
select name from city where CountryCode='USA' AND Population>10000;
-- 14. Cuenta todos los códigos de países
select CountryCode, COUNT(CountryCode) from city group by CountryCode;
-- 15. Suma todas las poblaciones distintas
select SUM(distinct Population) from city ;
-- 16. Saca el nombre de la ciudad con menos habitantes
select name , Population from city where Population = (Select MIN(Population) from city);
-- 17. Saca la media de habitantes
select AVG(Population) from city;
-- 18. Saca la ciudad que tenga exactamente la media de habitantes
select name from city where Population = (Select AVG(Population) from city);
-- 19. Saca todas las provincias (Distritos) de España
select District from city where CountryCode='ESP' group by District;
-- 20. Saca sólo las provincias distintas de España
select distinct(District) from city where CountryCode='ESP' ;
-- 21. Saca el número de ciudades por provincia
select District, COUNT(Name) from city group by District;
-- 22. Saca todas las ciudades de Extremadura.
select name from city where District = 'Extremadura';
-- 23. Saca la cuenta de las ciudades agrupadas por provincias y por países.
select COUNT(name) from city group by CountryCode,District;
-- 24. Saca la suma de la población de todos los distritos de España
select SUM(Poblacion) from city where CountryCode='ESP';
-- 25. Cual es el distrito español con más habitantes.
select District , Population from city where CountryCode='ESP' AND Population = (Select MAX(Population) from city where CountryCode='ESP')