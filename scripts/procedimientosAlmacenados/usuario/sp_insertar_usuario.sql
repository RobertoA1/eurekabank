DELIMITER //
CREATE DEFINER =`admin`@`%` PROCEDURE `sp_insertar_usuario`(IN u_codigo CHAR(8), u_clave CHAR (56))
BEGIN
    insert into usuario values (u_codigo, u_clave);
END
