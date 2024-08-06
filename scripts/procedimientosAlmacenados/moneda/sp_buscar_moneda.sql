CREATE DEFINER=`admin`@`%` PROCEDURE `sp_buscar_moneda`(p_codigo char(2))
BEGIN
	select monecodigo, monedescripcion from moneda where monecodigo = p_codigo AND estado = 1;
END