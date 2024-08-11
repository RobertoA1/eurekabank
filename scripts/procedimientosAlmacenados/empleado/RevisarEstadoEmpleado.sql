DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_empleado_obtenerEstado`(IN codigo CHAR(4))
BEGIN
	SELECT estado FROM empleado WHERE emplcodigo = codigo;
END