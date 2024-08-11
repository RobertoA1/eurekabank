CREATE DEFINER=`admin`@`%` PROCEDURE `sp_modMovimiento_cuenReferencia`(IN numero INT, referencia CHAR(8))
BEGIN
	UPDATE movimiento set cuenreferencia = referencia 
    where movinumero= numero;
END