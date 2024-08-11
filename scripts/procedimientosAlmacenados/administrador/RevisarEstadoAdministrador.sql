DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_administrador_obtenerEstado`(IN codigo CHAR(8))
BEGIN
	SELECT estado FROM administrador WHERE idadministrador = codigo;
END