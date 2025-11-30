-- 1. La signatura de los libros cuya editorial sea ‘McGraw-Hill’ 
SELECT 
    Signatura
FROM
    ejemplares
WHERE
    Editorial = 'McGraw-Hill';
-- 2. Los títulos de los libros cuya editorial sea ‘McGraw-Hill’ 
SELECT 
    ejemplares.Signatura, libros.Titulo, ejemplares.Editorial
FROM
    ejemplares
        JOIN
    libros ON ejemplares.Signatura = libros.Signatura
WHERE
    Editorial = 'McGraw-Hill';
-- 3. El título de los libros cuyo autor tenga como apellido ‘Date’ 
SELECT 
    titulo, Autor
FROM
    libros
WHERE
    Autor LIKE '%Date%';
-- 4. Los títulos y editoriales de los libros cuyo autor sea ‘James Martin’ 
SELECT 
    libros.Titulo, ejemplares.Editorial, libros.Autor
FROM
    libros
        JOIN
    ejemplares ON ejemplares.Signatura = libros.Signatura
WHERE
    libros.Autor = 'James Martin';
-- 5. Las editoriales de todos los libros de la biblioteca, sin que aparezcan duplicados. 
SELECT DISTINCT
    (Editorial)
FROM
    ejemplares;
-- 6. Las editoriales de todos los libros junto con el número de ejemplares que hay de cada editorial. 
SELECT DISTINCT
    (Editorial), COUNT(Signatura) AS 'Número de ejemplares'
FROM
    ejemplares
GROUP BY Editorial;
-- 7. La signatura y código de los socios de los préstamos que hayan excedido el número de días límite y aún no hayan sido devueltos.  
SELECT 
    Signatura,
    CodSocio
FROM prestamos
WHERE FechaDevolucion IS NULL
  AND DATEDIFF(CURDATE(), FechaPrestamo) > DiasLimite;

-- 8. El título, el autor y el número de ejemplar de los ejemplares que no estén disponibles. 
SELECT 
    libros.Titulo,
    libros
    .Autor,
    ejemplares.Ejemplar,
    ejemplares.Disponible
FROM
    libros
        JOIN
    ejemplares ON libros.Signatura = ejemplares.Signatura
WHERE
    ejemplares.Disponible = '0';
-- 9. El título de los libros que haya sacado alguna vez el socio 22. 
SELECT 
    libros.Titulo, prestamos.CodSocio
FROM
    libros
        JOIN
    prestamos ON libros.Signatura = prestamos.Signatura
WHERE
    prestamos.CodSocio = '22';
-- 10. El título de los libros que tenga en su poder el socio 22. 
SELECT 
    libros.Titulo, prestamos.CodSocio
FROM
    libros
        JOIN
    prestamos ON libros.Signatura = prestamos.Signatura
WHERE
    prestamos.FechaEntrada IS NULL;
-- 11. El título de los libros que haya sacado alguna vez el socio ‘José López’. 
select libros.Titulo, socios.Nombre  from libros join prestamos on libros.Signatura = prestamos.Signatura join socios on prestamos.CodSocio = socios.Codsocio where prestamos.CodSocio = '2';
-- 12. Los nombres de los socios que hayan sacado algún ejemplar del libro ‘Sistemas de Bases de Datos’ del autor ‘C.J. Date’. 
select socios.Nombre from socios join prestamos on socios.CodSocio = prestamoprestamosprestamoss.CodSocio where prestamos.Signatura='D-001SISBD';
-- 13. El nombre del socio, el teléfono y el título del libro de los préstamos que hayan excedido el número de días límite y que aún no han sido devueltos. Ordenado en primer lugar por nombre de socio y en segundo lugar por título del libro. 
SELECT Socios.Nombre, Socios.Tlfn, li.Titulo 
FROM Socios
INNER JOIN Prestamos p ON p.CodSocio = socios.CodSocio
INNER JOIN Libros li ON li.Signatura = p.Signatura
INNER JOIN Ejemplares ej ON p.Signatura = ej.Signatura AND p.ejemplar = ej.ejemplar
WHERE p.fechaEntrada is null
AND DATEDIFF(CURDATE(), p.FechaSalida) > p.Diaslimite
ORDER BY Socios.Nombre, li.Titulo;
-- 14. El nombre de los socios que hayan sacado al menos un ejemplar de todos los libros. Se podría expresar como: “los nombres de los socios tales que no exista un libro que no hayan sacado”. 
select socios.nombre, count(distinct prestamos.signatura)
from socios
INNER JOIN prestamos on socios.CodSocio = prestamos.CodSocio
group by socios.codsocio, socios.nombre
having count(distinct prestamos.signatura) = (select count(*) from libros);
-- 15. El título de los libros que hayan sido sacados por todos los socios. 

-- 16. El nombre de los socios que no hayan sacado el libro con signatura ‘SIS-DAT’. 
select socios.*
from socios
WHERE codsocio
 not in (
	select codsocio
	from prestamos
	WHERE prestamos.signatura = 'SIS-DAT')
order by socios.nombre;

-- 17. Cuántos socios tiene la biblioteca. 
SELECT 
    COUNT(CodSocio) AS NumSocios
FROM
    socios;
-- 18. Cuál es el nombre del socio más joven de la biblioteca. 
select Nombre , FechaNacimiento from socios where FechaNacimiento =(select MAX(FechaNacimiento) from socios);
-- 19. El título de los dos libros más prestados junto con el acumulado de veces que se han prestado, ordenados de mayor a menor por esta cantidad. (sin distinguir entre los distintos ejemplares de un libro). 
SELECT 
    libros.Titulo,
    COUNT(prestamos.IdPrestamo) AS 'Veces Prestado'
FROM
    prestamos
        JOIN
    libros ON prestamos.Signatura = libros.Signatura
GROUP BY libros.Titulo
ORDER BY `Veces Prestado` DESC
 LIMIT 2;
-- 20. El número de veces que se ha solicitado el libro de signatura ‘SIS-DAT’ sin distinguir entre sus distintos ejemplares. Utilizando el atributo ContPrestamos. 

-- 21. La signatura, el título, junto con el número de veces que se ha solicitado cada ejemplar. Ordenado por signatura. 
SELECT 
    prestamos.Signatura,
    libros.Titulo,
    COUNT(prestamos.IdPrestamo) AS 'Veces Prestado'
FROM
    prestamos
        JOIN
    libros ON prestamos.Signatura = libros.Signatura
GROUP BY Signatura
ORDER BY Signatura;
-- 22. Igual que el anterior, pero que sólo se muestren aquellos libros que hayan sido sacados más de 50 veces.
SELECT 
    prestamos.Signatura,
    libros.Titulo,
    COUNT(prestamos.IdPrestamo) AS Veces_Prestado
FROM
    prestamos
        JOIN
    libros ON prestamos.Signatura = libros.Signatura
GROUP BY prestamos.Signatura , libros.Titulo
HAVING COUNT(prestamos.IdPrestamo) > 50
ORDER BY Signatura;