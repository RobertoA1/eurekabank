DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_insertar_sucursal`(
    IN p_codigo CHAR(3), IN p_nombre VARCHAR(50), IN p_ciudad VARCHAR(30),
    IN p_direccion VARCHAR(50), IN p_contCuenta INT(11)
)
BEGIN
    INSERT INTO sucursal VALUES (p_codigo, p_nombre, p_ciudad, p_direccion, p_contCuenta,1);
END