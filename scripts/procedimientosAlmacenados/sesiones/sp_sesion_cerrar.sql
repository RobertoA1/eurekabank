DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_sesion_cerrar`(IN s_codigo CHAR(8), IN s_token CHAR(32))
BEGIN
    UPDATE sesiones SET estado = 0 WHERE usercodigo = s_codigo AND token = s_token;
    SELECT estado FROM sesiones WHERE usercodigo = s_codigo AND token = s_token;
END