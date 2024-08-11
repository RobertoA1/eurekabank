DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_sesion_coincide`(IN s_codigo CHAR(8), IN s_token CHAR(32))
BEGIN
    SELECT estado FROM sesiones WHERE usercodigo = s_codigo AND token = s_token;
END