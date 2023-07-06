SELECT * FROM personal.empleados;
/*Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la
empresa. Ordenarlo por departamento.*/
SELECT nombre,sal_emp,id_depto,round(sal_emp-(SELECT AVG(sal_emp) FROM empleados) ) as 'diferencia' FROM empleados WHERE sal_emp>=(SELECT AVG(sal_emp) FROM empleados) ORDER BY id_depto ASC;
