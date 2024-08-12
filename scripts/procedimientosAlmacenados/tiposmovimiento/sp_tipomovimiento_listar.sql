DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_tipomovimiento_listar`()
BEGIN
	SELECT * FROM tipomovimiento WHERE tipomovimiento.tipoestado = 1;
END