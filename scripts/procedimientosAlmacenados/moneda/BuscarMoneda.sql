CREATE DEFINER=`admin`@`%` PROCEDURE `sp_BuscarMoneda`(IN codigo CHAR(2))
BEGIN
	SELECT * FROM MONEDA WHERE monecodigo = codigo;
END