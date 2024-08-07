CREATE DEFINER=`admin`@`%` PROCEDURE `sp_insertar_moneda`(IN codigo CHAR(3), IN descripcion VARCHAR(20))
BEGIN
    INSERT INTO moneda VALUES (codigo, descripcion, 1);
END