CREATE DEFINER=`lucano`@`localhost` PROCEDURE `sp_actualizar_sucursal_contactocuenta`(IN p_sucucodigo CHAR(3), IN p_sucucontcuenta INT(11))
BEGIN
    UPDATE sucursal
    SET sucucontcuenta = p_sucucontcuenta
    WHERE sucucodigo = p_sucucodigo;
END