DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_tipomovimiento_existe`(IN codigo CHAR(3))
BEGIN
	SELECT tipomovimiento.estado FROM tipomovimiento WHERE tipomovimiento.tipocodigo = codigo;
END