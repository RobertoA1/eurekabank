DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_cuenta_existe`(IN c_codigo CHAR(8))
BEGIN
	SELECT estado FROM cuenta WHERE codigo = c_codigo AND estado = 1;
END