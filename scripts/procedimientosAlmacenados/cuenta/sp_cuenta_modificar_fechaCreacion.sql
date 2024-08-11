DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_cuenta_modificar_fechaCreacion`(IN c_codigo CHAR(8), IN c_fechaCreacion DATE)
BEGIN
	UPDATE cuenta SET fechacreacion = c_fechaCreacion WHERE codigo = c_codigo;
END