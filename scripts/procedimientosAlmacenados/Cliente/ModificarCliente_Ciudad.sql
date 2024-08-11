DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_modCliente_ciudad`(IN codigo CHAR(5), IN ciudad VARCHAR(30))
BEGIN
	UPDATE cliente SET clieciudad = ciudad WHERE cliecodigo = codigo;
END