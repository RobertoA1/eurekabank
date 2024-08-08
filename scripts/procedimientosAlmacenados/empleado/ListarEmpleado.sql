DELIMITER // 
CREATE DEFINER=`admin`@`%` PROCEDURE `sp_listarEmpleados`()
BEGIN
    SELECT * FROM empleado WHERE estado = 1;
END