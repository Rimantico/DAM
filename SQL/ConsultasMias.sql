-- Muestra los productos cuyo precio de compra sea mayor que el precio más alto dentro de la línea "Classic Cars".
select productName 
from products 
where buyPrice>(select Max(buyPrice) from products where productLine="Classic Cars");
-- Lista los clientes cuyo límite de crédito esté entre 50,000 y 100,000.
select customerName, creditLimit 
from customers 
where creditLimit between 50000 and 100000;
-- Obtén los productos de los  pedidos cuyo estado sea “Shipped” o “Resolved”.
select pro.productName , orders.status
 from products pro 
join orderdetails ordet on ordet.productCode=pro.productCode 
join orders on orders.orderNumber= ordet.orderNumber 
 where orders.status IN('Shipped','Resolved');
-- Encuentra los empleados cuyo puesto no sea “Sales Rep”.
select concat(firstName ," " , lastName) as 'Nombre Completo' ,jobTitle as Empleo  
from employees 
where jobTitle!='Sales Rep';
-- Muestra los clientes cuyo país no sea “USA”.
select concat(firstName ," " , lastName) as 'Nombre Completo' ,jobTitle as Empleo, offices.country as Pais 
from employees emp
join offices on emp.officeCode = offices.officeCode
where offices.country != 'USA';
-- Muestra el nombre de los productos en mayúsculas.
select UPPER(productName) 
from products;
-- Genera una lista con el nombre completo de los contactos (nombre + apellido) de los clientes.
select CONCAT(contactFirstName, " ", contactLastName) as 'Nombres de Contactos' 
from customers;
-- Muestra los productos cuyo nombre contenga la palabra “Ferrari”.
select productName
from products
 where productName like'%Ferrari%';
-- Obtén la longitud del nombre del país de cada cliente.
select customerName as 'Nombre del Cliente', length(Country) as 'Longitud del nombre' 
from customers;
-- Muestra los productos cuyo código empiece con la letra “S”.
select productName as 'Nombre del producto' 
from products where productCode like 'S%';