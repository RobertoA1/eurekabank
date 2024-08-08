CREATE DEFINER=`admin`@`%` PROCEDURE `sp_sesion_coincide`(IN codigo CHAR(8), IN token CHAR(24))
BEGIN
    SELECT sesiones.estado FROM sesiones WHERE sesiones.usercodigo = codigo AND sesiones.token = token;
END