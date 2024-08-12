-- Creación de la base de datos
CREATE DATABASE IF NOT EXISTS Eureka;
USE Eureka;

-- Creación de la tabla contador
-- ! Se considera sin uso y puede ser removido en una versión futura.
CREATE TABLE contador (
    contabla VARCHAR(30),
    continit INT(11),
    contingount INT(11),
    PRIMARY KEY (contabla)
);

-- Creación de la tabla parametro
-- ! Se considera sin uso y puede ser removido en una versión futura.
CREATE TABLE parametro (
    paracodigo CHAR(3) PRIMARY KEY,
    paradescripcion VARCHAR(50),
    paratipocacion VARCHAR(10),
    paravalor VARCHAR(70),
    parastado VARCHAR(15)
);

-- Creación de la tabla sucursal
CREATE TABLE sucursal (
    sucucodigo CHAR(3) PRIMARY KEY,
    sucunombre VARCHAR(50),
    sucuciudad VARCHAR(30),
    sucudireccion VARCHAR(50),
    sucucuentacta INT(11),
    estado TINYINT(1) DEFAULT 1
);

-- Creación de la tabla moneda
CREATE TABLE moneda (
    monecodigo CHAR(2) PRIMARY KEY,
    monedescription VARCHAR(20),
    estado TINYINT DEFAULT 1
);

-- Creacion de la tabla Usuarios
CREATE TABLE usuario (
    codigo CHAR(8),
    clave CHAR(56),
    permisos TINYINT DEFAULT 1,
    estado TINYINT DEFAULT 1,
    PRIMARY KEY (codigo)
);

CREATE TABLE sesiones (
    usercodigo CHAR(8),
    token CHAR(32) PRIMARY KEY,
    estado TINYINT,
    FOREIGN KEY (usercodigo) REFERENCES usuario(codigo)
);

-- Creación de la tabla cliente
CREATE TABLE cliente (
    cliecodigo CHAR(5) PRIMARY KEY,
    cliepaterno VARCHAR(25),
    cliematerno VARCHAR(25),
    clienombre VARCHAR(30),
    cliedni CHAR(8),
    clieciudad VARCHAR(30),
    cliedireccion VARCHAR(50),
    clietelefono VARCHAR(20),
    clieemail VARCHAR(50),
    clieidusuario CHAR(8),
    estado TINYINT DEFAULT 1,
    FOREIGN KEY (clieidusuario) REFERENCES usuario(codigo)
);

-- Creación de la tabla empleado
CREATE TABLE empleado (
    emplcodigo CHAR(4) PRIMARY KEY,
    emplpaterno VARCHAR(25),
    emplmaterno VARCHAR(25),
    emplnombre VARCHAR(30),
    emplciudad VARCHAR(30),
    empldireccion VARCHAR(50),
    idusuario CHAR(8),
    estado TINYINT DEFAULT 1,  /* Establece si el empleado está activo o está eliminado */
    FOREIGN KEY (idusuario) REFERENCES usuario(codigo)
);

-- Creación de la tabla asignado
CREATE TABLE asignado (
    asigcodigo CHAR(6) PRIMARY KEY,
    sucucodigo CHAR(3),
    emplcodigo CHAR(4),
    asigfecalta DATE,
    asigfecbaja DATE,
    FOREIGN KEY (sucucodigo) REFERENCES sucursal(sucucodigo),
    FOREIGN KEY (emplcodigo) REFERENCES empleado(emplcodigo)
);

-- Creación de la tabla cuenta
CREATE TABLE cuenta (
    codigo CHAR(8) PRIMARY KEY,
    monecodigo CHAR(2),
    sucucodigo CHAR(3),
    cliecodigo CHAR(5),
    usurcodigo CHAR(8),
    saldo DECIMAL(12,2),
    fechacreacion DATE,
    cantidadmovimientos INT(11),
    clave CHAR(56),
    estado TINYINT DEFAULT 1,

    FOREIGN KEY (monecodigo) REFERENCES moneda(monecodigo),
    FOREIGN KEY (sucucodigo) REFERENCES sucursal(sucucodigo),
    FOREIGN KEY (cliecodigo) REFERENCES cliente(cliecodigo),
    FOREIGN KEY (usurcodigo) REFERENCES usuario(codigo)
);

