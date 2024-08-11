DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_tipomovimiento_remover`(IN t_codigo CHAR(3))
BEGIN
	UPDATE tipomovimiento SET tipomovimiento.tipoestado = 0 WHERE tipomovimiento.tipocodigo = t_codigo AND tipomovimiento.estado = 1;
END