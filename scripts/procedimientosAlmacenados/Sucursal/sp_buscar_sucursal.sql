CREATE DEFINER=`lucano`@`localhost` PROCEDURE `sp_buscar_sucursal`(IN p_codigo CHAR(3))
BEGIN
    SELECT * FROM sucursal WHERE sucuCodigo = p_codigo;
END