CREATE DEFINER=`lucano`@`localhost` PROCEDURE `sp_listar_sucursales`()
BEGIN
    SELECT * FROM sucursal;
END