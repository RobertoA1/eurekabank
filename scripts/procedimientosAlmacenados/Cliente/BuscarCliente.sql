DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_cliente_buscar`(IN codigo CHAR(5))
BEGIN
	SELECT * FROM cliente WHERE cliecodigo = codigo;
END