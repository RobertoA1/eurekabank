DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_cantidad_movimientos`()
BEGIN
	SELECT COUNT(*) FROM movimiento;
END