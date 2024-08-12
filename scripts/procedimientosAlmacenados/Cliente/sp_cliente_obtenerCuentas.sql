DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_cliente_obtenerCuentas`(IN c_codigo CHAR(5))
BEGIN
	SELECT * FROM cuenta WHERE cliecodigo = c_codigo;
END