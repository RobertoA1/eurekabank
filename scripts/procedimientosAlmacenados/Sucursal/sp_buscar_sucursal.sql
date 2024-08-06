CREATE DEFINER=`admin`@`%` PROCEDURE `sp_buscar_sucursal`(IN p_codigo CHAR(3))
BEGIN
    SELECT * FROM sucursal WHERE succodigo = p_codigo AND estado = 1;
END