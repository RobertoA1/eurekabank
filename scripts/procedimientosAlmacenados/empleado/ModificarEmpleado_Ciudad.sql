CREATE DEFINER=`admin`@`%` PROCEDURE `sp_modEmpleado_ciudad`(IN codigo CHAR(4), IN ciudad VARCHAR(30))
BEGIN
	UPDATE empleado SET emplciudad = ciudad WHERE emplcodigo = codigo;
END