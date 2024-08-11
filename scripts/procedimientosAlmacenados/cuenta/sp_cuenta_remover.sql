DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_cuenta_remover`(IN c_codigo CHAR(8))
BEGIN
	UPDATE cuenta SET estado = 1 WHERE codigo = c_codigo;
END