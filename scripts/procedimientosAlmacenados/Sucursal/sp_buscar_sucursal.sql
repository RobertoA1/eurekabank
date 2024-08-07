CREATE DEFINER=`admin`@`%` PROCEDURE `sp_buscar_sucursal`(IN p_codigo CHAR(3))
BEGIN
    SELECT * FROM sucursal WHERE sucucodigo = p_codigo AND estado = 1;
END