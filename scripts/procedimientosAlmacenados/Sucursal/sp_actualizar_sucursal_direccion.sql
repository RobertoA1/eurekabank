DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_actualizar_sucursal_direccion`(IN p_sucucodigo CHAR(3), IN p_sucudireccion VARCHAR(50))
BEGIN
    UPDATE sucursal
    SET sucudireccion = p_sucudireccion
    WHERE sucucodigo = p_sucucodigo AND estado = 1;
END