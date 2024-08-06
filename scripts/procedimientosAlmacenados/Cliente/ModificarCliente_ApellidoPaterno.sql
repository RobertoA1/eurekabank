CREATE DEFINER=`admin`@`%` PROCEDURE `sp_modCliente_apPaterno`(IN codigo CHAR(5), IN apellido VARCHAR(25))
BEGIN
	UPDATE cliente SET cliepaterno = apellido WHERE cliecodigo = codigo;
END