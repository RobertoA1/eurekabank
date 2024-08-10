DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_usuario_existe`(IN codigoUser CHAR(8))
BEGIN
    SELECT usuario.estado FROM usuario WHERE codigo = codigoUser AND usuario.estado = 1;
END