-- Creación de la tabla tipomovimiento
CREATE TABLE tipomovimiento (
    tipocodigo CHAR(3) PRIMARY KEY,
    tipodescripcion VARCHAR(40),
    tipoaccion VARCHAR(10),
    estado TINYINT DEFAULT 1
);

-- Creación de la tabla movimiento
CREATE TABLE movimiento (
    cuencodigo CHAR(8),
    movinumero INT(11) AUTO_INCREMENT PRIMARY KEY,
    movifecha DATE,
    emplecodigo CHAR(4),
    tipocodigo CHAR(3),
    movimporte DECIMAL(12,2),
    cuenreferencia CHAR(8), 
    estado TINYINT DEFAULT 1,
    FOREIGN KEY (cuencodigo) REFERENCES cuenta(codigo),
    FOREIGN KEY (emplecodigo) REFERENCES empleado(emplcodigo),
    FOREIGN KEY (tipocodigo) REFERENCES tipomovimiento(tipocodigo)
);

-- Creación de la tabla cargomantenimiento
-- ! Se considera sin uso y puede ser removido en una versión futura.
-- Sin embargo, se recomienda implementarlo
CREATE TABLE cargomantenimiento (
    monecodigo CHAR(2),
    cargMontoMaximo DECIMAL(12,2),
    cargImporte DECIMAL(12,2),
    PRIMARY KEY (monecodigo),
    FOREIGN KEY (monecodigo) REFERENCES moneda(monecodigo)
);

-- Creación de la tabla costomovimiento
-- ! Se considera sin uso y puede ser removido en una versión futura.
-- Sin embargo, se recomienda implementarlo
CREATE TABLE costomovimiento (
    monecodigo CHAR(2),
    costimporte DECIMAL(12,2),
    PRIMARY KEY (monecodigo),
    FOREIGN KEY (monecodigo) REFERENCES moneda(monecodigo)
);

-- Creación de la tabla interesmensual
-- ! Se considera sin uso y puede ser removido en una versión futura.
-- Sin embargo, se recomienda implementarlo
CREATE TABLE interesmensual (
    monecodigo CHAR(2),
    intimporte DECIMAL(12,2),
    PRIMARY KEY (monecodigo),
    FOREIGN KEY (monecodigo) REFERENCES moneda(monecodigo)
);

-- [!] Tipos de Movimiento disponibles

-- Operaciones comunes (0-9)
INSERT INTO tipomovimiento (tipocodigo, tipodescripcion, tipoaccion, estado) VALUES ('001', 'Deposito', 'Ingreso', 1);
INSERT INTO tipomovimiento (tipocodigo, tipodescripcion, tipoaccion, estado) VALUES ('002', 'Retiro', 'Salida', 1);
INSERT INTO tipomovimiento (tipocodigo, tipodescripcion, tipoaccion, estado) VALUES ('003', 'Transferencia', 'Ingreso', 1);
INSERT INTO tipomovimiento (tipocodigo, tipodescripcion, tipoaccion, estado) VALUES ('004', 'Transferencia', 'Salida', 1);

-- Operaciones de Pago al Cliente (10-19)
INSERT INTO tipomovimiento (tipocodigo, tipodescripcion, tipoaccion, estado) VALUES ('010', 'Pago de Intereses', 'Ingreso', 1);

-- Operaciones de descuento al cliente (20-29)
INSERT INTO tipomovimiento (tipocodigo, tipodescripcion, tipoaccion, estado) VALUES ('020', 'Cargo por Mantenimiento', 'Salida', 1);
INSERT INTO tipomovimiento (tipocodigo, tipodescripcion, tipoaccion, estado) VALUES ('021', 'Cargo por Movimiento', 'Salida', 1);
INSERT INTO tipomovimiento (tipocodigo, tipodescripcion, tipoaccion, estado) VALUES ('022', 'Cargo por impuesto ITF', 'Salida', 1);

-- Operaciones de Configuración de Cuenta (80-99)
INSERT INTO tipomovimiento (tipocodigo, tipodescripcion, tipoaccion, estado) VALUES ('080', 'Apertura de la Cuenta', 'Ingreso', 1);
INSERT INTO tipomovimiento (tipocodigo, tipodescripcion, tipoaccion, estado) VALUES ('081', 'Cancelacion de la Cuenta', 'Salida', 1);

