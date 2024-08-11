DELIMITER //
CREATE DEFINER =`admin`@`%` PROCEDURE `sp_insertar_usuario`(IN u_codigo CHAR(8), IN u_clave CHAR(56), IN u_nivelPermisos TINYINT)
BEGIN
    insert into usuario (codigo, clave, permisos) values (u_codigo, u_clave, u_nivelPermisos);
END
