# ÍNDICE TEÓRICO

## Crear un nuevo usuario en *MySQL*








## Conexión al servidor MySQL

1. Abre **Powershell**
2. **Escribe el comando:** para conectarte al servidor MySQL:

<br>

~~~
        mysql -u tu_usuario -p
~~~

<br>

- <code>*mysql*</code> : El programa cliente de línea de comandos de MySQL.

- <code>*-u tu_usuario*</code> : Reemplaza *tu_usuario* con tu nombre de usuario de MySQL (por ejemplo, *root*)

- <code>*-p*</code> : Solicita la contraseña después de ejecutar el comando.


<br>


## Comandos Básicos en línea

<br>

 Una vez conectado, tendras un prompt <code>*mysql>*</code> donde puedes escribir tus comandos.


<br>


 ### Gestión de base de datos

- <code>*show databases;*</code> : Lista de todas las bases de datos del servidor.

- <code>*create database nombre_db*</code> : Crea una nueva base de datos con el nombre especificado. (*Esta ejecución de la tarea, no lleva punto y coma al final*).

- <code>*use nombre_db;*</code> : Selecciona una base de datos para trabajar con ella.

- <code>*drop database nombre_db*</code> : Elimina una base de datos y todos sus contenidos (*Esta ejecución de la tarea, no lleva punto y coma al final*).


<br>


### Gestión de tablas

- <code>*show tables;*</code> : Muestra todas las tablas dentro de la base de datos seleccionada.

- <code>*create table nombre_tabla (columna1 tipo_dato, columna2 tipo_dato);*</code> : Crea una nueva tabla con columnas y tipos de datos definidos. 

- <code>*describe nombre_tabla;</code> O <code>*desc nombre_tabla;</code> : Muestra la estructura de una tabla.

<code>*alter table nombre_tabla ADD columna_tipo_dato;*</code> : Agrega una nueva columna a una tabla existente.

<code>*drop table nombre_tabla;*</code> : Elimina una tabla de forma permanente.

<br>


### Gestión de datos

<br>

- <code>*insert into nombre_tabla (columna1, columna2) values (valor1, valor2);*</code> : Inserta un nuevo registro en una tabla.

- <code>*select * from nombre_tabla;*</code> : Recupera todos los registros de una tabla.

- <code>*show columna1, columna2 from nombre_tabla;*</code> : Devuelve las columnas y la información de la columna correspondiente a la tabla designada.

- <code>*select * from nombre_tabla where nombre_fila = whatever;* </code> : Muestra ciertas filas seleccionadas con el valor <<`whatever`>>

- <code>*select * from nombre_tabla where nombre = </code> <<`Bob`>> <code> *AND numero_telefono = </code> <<`34444`>><code>;</code> : Mostrar todos los registros que contengan el nombre <<`Bob'>> AND el numero de teléfono '34444'.

- <code>*select columna1, columna2 from nombre_tabla where condicion;*</code> : Modifica los registros existentes.

- <code>*delete from nombre_tabla where condicion;*</code> : Elimina registros de una tabla.


<br>


### Otros comandos útiles

- <code>*quit;*</code> Ó <code>*exit;*</code> : Sale del cliente de la línea e comandos de *MySQL*.

- <code>*source /ruta/a/tu/archivo.sql;*</code> : Ejecuta un archivo de script SQL desde el cliente.









