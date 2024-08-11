DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_tipomovimiento_buscar`(IN codigo CHAR(3))
BEGIN
	SELECT * FROM tipomovimiento WHERE tipomovimiento.tipocodigo = codigo AND tipomovimiento.estado = 1;
END