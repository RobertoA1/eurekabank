CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_cuenta_obtenerSaldo`(IN c_codigo CHAR(8))
BEGIN
    SELECT saldo INTO @saldo FROM cuenta WHERE codigo = c_codigo;
    SELECT @saldo AS saldo;
END