CREATE DEFINER=`admin`@`%` PROCEDURE `sp_agregarCliente`(codigo CHAR(5), appaterno VARCHAR(25), apmaterno VARCHAR(25), nombre VARCHAR(30), dni CHAR(8),ciudad VARCHAR(30), direccion VARCHAR(50), telefono VARCHAR(20), email VARCHAR(50), idusuario VARCHAR(8))
BEGIN
	INSERT INTO cliente (cliecodigo, cliepaterno, cliematerno, clienombre, cliedni, clieciudad, cliedireccion, clietelefono, clieemail, clieidusuario)
	VALUES (codigo, appaterno, apmaterno, nombre, dni, ciudad, direccion, telefono, email, idusuario);
END