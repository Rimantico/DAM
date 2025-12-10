-- 1. Obtén los clientes cuyo importe total anual de pedidos supere los 150.000 euros, mostrando el año y el total facturado por cada cliente.
select customers.customerName , SUM(orderdetails.quantityOrdered * orderdetails.priceEach)  as ImporteTotal , YEAR(orders.OrderDate) from customers join orders on orders.customerNumber = customers.customerNumber join orderdetails on orderdetails.orderNumber = orders.orderNumber group by customers.customerName ,YEAR(orders.OrderDate)  HAVING SUM(orderdetails.quantityOrdered * orderdetails.priceEach)>150000;

-- 2. Lista los productos cuya cantidad total vendida supere las 5.000 unidades, indicando también la línea de producto a la que pertenecen.
SELECT 
    products.productName, SUM(orderdetails.quantityOrdered) , products.productLine
FROM
    products
        JOIN
    orderdetails ON products.productCode = orderdetails.productCode
        JOIN
    orders ON orders.orderNumber = orderdetails.orderNumber
WHERE
    orders.shippedDate IS NOT NULL
GROUP BY products.productName , products.productLine
HAVING SUM(orderdetails.quantityOrdered) > 5000
ORDER BY SUM(orderdetails.quantityOrdered) DESC;

-- 3. Muestra las oficinas ordenadas por el número de empleados que trabajan en cada una, incluyendo únicamente aquellas que tengan más de 7 empleados.
SELECT 
    offices.officeCode, COUNT(employeeNumber) AS NumeroEmpleados
FROM
    offices
        JOIN
    employees ON offices.officeCode = employees.officeCode
GROUP BY offices.officeCode
HAVING COUNT(employeeNumber) > 7;

-- 4. Obtén los pedidos que contengan más de cinco líneas de detalle, mostrando el número total de productos distintos incluidos en cada pedido.
SELECT 
    orders.orderNumber, COUNT(orderdetails.orderNumber)
FROM
    orders
        JOIN
    orderdetails ON orders.orderNumber = orderdetails.orderNumber
GROUP BY orders.orderNumber
HAVING COUNT(orderdetails.orderNumber) > 5;

-- 5. Obtén los clientes que hayan realizado pedidos en más de tres meses diferentes del mismo año, mostrando dicho año y el número de meses en los que realizaron compras.
