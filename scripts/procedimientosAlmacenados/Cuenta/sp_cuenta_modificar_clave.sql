CREATE DEFINER=`admin`@`%` PROCEDURE `sp_cuenta_modificar_clave`(IN c_codigo CHAR(8), IN clave CHAR(6))
BEGIN
	UPDATE cuenta SET clieclave = clave WHERE codigo = c_codigo;
END