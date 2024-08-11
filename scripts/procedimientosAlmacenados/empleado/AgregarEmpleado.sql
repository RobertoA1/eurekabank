DEFINER //
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_agregarEmpleado`(codigo CHAR(4), appaterno VARCHAR(25), apmaterno VARCHAR(25), nombre VARCHAR(30), ciudad VARCHAR(30), direccion VARCHAR(50), idusuario VARCHAR(8))
BEGIN
	INSERT INTO empleado (emplcodigo, emplpaterno, emplmaterno, emplnombre, emplciudad, empldireccion, idusuario)
	VALUES (codigo, appaterno, apmaterno, nombre, ciudad, direccion, idusuario);
END