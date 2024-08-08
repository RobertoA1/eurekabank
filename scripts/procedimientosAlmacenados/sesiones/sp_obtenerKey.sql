CREATE DEFINER=`admin`@`%` PROCEDURE `sp_usuario_obtenerKey`(IN codigoUser CHAR(8))
BEGIN
    SELECT usuario.clave FROM usuario WHERE usuario.codigo = codigoUser;
END