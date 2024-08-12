@echo off
set MYSQL_PATH=D:\xampp\mysql\bin\mysql.exe
set DB_USER=admin
set DB_PASS=12345
set DB_NAME=eureka
set SQL_FILE=./db/Creacion.sql

echo Ejecutando archivo de creacion: %SQL_FILE%
"%MYSQL_PATH%" -u %DB_USER% -p%DB_PASS% < "%SQL_FILE%"

set ROOT_DIR=./procedimientosAlmacenados/

for /r "%ROOT_DIR%" %%f in (*.sql) do (
    echo Ejecutando %%f
    "%MYSQL_PATH%" -u %DB_USER% -p%DB_PASS% %DB_NAME% < "%%f"
)
