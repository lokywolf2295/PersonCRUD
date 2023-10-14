<div align="center">

# CRUD de Persona con Testing

</div>

## Este repositorio contiene un Proyecto realizado en el lenguaje de programación Java utilizando el framework de Spring. Y una Base de datos My SQL.

### Versiones utilizadas:

* Java Development Kit (JDK) 17
* Spring Boot 3.1.0

### Dependencias utilizadas para el proyecto:

* spring-boot-starter-web
* spring-boot-devtools
* mysql-connector-j
* lombok
* spring-boot-starter-test
* spring-boot-starter-data-jpa
* jakarta.validation-api

### Paso a paso para la utilización de este proyecto:

1. Clonar el proyecto en su dispositivo local
![Clonar Repositorio](https://i.postimg.cc/R028LM1f/Clonar.png)

2. Crear Base de Datos en MySQL con el nombre: "<b>db_person_crud</b>"
![Crear Base de Datos](https://i.postimg.cc/JnWQJx0Q/Crear-Base-de-Datos.png)

3. Abrir proyecto utilizando tu IDE favorito: en mi caso <b>Intellij IDEA</b>
4. Permitir que corra <b>Maven</b> para la descarga de las Dependencias y actualización del Proyecto
5. Utilizar sistema de gestión de bases de datos: en mi caso <b>XAMP</b>, para abrir los puertos de conexión
6. Correr el Proyecto
7. Verificar en la Terminal de "<b>Run</b>" que no hayan errores al ejecutarse el proyecto
8. Descargar el archivo Person.postman_collection.json que se encuentra en este repositorio
9. Abri la aplicación Postman e importar el archivo JSON descargado anteriormente
10. Probar los endpoints utilizando las pruebas creadas en el Json para gestionar el CRUD
