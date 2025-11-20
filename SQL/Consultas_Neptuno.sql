-- 1. Mostrar el nombre del producto y el nombre de la categoría de todos los productos que contengan la letra Q en el nombre.
select pro.producto , cat.categoria from productos pro join categorias cat on pro.categoria_id = cat.id where pro.producto like '%Q%';
-- 2. Mostrar el número de pedido y el país del cliente de los pedidos de mayo del año 1997.
select ped.id , cli.pais from pedidos ped join clientes cli on ped.cliente_id = cli.id where ped.fecha_pedido like '1997-05-%';
-- 3. Mostrar fecha del pedido, cantidad y el nombre producto, y el código del pedido para los códigos de pedido 10285 o 10298.
select ped.fecha_pedido, det.cantidad , pro.producto , ped.id from pedidos ped join detalles det on ped.id = det.pedido_id join productos pro on det.producto_id = pro.id where ped.id=  10285 or ped.id= 10298;
-- 4. Mostrar el importe total (cantidad x precio x descuento en tanto por 1) de los pedidos 10285 y 10298 usando únicamente la tabla detalles. Verifica el resultado mostrando el detalle para cada pedido en otra consulta.
SELECT pedido_id, SUM(cantidad * precio_unidad * (1 - descuento)) total
FROM detalles
WHERE pedido_id IN (10285, 10298)
GROUP BY pedido_id;
-- 5. ¿Cuánto se factura cada mes? Mostrar el año, el mes y el total.
SELECT year(fecha_pedido) as año, month(fecha_pedido) as mes,
  SUM(cantidad * precio_unidad * (1 - descuento)) as total
FROM pedidos INNER JOIN detalles ON id = pedido_id
GROUP BY 1, 2
ORDER BY 3;
-- 6. Los pedidos que hizo la empleada Nancy.
select emp.nombre,  COUNT(ped.id) as Pedidos 
from empleados emp 
join pedidos ped on emp.id = ped.empleado_id 
where ped.empleado_id=1;
-- 7. Mostrar los pedidos de Anton (código cliente).
select cli.codigo,  COUNT(ped.id) as Pedidos from clientes cli join pedidos ped on cli.id = ped.cliente_id where ped.cliente_id=3;
-- 8. Cuántos productos hay de cada categoría y el precio medio.
select cat.categoria as Categoria, count(prod.producto) as Productos , AVG(prod.precio_unidad) as 'Precio Medio' from productos prod join categorias cat on prod.categoria_id = cat.id group by cat.categoria;
-- 9. los pedidos que tienen productos en la categoría 2 o 3.
select ped.id as 'Id de pedidos' , prod.categoria_id as Categoria from pedidos ped join detalles det on ped.id = det.pedido_id join productos prod on det.producto_id = prod.id where prod.categoria_id in(2, 3);
-- 10. Clientes que pidieron queso en julio de 1996.
select cli.empresa, ped.fecha_pedido as 'Fecha Pedido' from clientes cli join pedidos ped on cli.id = ped.cliente_id join detalles det on det.pedido_id = ped.id join productos prod on prod.id = det.producto_id where prod.producto like 'Queso%' and ped.fecha_pedido like '1996-07-%'