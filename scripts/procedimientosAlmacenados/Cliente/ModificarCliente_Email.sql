DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_modCliente_email`(IN codigo CHAR(5), IN email VARCHAR(50))
BEGIN
	UPDATE cliente SET clieemail = email WHERE cliecodigo = codigo;
END