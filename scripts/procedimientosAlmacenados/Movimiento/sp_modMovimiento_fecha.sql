CREATE DEFINER=`admin`@`%` PROCEDURE `sp_modMovimiento_fecha`(IN numero INT, fecha DATE)
BEGIN
	UPDATE movimiento SET movifecha = fecha 
    WHERE movinumero = numero;
END