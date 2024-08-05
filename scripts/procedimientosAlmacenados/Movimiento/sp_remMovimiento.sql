CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_remMovimiento`(IN numero INT)
BEGIN
	UPDATE movimiento SET estado = 0 WHERE movinumero = numero;
END