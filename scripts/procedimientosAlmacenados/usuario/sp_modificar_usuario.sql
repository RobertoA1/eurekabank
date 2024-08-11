DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_modificar_usuario`(IN u_codigo CHAR(8), IN u_clave CHAR(56))
BEGIN
	UPDATE usuario SET clave = u_clave WHERE codigo = u_codigo AND clave = u_clave;
END