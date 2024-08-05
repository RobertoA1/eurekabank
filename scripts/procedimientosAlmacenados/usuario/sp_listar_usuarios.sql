CREATE DEFINER=`admin`@`%` PROCEDURE `sp_listar_usuarios`()
BEGIN
	SELECT * FROM usuario;
END