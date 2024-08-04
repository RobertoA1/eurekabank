CREATE DEFINER=`admin`@`%` PROCEDURE `sp_BuscarMovimiento`(IN numero INT)
BEGIN
	select*from movimiento where movinumero= numero;
END