CREATE DEFINER=`lucano`@`localhost` PROCEDURE `sp_actualizar_sucursal_ciudad`(IN p_sucucodigo CHAR(3), IN p_sucuciudad VARCHAR(30))
BEGIN
    UPDATE sucursal
    SET sucuciudad = p_sucuciudad
    WHERE sucucodigo = p_sucucodigo;
END