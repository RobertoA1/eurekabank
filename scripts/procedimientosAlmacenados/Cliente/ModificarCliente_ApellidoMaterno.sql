DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_modCliente_apMaterno`(IN codigo CHAR(5), IN apellido VARCHAR(25))
BEGIN
	UPDATE cliente SET cliematerno = apellido WHERE cliecodigo = codigo;
END