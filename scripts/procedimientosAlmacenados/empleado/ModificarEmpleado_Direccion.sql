CREATE DEFINER=`admin`@`%` PROCEDURE `sp_modEmpleado_direccion`(IN codigo CHAR(4), IN direccion VARCHAR(50))
BEGIN
	UPDATE empleado SET empldireccion = direccion WHERE emplcodigo = codigo;
END