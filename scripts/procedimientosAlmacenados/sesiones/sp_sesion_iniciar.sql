CREATE DEFINER=`admin`@`%` PROCEDURE `sp_sesion_iniciar`(IN codigo CHAR(8), IN token CHAR(24))
BEGIN
    DELETE FROM sesiones WHERE sesiones.usercodigo = codigo;
    INSERT INTO sesiones (codigo, token, estado) VALUES (codigo, token, 1);
END