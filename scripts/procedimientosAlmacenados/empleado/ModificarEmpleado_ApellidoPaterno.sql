CREATE DEFINER=`admin`@`%` PROCEDURE `sp_modEmpleado_apPaterno`(IN codigo CHAR(4), IN apellido VARCHAR(30))
BEGIN
	UPDATE empleado SET emplpaterno = apellido WHERE emplcodigo = codigo;
END