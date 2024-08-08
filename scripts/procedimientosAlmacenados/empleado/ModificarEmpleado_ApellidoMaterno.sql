DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_modEmpleado_apMaterno`(IN codigo CHAR(4), IN apellido VARCHAR(25))
BEGIN
	UPDATE empleado SET emplmaterno = apellido WHERE emplcodigo = codigo;
END