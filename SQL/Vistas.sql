-- Informacion sobre el cliente y la direccion
CREATE VIEW DatosYContactoClientes AS
    SELECT 
        id, codigo, contacto, direccion
    FROM
        clientes;
SELECT * from datosycontactoclientes;
-- Consulta que muestre únicamente x campos de una tabla.
CREATE VIEW Pedidosdeempleados5y6 AS
    SELECT 
        *
    FROM
        pedidos
    WHERE
        empleado_id IN (5 , 6);
select * from pedidosdeempleados5y6 where empleado_id=5;
-- Consulta que use una subconsulta.


-- Consulta que haga join de cuatro tablas.
CREATE VIEW ConsultaClientesDetallesProductos AS
    SELECT 
        empresa,
        pedidos.destinatario,
        detalles.cantidad,
        productos.producto
    FROM
        clientes
            JOIN
        pedidos ON clientes.id = pedidos.cliente_id
            JOIN
        detalles ON detalles.pedido_id = pedidos.id
            JOIN
        productos ON productos.id = detalles.producto_id;