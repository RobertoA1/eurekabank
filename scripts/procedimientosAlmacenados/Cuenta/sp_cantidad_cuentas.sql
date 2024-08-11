DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_cantidad_cuentas`()
BEGIN
	SELECT COUNT(*) FROM cuenta;
END