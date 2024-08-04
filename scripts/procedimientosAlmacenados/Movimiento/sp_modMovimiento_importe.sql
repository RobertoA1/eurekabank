CREATE DEFINER=`admin`@`%` PROCEDURE `sp_modMovimiento_importe`(IN numero INT, importe decimal(12,2))
BEGIN
	UPDATE movimiento set moviimporte = importe 
    where movinumero= numero;
END