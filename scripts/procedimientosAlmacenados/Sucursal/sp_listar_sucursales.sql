DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_listar_sucursales`()
BEGIN
    SELECT * FROM sucursal where estado = 1;
END