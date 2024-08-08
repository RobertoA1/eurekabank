CREATE DEFINER=`admin`@`%` PROCEDURE `sp_cliente_obtenerEstado`(IN codigo CHAR(5))
BEGIN
	SELECT estado FROM cliente WHERE cliecodigo = codigo;
END