-- [!] Tipos de monedas disponibles
INSERT INTO moneda (monecodigo, monedescription) VALUES ('01', 'Dolar');
INSERT INTO moneda (monecodigo, monedescription) VALUES ('02', 'Sol Peruano');

-- Para los valores de debajo son de prueba y pueden ser removidos en versiones futuras.
INSERT INTO sucursal (sucucodigo, sucunombre, sucuciudad, sucudireccion, sucucuentacta, estado) VALUES
('001', 'Sucursal Central', 'Lima', 'Av. Principal 1234', 10001234, 1),
('002', 'Sucursal Norte', 'Trujillo', 'Jr. Norte 5678', 10005678, 1),
('003', 'Sucursal Sur', 'Arequipa', 'Av. Sur 2345', 10002345, 1),
('004', 'Sucursal Este', 'Cusco', 'Calle Este 9876', 10009876, 1),
('005', 'Sucursal Oeste', 'Piura', 'Av. Oeste 4321', 10004321, 1),
('006', 'Sucursal Andina', 'Huancayo', 'Jr. Andina 3456', 10003456, 1),
('007', 'Sucursal Costera', 'Chiclayo', 'Av. Costera 6543', 10006543, 1),
('008', 'Sucursal Selva', 'Iquitos', 'Calle Selva 8765', 10008765, 1);


-- [!] Se consideran sin uso y pueden ser removidos en futuras versiones.

-- INSERT INTO parametro (paracodigo, paradescripcion, paratipocacion, paravalor, parastado) VALUES ('001', 'Tasa de Interés', 'Porcentaje', '0.05', 'Activo');
-- INSERT INTO contador (contabla, continit, contingount) VALUES ('cuenta', 0, 0);
-- INSERT INTO contador (contabla, continit, contingount) VALUES ('movimiento', 0, 0);

-- [!] Valores de requerimientos
INSERT INTO usuario VALUES ('INTERNET', '', '', '');
INSERT INTO empleado VALUES ('9999', '', '', 'INTERNET', '', '', 'INTERNET', 1);

-- INSERT INTO cuenta VALUES ('23020202', '01', '001', '0001', 'RobertoQ', 1000.52, null, 0, '2323', 1)

-- [!] Valores de administrador
-- Se advierte que es de uso futuro. Descomentar la línea de debajo para cuando esté implementado.
-- INSERT INTO administrador VALUES (...)




-- Insertar un nuevo usuario
INSERT INTO usuario (codigo, clave, permisos, estado) 
VALUES ('USR00001', 'hashedpassword123', 1, 1);

-- Insertar un cliente asociado al usuario
INSERT INTO cliente (cliecodigo, cliepaterno, cliematerno, clienombre, cliedni, clieciudad, cliedireccion, clietelefono, clieemail, clieidusuario, estado) 
VALUES ('CLI01', 'Perez', 'Lopez', 'Juan', '12345678', 'Lima', 'Av. Ejemplo 123', '999999999', 'juan@example.com', 'USR00001', 1);

-- Insertar una nueva cuenta
INSERT INTO cuenta (codigo, monecodigo, sucucodigo, cliecodigo, usurcodigo, saldo, fechacreacion, cantidadmovimientos, clave, estado) 
VALUES ('CUE00001', '01', '001', 'CLI01', 'USR00001', 1500.00, CURDATE(), 0, 'hashedpassword123', 1);


INSERT INTO movimiento (cuencodigo, movifecha, emplecodigo, tipocodigo, movimporte, cuenreferencia, estado) 
VALUES (
    'CUE00001', -- Código de la cuenta (debe existir en la tabla cuenta)
    CURDATE(),  -- Fecha del movimiento (puedes reemplazar CURDATE() con una fecha específica si es necesario)
    '9999', -- Código del empleado (debe existir en la tabla empleado)
    '001',      -- Código del tipo de movimiento (debe existir en la tabla tipomovimiento, '001' es para un Depósito)
    500.00,     -- Importe del movimiento
    NULL,       -- Código de referencia de la cuenta (puede ser NULL si no aplica)
    1           -- Estado del movimiento (1 para activo)
);