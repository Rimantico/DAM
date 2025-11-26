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
select titulo , Autor from libros where Autor like '%Date%';
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

-- 8. El título, el autor y el número de ejemplar de los ejemplares que no estén disponibles. 
SELECT 
    libros.Titulo,
    libros.Autor,
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

-- 12. Los nombres de los socios que hayan sacado algún ejemplar del libro ‘Sistemas de Bases de Datos’ del autor ‘C.J. Date’. 

-- 13. El nombre del socio, el teléfono y el título del libro de los préstamos que hayan excedido el número de días límite y que aún no han sido devueltos. Ordenado en primer lugar por nombre de socio y en segundo lugar por título del libro. 

-- 14. El nombre de los socios que hayan sacado al menos un ejemplar de todos los libros. Se podría expresar como: “los nombres de los socios tales que no exista un libro que no hayan sacado”. 

-- 15. El título de los libros que hayan sido sacados por todos los socios. 

-- 16. El nombre de los socios que no hayan sacado el libro con signatura ‘SIS-DAT’. 

-- 17. Cuántos socios tiene la biblioteca. 
SELECT 
    COUNT(CodSocio) AS NumSocios
FROM
    socios;
-- 18. Cuál es el nombre del socio más joven de la biblioteca. 

-- 19. El título de los dos libros más prestados junto con el acumulado de veces que se han prestado, ordenados de mayor a menor por esta cantidad. (sin distinguir entre los distintos ejemplares de un libro). 

-- 20. El número de veces que se ha solicitado el libro de signatura ‘SIS-DAT’ sin distinguir entre sus distintos ejemplares. Utilizando el atributo ContPrestamos. 

-- 21. La signatura, el título, junto con el número de veces que se ha solicitado cada ejemplar. Ordenado por signatura. 

-- 22. Igual que el anterior, pero que sólo se muestren aquellos libros que hayan sido sacados más de 50 veces.