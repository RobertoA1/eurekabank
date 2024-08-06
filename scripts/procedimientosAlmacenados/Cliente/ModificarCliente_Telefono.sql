CREATE DEFINER=`admin`@`%` PROCEDURE `sp_modCliente_telefono`(IN codigo CHAR(5), IN telefono VARCHAR(20))
BEGIN
	UPDATE cliente SET clietelefono = telefono WHERE cliecodigo = codigo;
END