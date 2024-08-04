CREATE DEFINER=`lucano`@`localhost` PROCEDURE `sp_actualizar_sucursal`(
    IN p_codigo CHAR(3), IN p_nombre VARCHAR(50), IN p_ciudad VARCHAR(30), 
    IN p_direccion VARCHAR(50), IN p_contCuenta INT(11)
)
BEGIN
    UPDATE sucursal 
    SET sucuNombre = p_nombre, sucuCiudad = p_ciudad, 
        sucuDireccion = p_direccion, sucuContCuenta = p_contCuenta 
    WHERE sucuCodigo = p_codigo;
END