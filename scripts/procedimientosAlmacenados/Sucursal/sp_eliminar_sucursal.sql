DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_eliminar_sucursal`(IN p_codigo CHAR(3))
BEGIN
    UPDATE sucursal SET estado = 0 WHERE sucucodigo = p_codigo;
END