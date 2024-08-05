CREATE DEFINER=`lucano`@`localhost` PROCEDURE `sp_actualizar_sucursal_nombre`(IN p_sucucodigo CHAR(3), IN p_sucunombre VARCHAR(50))
BEGIN
    UPDATE sucursal
    SET sucunombre = p_sucunombre
    WHERE sucucodigo = p_sucucodigo;
END