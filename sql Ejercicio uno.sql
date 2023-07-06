SELECT * FROM personal.departamentos;
/*Listar nombres de los departamentos sin repetir*/
select distinct nombre_depto from departamentos;
/*Muestro columnas que quiero*/
select * from personal.empleados;
select nombre, sal_emp from empleados;
/*Listar comisiones*/
select comision_emp from empleados;
/*Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.*/
select * from empleados where cargo_emp='secretaria';
/*Ordenar alfabeticamente los nombres de los vendedores*/
select * from empleados where cargo_emp='Vendedor' order by nombre asc;
/*Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a
mayor.*/
select nombre, cargo_emp from empleados order by sal_emp asc;
/*Obtener el nombre de o de los jefes que tengan su departamento situado en la ciudad
de “Ciudad Real*/
select nombre_jefe_depto from departamentos where ciudad='Ciudad Real';
/*10. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las
respectivas tablas de empleados.*/
select nombre as Nombre, cargo_emp as Cargo from empleados;
/*Listar los salarios y comisiones de los empleados del departamento 2000, ordenado
por comisión de menor a mayor.*/
select sal_emp,comision_emp from empleados where id_depto = 2000 order by comision_emp asc;
/*Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta
de: sumar el salario y la comisión, más una bonificación de 500. Mostrar el nombre del
empleado y el total a pagar, en orden alfabético*/
select nombre, (sal_emp+comision_emp+500) as total from empleados where id_depto=3000 order by nombre asc;
/*Muestra los empleados cuyo nombre empiece con la letra J.*/
select * from empleados where nombre like 'J%';
/*Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos
empleados que tienen comisión superior a 1000*/
select sal_emp, comision_emp, (sal_emp+comision_emp) as salario_total, nombre from empleados where comision_emp>1000;
/*Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen
comisión.*/
select sal_emp, comision_emp, (sal_emp+comision_emp) as salario_total, nombre from empleados where comision_emp=0;
/*Obtener la lista de los empleados que ganan una comisión superior a su sueldo.*/
select * from empleados where comision_emp>sal_emp;
/*Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.*/
select * from empleados where comision_emp>=(sal_emp*0.30);
/*Hallar los empleados cuyo nombre no contiene la cadena “MA”*/
select * from empleados where nombre != '%Ma%';
/*Obtener los nombres de los departamentos que sean “Ventas”, “Investigación” o
‘Mantenimiento.*/
select * from departamentos where nombre_depto in ('Ventas' ,'Investigación' , 'Mantenimiento');
/*Ahora obtener el contrario, los nombres de los departamentos que no sean “Ventas” ni
“Investigación” ni ‘Mantenimiento.*/
select * from departamentos where nombre_depto not in ('Ventas' ,'Investigación' , 'Mantenimiento');
/*Mostrar el salario más alto de la empresa*/
select max(sal_emp) from empleados;
/*Mostrar el nombre del último empleado de la lista por orden alfabético.*/
select max(nombre) from empleados;
/*Hallar el salario más alto, el más bajo y la diferencia entre ellos.*/
select max(sal_emp),min(sal_emp), (max(sal_emp)-min(sal_emp)) as diferencia from empleados;
/*Hallar el salario promedio por departamento.*/
select avg(sal_emp)'promedio_salario',id_depto from empleados group by id_depto;
/*Hallar los departamentos que tienen más de tres empleados. Mostrar el número de
empleados de esos departamentos.*/
select count(id_emp), id_depto from empleados group by id_depto having COUNT(id_emp) > 3;
/*Hallar los departamentos que no tienen empleados*/
select count(id_emp), id_depto from empleados group by id_depto having COUNT(id_emp) = 0;
/*Mostrar la lista de empleados, con su respectivo departamento y el jefe de cada
departamento*/
select id_emp,nombre,e.id_depto,nombre_jefe_depto from departamentos d inner join empleados e on d.id_depto=e.id_depto;
/*Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la
empresa. Ordenarlo por departamento*/
SELECT e.nombre AS nombre_empleado, e.sal_emp, d.nombre_depto, d.nombre_jefe_depto FROM empleados e INNER JOIN departamentos d ON e.id_depto = d.id_depto GROUP BY e.id_emp HAVING e.sal_emp >= (SELECT AVG(sal_emp) FROM empleados) ORDER BY d.nombre_depto;
