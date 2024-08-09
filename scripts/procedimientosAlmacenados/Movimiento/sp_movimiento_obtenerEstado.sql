DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_movimiento_obtenerEstado`(IN numero INT)
BEGIN
	SELECT estado FROM movimiento WHERE movinumero = numero AND estado = 1; 
END