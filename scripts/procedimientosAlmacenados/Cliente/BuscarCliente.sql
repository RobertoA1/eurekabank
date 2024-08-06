CREATE DEFINER=`admin`@`%` PROCEDURE `sp_BuscarCliente_`(IN codigo CHAR(5))
BEGIN
	SELECT * FROM CLIENTE WHERE cliecodigo = codigo;
END