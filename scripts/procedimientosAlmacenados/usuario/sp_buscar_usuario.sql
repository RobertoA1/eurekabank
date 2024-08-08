DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_buscar_usuario`(IN u_codigo CHAR(8))
BEGIN
	SELECT * FROM usuario WHERE codigo = u_codigo;
END