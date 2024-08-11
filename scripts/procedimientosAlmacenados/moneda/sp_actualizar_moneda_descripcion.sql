DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_actualizar_moneda_descripcion`(IN p_monecodigo CHAR(2), IN p_monedescripcion VARCHAR(20))
BEGIN
    UPDATE moneda
    SET monedescripcion = p_monedescripcion
    WHERE monecodigo = p_monecodigo AND estado = 1;
END