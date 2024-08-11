CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificarClave`(IN codigoCuenta CHAR(8), IN claveNueva CHAR(6))
BEGIN
	update cuenta set clave = claveNueva where codigo = codigoCuenta;
END