CREATE DEFINER=`admin`@`%` PROCEDURE `sp_sesion_cerrar`(IN codigo CHAR(8), IN token CHAR(24))
BEGIN
    UPDATE sesiones SET estado = 0 WHERE sesiones.usercodigo = codigo AND sesiones.token = token;
    SELECT sesiones.estado FROM sesiones WHERE sesiones.usercodigo = codigo AND sesiones.token = token;
END