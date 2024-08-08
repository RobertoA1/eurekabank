DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_remMovimiento`(IN numero INT)
BEGIN
	UPDATE movimiento SET estado = 0 WHERE movinumero = numero AND estado = 1;
END