CREATE DEFINER=`admin`@`%` PROCEDURE `sp_obtenerMovimientoPorCuenta`(IN c_codigo char(8))
BEGIN
	select * from movimiento where cuencodigo = c_codigo;
END