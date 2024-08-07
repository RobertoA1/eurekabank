CREATE DEFINER=`admin`@`%` PROCEDURE `sp_eliminar_moneda`(IN p_codigo CHAR(2))
BEGIN
    UPDATE moneda SET estado = 0 WHERE monecodigo = codigo;
END