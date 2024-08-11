DELIMITER//
CREATE DEFINER=`admin`@`%` PROCEDURE 'sp_obtener_saldo_cuenta'(IN c_codigo CHAR(8),
OUT c_saldo DECIMAL(12,2) )
BEGIN
    select cuensaldo into c_saldo from cuenta where cuencodigo = c_codigo;
END
DELIMITER;