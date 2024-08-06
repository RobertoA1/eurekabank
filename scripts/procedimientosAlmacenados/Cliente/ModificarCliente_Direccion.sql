CREATE DEFINER=`admin`@`%` PROCEDURE `sp_modCliente_direccion`(IN codigo CHAR(5), IN direccion VARCHAR(50))
BEGIN
	UPDATE cliente SET cliedireccion = direccion WHERE cliecodigo = codigo;
END