CREATE DEFINER=`admin`@`%` PROCEDURE `sp_Buscar_cliente`(IN codigo CHAR(5))
BEGIN
	SELECT * FROM cliente WHERE cliecodigo = codigo;
END