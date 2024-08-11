DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_modCliente_dni`(IN codigo CHAR(5), IN dni CHAR(8))
BEGIN
	UPDATE cliente SET cliedni = dni WHERE cliecodigo = codigo;
END