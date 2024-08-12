CREATE DEFINER=`admin`@`%` PROCEDURE `sp_cuenta_remover`(IN c_codigo CHAR(8))
BEGIN
    DELETE FROM cuenta WHERE codigo = c_codigo;
END