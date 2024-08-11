DELIMITER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_tipomovimiento_agregar`(IN t_codigo CHAR(3), t_descripcion VARCHAR(40), t_accion VARCHAR(10))
BEGIN
	INSERT INTO tipomovimiento VALUES (t_codigo, t_descripcion, t_accion, 1);
END