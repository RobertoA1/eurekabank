CREATE DEFINER=`admin`@`%` PROCEDURE `sp_listar_movimientos`()
BEGIN
	SELECT * FROM movimiento;
END