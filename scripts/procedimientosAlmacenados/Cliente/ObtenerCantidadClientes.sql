DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_cantidad_clientes`()
BEGIN
	SELECT COUNT(*) FROM cliente;
END