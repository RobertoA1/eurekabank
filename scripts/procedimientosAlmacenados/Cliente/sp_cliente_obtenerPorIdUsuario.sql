CREATE DEFINER=`admin`@`%` PROCEDURE `sp_obtener_clientePorIdUsuario`(IN id_usuario char(8))
BEGIN
	select * from cliente where clieidusuario = id_usuario;
END