CREATE DEFINER=`admin`@`%` PROCEDURE `sp_listar_monedas`()
BEGIN
    SELECT * FROM moneda where estado = 1;
END