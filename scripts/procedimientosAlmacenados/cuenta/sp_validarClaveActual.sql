CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_validarClaveActual`(
    IN codigoCuenta CHAR(8), 
    IN claveActual CHAR(6)
)
BEGIN
    DECLARE cuentaExiste INT;
    
    SELECT COUNT(*) INTO cuentaExiste 
    FROM cuenta 
    WHERE codigo = codigoCuenta AND clave = claveActual;
    
    IF cuentaExiste = 1 THEN
        SELECT 1 AS valida;
    ELSE
        SELECT 0 AS valida;
    END IF;
END