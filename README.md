# demo3
syncops

Api rest para guardar ordenes de pago



### JDK ###
jdks/temurin-1.8.0_302

### SQL Server ###
SQL Server Documentación
https://docs.microsoft.com/en-us/sql/sql-server/?view=sql-server-ver15

Instalación linux ubuntu
https://docs.microsoft.com/en-us/sql/linux/quickstart-install-connect-ubuntu?view=sql-server-ver15


### Crear tablas con script
Correr sqlserver-Tablas-SyncOPs.txt y llenar agregar algún registro.


### Correr maven
Ejecutar clean, install


### Servicios
#### Devuelve todas las órdenes de pago
GET http://localhost:9095/api/ordenPago

#### Devuelve orden de pago con OrdenPagoId={id}
GET http://localhost:9095/api/ordenPago/{id}

#### Guarda la orden de pago enviada.
Ejemplo:

POST http://localhost:9095/api/ordenPago/altaOrdenPago
Accept: application/json
Content-Type: application/json

{
"ordenPagoId": 3,
"clienteId": 3,
"importeApagar": 300.00,
"descuento": 0.00,
"nota": "Nota3",
"ordenPagoIdExterno": 3,
"estado": "Estado3",
"fechaEnvio": "3000",
"usuarioEnvio": "UsuarioEnvio3",
"ordenPagoGuid": "2A66057D-F4E5-4E2B-B2F1-38C51A96D385",
"estadoDescripcion": "EstadoDescripcion3",
"reciboID": 3,
"reciboNumero": "ReciboNumero3",
"reciboFecha": "3000-01-01T03:00:00.000+00:00",
"rendicionID": 3,
"cliente": "Cliente3",
"razonSoc": "RazonSoc3",
"reciboID_SYNC": 3,
"vendedor": "Vendedor3"
}

"fechaEnvio": "3000" guarda "1969-12-31 21:00:03.0000000"
"reciboFecha": "3000-01-01T03:00:00.000+00:00" guarda "3000-01-01 00:00:00.0000000"