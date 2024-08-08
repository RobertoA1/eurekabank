CREATE DEFINER=`admin`@`%` PROCEDURE `sp_modificar_usuario`(IN codigo CHAR(8), IN clave CHAR(8))
BEGIN
	UPDATE usuario SET userclave = clave WHERE usercodigo = codigo;
END