DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_cuenta_buscar`(IN c_codigo CHAR(8))
BEGIN
	SELECT * FROM cuenta WHERE cuenta.codigo = c_codigo;
END