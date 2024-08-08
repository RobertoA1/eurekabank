DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_BuscarEmpleado`(IN codigo CHAR(4))
BEGIN
	SELECT * FROM EMPLEADO WHERE emplcodigo = codigo;
END