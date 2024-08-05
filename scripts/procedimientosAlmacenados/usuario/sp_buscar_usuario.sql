CREATE DEFINER=`admin`@`%` PROCEDURE `sp_buscar_usuario`(IN u_codigo CHAR(8))
BEGIN
	SELECT * FROM USUARIO WHERE usercodigo = u_codigo;
END