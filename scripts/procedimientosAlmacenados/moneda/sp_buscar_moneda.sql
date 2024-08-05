CREATE DEFINER=`lucano`@`localhost` PROCEDURE `sp_buscar_moneda`(p_codigo char(2))
BEGIN
	select monecodigo from moneda where monecodigo = p_codigo;
END