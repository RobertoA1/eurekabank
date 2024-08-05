CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_agregarMovimiento`(p_codigo char(8), p_movinumero INT, 
p_fecha DATE, p_emplcodigo char(4), p_tipocodigo char(3), p_importe DECIMAL(12,2),
 p_cuenreferencia char(8))
BEGIN
	INSERT INTO movimiento (cuencodigo, movinumero, movifecha, emplcodigo, tipocodigo,
    moviimporte, cuenreferencia) values (p_codigo, p_movinumero, p_fecha, p_emplcodigo,
    p_tipocodigo, p_importe, p_cuenreferencia );
END