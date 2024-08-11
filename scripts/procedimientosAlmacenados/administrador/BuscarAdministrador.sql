DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_BuscarAdministrador`(IN codigo CHAR(8))
BEGIN
	SELECT * FROM ADMINISTRADOR WHERE idadministrador = codigo;
END