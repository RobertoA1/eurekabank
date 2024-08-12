DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_cuenta_modificar_saldo`(IN c_codigo CHAR(8), IN c_saldo DECIMAL(12,2))
BEGIN
	UPDATE cuenta SET cuenta.saldo = c_saldo WHERE cuenta.codigo = c_codigo;
END