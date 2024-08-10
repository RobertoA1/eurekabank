DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_usuario_modificar_permisos`(IN codigouser CHAR(8), IN nivelpermisos TINYINT)
BEGIN
    UPDATE usuario SET usuario.permisos = nivelpermisos WHERE usuario.codigo = codigouser;
END