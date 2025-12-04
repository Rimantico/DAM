-- 1.Obtener el número total de pedidos realizados por cada cliente, mostrando el nombre en mayúsculas y la fecha del primer pedido.
SELECT 
    UPPER(customers.customerName) AS Nombre,
    COUNT(orderNumber) AS C,
    MIN(orders.orderDate)
FROM
    orders
        JOIN
    customers ON orders.customerNumber = customers.customerNumber
GROUP BY customers.customerName;
-- 2.Mostrar cada producto junto con la cantidad total vendida, mostrando el nombre en minúsculas y el mes más reciente en el que se vendió.
SELECT 
    LOWER(p.productName) AS producto,
    SUM(od.quantityOrdered) AS cantidadVendida,
    DATE_FORMAT(MAX(o.orderDate), '%Y-%m') AS mesMasReciente
FROM products p
JOIN orderdetails od ON p.productCode = od.productCode
JOIN orders o ON od.orderNumber = o.orderNumber
GROUP BY p.productName;


-- 3.Obtener el cliente que ha gastado más dinero en pedidos, mostrando su nombre con la primera letra en mayúscula y el año del último pedido.
SELECT 
    CONCAT(
        UPPER(LEFT(c.customerName, 1)),
        LOWER(SUBSTRING(c.customerName, 2))
    ) AS Nombre,
    SUM(od.quantityOrdered * od.priceEach) AS totalGastado,
    YEAR(MAX(o.orderDate)) AS ultimoAnioPedido
FROM customers c
JOIN orders o ON c.customerNumber = o.customerNumber
JOIN orderdetails od ON o.orderNumber = od.orderNumber
GROUP BY c.customerName
ORDER BY totalGastado DESC
LIMIT 1;


-- 4.Listar el número de empleados en cada oficina (mostrando la ciudad en mayúsculas) y solo aquellas con más de 3 empleados.
SELECT 
    offices.officeCode AS CodigoOficina,
    COUNT(employees.employeeNumber) AS NumeroEmpleados,
    UPPER(offices.city) AS Ciudad
FROM
    employees
        JOIN
    offices ON employees.officeCode = offices.officeCode
GROUP BY offices.officeCode
HAVING COUNT(employees.employeeNumber) > 3; 
-- 5.Obtener la lista de clientes que no han realizado ningún pedido, mostrando su nombre en minúsculas.
SELECT 
    LOWER(customers.customerName)
FROM
    customers
       LEFT JOIN
    orders ON customers.customerNumber = orders.customerNumber
WHERE
    orders.orderNumber IS NULL;