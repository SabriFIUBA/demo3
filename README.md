###2 demo3
# syncops

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

######"fechaEnvio": "3000" guarda "1969-12-31 21:00:03.0000000"
######"reciboFecha": "3000-01-01T03:00:00.000+00:00" guarda "3000-01-01 00:00:00.0000000"


#### Guarda las órdenes de pago enviadas

    POST http://localhost:9095/api/ordenPago/altaOrdenesPago
    Accept: application/json
    Content-Type: application/json

    [
        {
        "ordenPagoId": 5,
        "clienteId": 5,
        "importeApagar": 500.00,
        "descuento": 0.00,
        "nota": "Nota5",
        "ordenPagoIdExterno": 5,
        "estado": "Estado5",
        "fechaEnvio": "5000",
        "usuarioEnvio": "UsuarioEnvio5",
        "ordenPagoGuid": "2A66057D-F5E5-5E2B-B2F1-58C51A96D585",
        "estadoDescripcion": "EstadoDescripcion5",
        "reciboID": 5,
        "reciboNumero": "ReciboNumero5",
        "reciboFecha": "5000-01-01T03:00:00.000+00:00",
        "rendicionID": 5,
        "cliente": "Cliente5",
        "razonSoc": "RazonSoc5",
        "reciboID_SYNC": 5,
        "vendedor": "Vendedor5"
        },
    
        {
          "ordenPagoId": 6,
          "clienteId": 6,
          "importeApagar": 600.00,
          "descuento": 0.00,
          "nota": "Nota6",
          "ordenPagoIdExterno": 6,
          "estado": "Estado6",
          "fechaEnvio": "6000",
          "usuarioEnvio": "UsuarioEnvio6",
          "ordenPagoGuid": "2A66057D-F1E4-3E2B-B2F1-58C71A96D585",
          "estadoDescripcion": "EstadoDescripcion6",
          "reciboID": 6,
          "reciboNumero": "ReciboNumero6",
          "reciboFecha": "6000-01-01T03:00:00.000+00:00",
          "rendicionID": 6,
          "cliente": "Cliente6",
          "razonSoc": "RazonSoc6",
          "reciboID_SYNC": 6,
          "vendedor": "Vendedor6"
        }
    ]
    

### Detalles ambiente
Desarrollado en Ubuntu 20.04.3 LTS
DBMS: Microsoft SQL Server (ver. 15.00.4178)
Case sensitivity: plain=mixed, delimited=mixed
Driver: Microsoft JDBC Driver 9.4 for SQL Server (ver. 9.4.0.0, JDBC4.2)
Ping: 42 ms
SSL: no
