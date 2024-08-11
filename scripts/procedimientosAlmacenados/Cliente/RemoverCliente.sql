DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_remCliente`(IN codigo CHAR(5))
BEGIN
	UPDATE cliente SET estado = 0 WHERE cliecodigo = codigo;
END