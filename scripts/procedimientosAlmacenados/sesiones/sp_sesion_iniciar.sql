DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_sesion_iniciar`(IN s_codigo CHAR(8), IN s_token CHAR(32))
BEGIN
    DELETE FROM sesiones WHERE usercodigo = s_codigo;
    INSERT INTO sesiones (usercodigo, token, estado) VALUES (s_codigo, s_token, 1);
END