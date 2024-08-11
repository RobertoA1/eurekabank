DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_remAdministrador`(IN codigo CHAR(8))
BEGIN
	UPDATE administrador SET estado = 0 WHERE emplcodigo = codigo;
END