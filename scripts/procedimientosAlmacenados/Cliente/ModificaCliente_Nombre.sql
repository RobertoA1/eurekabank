DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_modCliente_nombre`(IN codigo CHAR(5), IN nombre VARCHAR(30))
BEGIN
	UPDATE cliente SET clienombre = nombre WHERE cliecodigo = codigo;
END