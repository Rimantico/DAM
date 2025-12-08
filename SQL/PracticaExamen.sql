-- 1. Obtén el total de ventas por cliente y año, mostrando únicamente aquellos clientes cuya suma anual supere 80.000 €.
SELECT 
    customerName,
    SUM(priceEach * quantityOrdered) AS TotalVentas,
    YEAR(orders.OrderDate)
FROM
    customers
        JOIN
    orders ON customers.customerNumber = orders.customerNumber
        JOIN
    orderdetails ON orders.orderNumber = orderdetails.orderNumber
GROUP BY customerName , YEAR(orders.OrderDate)
HAVING TotalVentas > 80000;
-- 2. Lista los productos cuya cantidad total vendida supere las 3.000 unidades, indicando también la línea de producto a la que pertenecen.
SELECT 
    productName,
    productLine,
    SUM(orderdetails.quantityOrdered) as CantidadTotal
FROM
    products
        JOIN
    orderdetails ON products.productCode = orderdetails.productCode
    GROUP BY productName , productLine
    HAVING CantidadTotal > 3000;
-- 3. Muestra los empleados que tengan más de 4 clientes asignados, mostrando el nombre del empleado y el número de clientes.
SELECT 
    employeeNumber as NumeroEmpleado,
    concat(firstName , " " , lastName) as Nombre, 
    COUNT(customerNumber) as NumeroClientes
FROM
    employees
        JOIN
    customers ON employees.employeeNumber = customers.salesRepEmployeeNumber
    GROUP BY NumeroEmpleado, Nombre
    HAVING NumeroClientes > 4;
-- 4. Obtén los pedidos que contengan más de 6 líneas de detalle, mostrando el número de pedido y la cantidad de líneas.
SELECT 
    orders.orderNumber as NumeroPedido,
    COUNT(orderdetails.orderNumber) as NumeroLineas
FROM
    orders
        JOIN
    orderdetails ON orders.orderNumber = orderdetails.orderNumber
    GROUP BY orders.orderNumber
    HAVING NumeroLineas > 6;
-- 5. Lista los clientes que hayan realizado pedidos en más de 2 meses diferentes del mismo año, mostrando el año y el número de meses distintos.
