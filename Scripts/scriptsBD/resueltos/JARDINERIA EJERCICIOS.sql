/*1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.*/
SELECT codigo_oficina, ciudad FROM oficina;
/*2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.*/
SELECT ciudad,telefono FROM oficina WHERE pais='España';
/*3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un
código de jefe igual a 7.*/
SELECT nombre,apellido1,apellido2,email FROM empleado WHERE codigo_jefe=7;
/*4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.*/
SELECT em.puesto,em.nombre,em.apellido1,em.apellido2, em1.email as email_jefe FROM empleado em join empleado em1 on em.codigo_jefe=em1.codigo_empleado;
Select e.nombre,(select nombre From empleado ej where  e.codigo_jefe = ej.codigo_empleado)  as jefe from empleado e;
/*5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean
representantes de ventas.*/
SELECT nombre,apellido1,apellido2,puesto FROM empleado WHERE puesto != 'Representante Ventas';
/*6. Devuelve un listado con el nombre de los todos los clientes españoles.*/
SELECT nombre_cliente FROM cliente WHERE pais != 'Spain';
/*7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.*/
SELECT DISTINCT estado FROM pedido;
/*8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago
en 2008. Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan
repetidos. Resuelva la consulta:
o Utilizando la función YEAR de MySQL.
o Utilizando la función DATE_FORMAT de MySQL.
o Sin utilizar ninguna de las funciones anteriores.*/
SELECT DISTINCT codigo_cliente FROM pago WHERE YEAR(fecha_pago)=2008;
SELECT DISTINCT codigo_cliente FROM pago WHERE DATE_FORMAT(fecha_pago,'%Y')=2008;
SELECT DISTINCT codigo_cliente FROM pago WHERE fecha_pago>'2008-01-01' AND fecha_pago<'2009-01-01';
/*9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de
entrega de los pedidos que no han sido entregados a tiempo.*/
SELECT codigo_pedido,codigo_cliente,fecha_esperada,fecha_entrega FROM pedido WHERE fecha_esperada<fecha_entrega;
/*10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de
entrega de los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha
esperada.
o Utilizando la función ADDDATE de MySQL.
o Utilizando la función DATEDIFF de MySQL.*/
SELECT codigo_pedido,codigo_cliente,fecha_esperada,fecha_entrega FROM pedido WHERE fecha_entrega<ADDDATE(fecha_esperada,INTERVAL -2 DAY);
SELECT codigo_pedido,codigo_cliente,fecha_esperada,fecha_entrega FROM pedido WHERE DATEDIFF(fecha_entrega,fecha_esperada)<=-2;
/*11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.*/
SELECT * FROM pedido WHERE estado='rechazado';
/*12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de
cualquier año.*/
SELECT * FROM pedido WHERE date_format(fecha_entrega,'%m')='01' AND estado='entregado';
/*13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal.
Ordene el resultado de mayor a menor.*/
SELECT * FROM pago WHERE forma_pago='Paypal' AND date_format(fecha_pago,'%Y')=2008 ORDER BY fecha_pago desc;
/*14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en
cuenta que no deben aparecer formas de pago repetidas.*/
SELECT DISTINCT forma_pago FROM pago;
/*15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que
tienen más de 100 unidades en stock. El listado deberá estar ordenado por su precio de
venta, mostrando en primer lugar los de mayor precio.*/
SELECT * FROM producto WHERE gama='ornamentales' AND cantidad_en_stock>100 ORDER BY  precio_venta desc;
/*16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo
representante de ventas tenga el código de empleado 11 o 30.*/
SELECT * FROM cliente WHERE ciudad='madrid' and (codigo_empleado_rep_ventas=11 OR codigo_empleado_rep_ventas=30);
/*Consultas multitabla (Composición interna)
Las consultas se deben resolver con INNER JOIN.
1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante
de ventas.*/
SELECT  cl.nombre_cliente, CONCAT(em.nombre, ' ', em.apellido1,' ',em.apellido2) AS 'vendedor' FROM cliente cl INNER JOIN empleado em on em.codigo_empleado=cl.codigo_empleado_rep_ventas; 
/*2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus
representantes de ventas.*/
SELECT DISTINCT cl.nombre_cliente, CONCAT(em.nombre, ' ', em.apellido1,' ',em.apellido2) AS 'vendedor' FROM pago pa 
INNER JOIN cliente cl on cl.codigo_cliente=pa.codigo_cliente 
INNER JOIN empleado em on em.codigo_empleado=cl.codigo_empleado_rep_ventas;
/*3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de
sus representantes de ventas.*/
SELECT DISTINCT cl.nombre_cliente, CONCAT(em.nombre, ' ', em.apellido1,' ',em.apellido2) AS 'vendedor' 
FROM pago pa RIGHT JOIN cliente cl ON cl.codigo_cliente=pa.codigo_cliente
INNER JOIN empleado em on em.codigo_empleado=cl.codigo_empleado_rep_ventas
WHERE pa.codigo_cliente IS NULL;
/*4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes
junto con la ciudad de la oficina a la que pertenece el representante.*/
SELECT DISTINCT cl.nombre_cliente, CONCAT(em.nombre, ' ', em.apellido1,' ',em.apellido2) AS 'vendedor', ofi.ciudad as 'ciudad oficina' FROM pago pa 
INNER JOIN cliente cl on cl.codigo_cliente=pa.codigo_cliente 
INNER JOIN empleado em on em.codigo_empleado=cl.codigo_empleado_rep_ventas
INNER JOIN oficina ofi on ofi.codigo_oficina=em.codigo_oficina;
/*5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus
representantes junto con la ciudad de la oficina a la que pertenece el representante.*/
SELECT DISTINCT cl.nombre_cliente, CONCAT(em.nombre, ' ', em.apellido1,' ',em.apellido2) AS 'vendedor' 
FROM pago pa RIGHT JOIN cliente cl ON cl.codigo_cliente=pa.codigo_cliente
INNER JOIN empleado em on em.codigo_empleado=cl.codigo_empleado_rep_ventas
INNER JOIN oficina ofi on ofi.codigo_oficina=em.codigo_oficina
WHERE pa.codigo_cliente IS NULL;
/*6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.*/
SELECT ofi.codigo_oficina

