DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_BuscarCodigoPorUsuario`(IN usuario CHAR(8))
BEGIN
	SELECT * FROM CLIENTE WHERE clieidusuario = usuario;
END