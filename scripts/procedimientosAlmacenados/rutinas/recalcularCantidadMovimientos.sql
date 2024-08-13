DELIMITER //
CREATE DEFINER='admin'@'%' TRIGGER recalcularCantidadMovimientos
AFTER INSERT ON movimiento FOR EACH ROW
BEGIN
	SET @cantMov = (SELECT COUNT(*) FROM movimiento WHERE movimiento.cuencodigo = NEW.cuencodigo AND (movimiento.tipocodigo = '001' OR movimiento.tipocodigo = '002' OR movimiento.tipocodigo = '004'));
    UPDATE cuenta SET cuenta.cantidadmovimientos = @cantMov WHERE cuenta.codigo = NEW.cuencodigo;
END; //
