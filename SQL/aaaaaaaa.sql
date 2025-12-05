-- Acticividad 1

-- Lista los productos cuya cantidad total vendida supere las 5.000 unidades, indicando también la línea de producto a la que pertenecen.
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
