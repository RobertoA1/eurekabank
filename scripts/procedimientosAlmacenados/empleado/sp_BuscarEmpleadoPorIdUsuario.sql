CREATE DEFINER=`admin`@`%` PROCEDURE `sp_BuscarEmpleadoPorIdUsuario`(IN idU CHAR(8))
BEGIN
	SELECT * FROM EMPLEADO WHERE idU = idusuario;
END