CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_movimiento_obtenerEstado`(IN numero INT)
BEGIN
	SELECT estado FROM movimiento WHERE movinumero = numero; 
END