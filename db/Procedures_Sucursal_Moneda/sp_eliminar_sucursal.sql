CREATE DEFINER=`lucano`@`localhost` PROCEDURE `sp_eliminar_sucursal`(IN p_codigo CHAR(3))
BEGIN
    DELETE FROM sucursal WHERE sucuCodigo = p_codigo;
END