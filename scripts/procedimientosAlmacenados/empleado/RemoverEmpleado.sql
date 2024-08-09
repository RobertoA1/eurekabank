DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_remEmpleado`(IN codigo CHAR(4))
BEGIN
	UPDATE empleado SET estado = 0 WHERE emplcodigo = codigo;
END