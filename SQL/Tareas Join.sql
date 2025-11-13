-- 1
select count(Language) from countrylanguage
where CountryCode ='USA' ;
-- 2
select c.name as Pais , SurfaceArea as 'Area de Superficie', Count(ci.name) as 'Numero de Ciudades' from country c join city ci on c.Code = ci.CountryCode group by c.name , c.SurfaceArea ;
-- 3
select  AVG(c.LifeExpectancy)  from country c  join countrylanguage l on c.Code = l.CountryCode where l.Language = 'Spanish';
-- 4
select Count(c.name) from city c  join country co on c.CountryCode = co.Code where c.CountryCode='ESP';
-- 5
select SUM(city.Population) from city join country on city.Name != country.Capital group by city.CountryCode;
-- 6
select name 
from country as c  
join countrylanguage as lan on  c.Code = lan.CountryCode 
where lan.Language = 'English' and IsOfficial='T';
-- 7
select c.name from city c  join country co on c.CountryCode = co.Code where c.CountryCode='ESP' and c.Population > 10000;
-- 8
select c.name as Pais , count(ci.District) as 'Numero Distritos'  from country c join city ci on c.Code = ci.CountryCode group by c.Name; 
-- 9
select ci.name as Ciudad, c.Name as Pais from city ci join country c on  ci.CountryCode = c.Code order by ci.Name ASC;
-- 10
select ci.name , ci.Population , c.name , c.SurfaceArea , lan.Language from city  ci join country c on c.Code = ci.CountryCode join countrylanguage lan on lan.CountryCode = ci.CountryCode where IsOfficial='T'  ;
-- 11
select ci.name , ci.Population , c.name , c.SurfaceArea , lan.Language from city  ci join country c on c.Code = ci.CountryCode join countrylanguage lan on lan.CountryCode = ci.CountryCode where IsOfficial='T' order by c.name ;
-- 12
select c.name as Pais , ci.name as Capital from country c join city ci on c.Capital = ci.ID;
-- 13
select ci.name, c.name from city ci join country c on ci.ID = c.Capital where c.SurfaceArea = (select MAX(SurfaceArea) from country);
-- 14
select ci.name, c.name from city ci join country c on ci.ID = c.Capital where c.LifeExpectancy = (select MAX(LifeExpectancy) from country);
-- 15
select ci.name as Capital, c.name as Pais from city ci join country c on ci.ID = c.Capital where c.Population = (select MAX(Population) from country);
-- 16
select ci.name as Capital, c.name as Pais , lan.Language as 'Lengua Oficial' from city ci join country c on ci.ID = c.Capital join countrylanguage lan on lan.CountryCode = c.Code where lan.IsOfficial = 'T';
-- 17
select ci.name as Capital, c.name as Pais , lan.Language as 'Lengua Oficial' , c.Population as 'Población' from city ci join country c on ci.ID = c.Capital join countrylanguage lan on lan.CountryCode = c.Code where c.Population>1000000 and lan.IsOfficial= 'T';
-- 18
select ci.name as Capital, c.name as Pais , lan.Language as 'Lengua Oficial' , c.Population as 'Población' from city ci join country c on ci.ID = c.Capital join countrylanguage lan on lan.CountryCode = c.Code where c.Population>1000000 and lan.IsOfficial= 'F';
-- 19
select name , COUNT(lan.Language) as 'Total Lenguas' from country c join countrylanguage lan on c.Code = lan.CountryCode group by c.name;
-- 20
select c.name , count(lan.Language) as Idiomas from country c join countrylanguage lan on c.Code= lan.CountryCode group by c.name Having Idiomas=2 ;
-- 21
select c.HeadOfState as Presidente , ci.name as Capital from country c join city ci on c.Capital = ci.ID where ci.name = 'Madrid';