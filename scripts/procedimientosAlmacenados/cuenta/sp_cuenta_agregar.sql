DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_cuenta_agregar`(IN c_codigo CHAR(8), IN c_codigoMoneda CHAR(2), 
IN c_codigoSucursal CHAR(3), IN c_codigoCliente CHAR(5), IN c_codigoUsuario CHAR(8),
IN c_saldo DECIMAL(12,2), IN c_fechaCreacion DATE, IN c_cantidadMov INT(11), IN c_clave CHAR(56))

BEGIN
	INSERT INTO cuenta VALUES (c_codigo, c_codigoMoneda, c_codigoSucursal, c_codigoCliente, c_codigoUsuario, c_saldo, c_fechaCreacion, c_cantidadMov, c_clave, 1);
END