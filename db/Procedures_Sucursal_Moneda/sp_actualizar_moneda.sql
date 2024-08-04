CREATE DEFINER=`lucano`@`localhost` PROCEDURE `sp_actualizar_moneda`(p_codigo char(2), p_descripcion varchar(20))
BEGIN
	update moneda set monedescripcion = p_descripcion where monecodigo = p_codigo;
END