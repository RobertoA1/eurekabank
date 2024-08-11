-- Creación de la base de datos
CREATE DATABASE IF NOT EXISTS Eureka;
USE Eureka;

-- Creación de la tabla sucursal
CREATE TABLE sucursal (
    succodigo CHAR(3) PRIMARY KEY,
    sucunombre VARCHAR(50),
    sucuciudad VARCHAR(30),
    sucudireccion VARCHAR(50),
    sucucuentacta INT(11),
    estado TINYINT(1) DEFAULT 1
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
    estado TINYINT  /* Establece si el empleado está activo o está eliminado */
);

-- Creación de la tabla asignado
CREATE TABLE asignado (
    asigcodigo CHAR(6) PRIMARY KEY,
    succodigo CHAR(3),
    emplcodigo CHAR(4),
    asigfecalta DATE,
    asigfecbaja DATE,
    FOREIGN KEY (succodigo) REFERENCES sucursal(succodigo),
    FOREIGN KEY (emplcodigo) REFERENCES empleado(emplcodigo)
);

-- Creacion de la tabla Usuarios
CREATE TABLE usuario (
    codigo CHAR(8),
    clave CHAR(56),
    permisos TINYINT DEFAULT 1,
    estado TINYINT DEFAULT 1,
    PRIMARY KEY (codigo)
);

-- Creacion de la tabla Administrador
CREATE TABLE administrador (
	idadministrador CHAR(8),
    idUsuario CHAR(8),
    PRIMARY KEY (idadministrador),
    FOREIGN KEY (idUsuario) REFERENCES empleado(idUsuario)
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

CREATE TABLE sesiones (
    usercodigo CHAR(8),
    token CHAR(32) PRIMARY KEY,
    estado TINYINT,
    FOREIGN KEY (usercodigo) REFERENCES usuario(codigo)
);

-- Creación de la tabla moneda
CREATE TABLE moneda (
    monecodigo CHAR(2) PRIMARY KEY,
    monedescription VARCHAR(20),
    estado TINYINT DEFAULT 1
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
    estado TINYINT,

    FOREIGN KEY (monecodigo) REFERENCES moneda(monecodigo),
    FOREIGN KEY (sucucodigo) REFERENCES sucursal(succodigo),
    FOREIGN KEY (cliecodigo) REFERENCES cliente(cliecodigo),
    FOREIGN KEY (usurcodigo) REFERENCES usuario(codigo)
);

-- Creación de la tabla tipomovimiento
CREATE TABLE tipomovimiento (
    tipocodigo CHAR(3) PRIMARY KEY,
    tipodescripcion VARCHAR(40),
    tipoaccion VARCHAR(10),
    tipostado VARCHAR(15)
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
    estado TINYINT,
    FOREIGN KEY (cuencodigo) REFERENCES cuenta(codigo),
    FOREIGN KEY (emplecodigo) REFERENCES empleado(emplcodigo),
    FOREIGN KEY (tipocodigo) REFERENCES tipomovimiento(tipocodigo)
);

-- Creación de la tabla parametro
CREATE TABLE parametro (
    paracodigo CHAR(3) PRIMARY KEY,
    paradescripcion VARCHAR(50),
    paratipocacion VARCHAR(10),
    paravalor VARCHAR(70),
    parastado VARCHAR(15)
);

-- Creación de la tabla contador
CREATE TABLE contador (
    contabla VARCHAR(30),
    continit INT(11),
    contingount INT(11),
    PRIMARY KEY (contabla)
);

-- Creación de la tabla cargomantenimiento
CREATE TABLE cargomantenimiento (
    monecodigo CHAR(2),
    cargMontoMaximo DECIMAL(12,2),
    cargImporte DECIMAL(12,2),
    PRIMARY KEY (monecodigo),
    FOREIGN KEY (monecodigo) REFERENCES moneda(monecodigo)
);

-- Creación de la tabla costomovimiento
CREATE TABLE costomovimiento (
    monecodigo CHAR(2),
    costimporte DECIMAL(12,2),
    PRIMARY KEY (monecodigo),
    FOREIGN KEY (monecodigo) REFERENCES moneda(monecodigo)
);

-- Creación de la tabla interesmensual
CREATE TABLE interesmensual (
    monecodigo CHAR(2),
    intimporte DECIMAL(12,2),
    PRIMARY KEY (monecodigo),
    FOREIGN KEY (monecodigo) REFERENCES moneda(monecodigo)
);

-- Población de datos iniciales (opcional)
INSERT INTO tipomovimiento (tipocodigo, tipodescripcion, tipoaccion, tipostado) VALUES ('001', 'Deposito', 'Credito', 'Activo');
INSERT INTO tipomovimiento (tipocodigo, tipodescripcion, tipoaccion, tipostado) VALUES ('002', 'Retiro', 'Debito', 'Activo');
INSERT INTO moneda (monecodigo, monedescription) VALUES ('01', 'Dólar Estadounidense');
INSERT INTO moneda (monecodigo, monedescription) VALUES ('02', 'Sol Peruano');
INSERT INTO parametro (paracodigo, paradescripcion, paratipocacion, paravalor, parastado) VALUES ('001', 'Tasa de Interés', 'Porcentaje', '0.05', 'Activo');
INSERT INTO contador (contabla, continit, contingount) VALUES ('cuenta', 0, 0);
INSERT INTO contador (contabla, continit, contingount) VALUES ('movimiento', 0, 0);

