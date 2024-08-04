CREATE DEFINER=`admin`@`%` PROCEDURE `sp_modEmpleado_nombre`(IN codigo CHAR(4), IN nombre VARCHAR(30))
BEGIN
	UPDATE empleado SET emplnombre = nombre WHERE emplcodigo = codigo;
END