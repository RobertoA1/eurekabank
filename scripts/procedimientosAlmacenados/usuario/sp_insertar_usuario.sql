CREATE DEFINER =`admin`@`%` PROCEDURE `sp_insertar_usuario`(IN u_codigo CHAR(8), u_clave CHAR (8))
BEGIN
    insert into usuario values (u_codigo,u_clave);
END
