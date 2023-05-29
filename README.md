# Spring Boot API Rest ONE

API Rest en Java, desarrollando operaciones CRUD utilizando la base de datos MySQL, usando Flyway como una herramienta de migración de API, trabajando con paginación para mostrar los resultados de búsqueda, fundamentos básicos de Autenticación y Autorización, validaciones usando Bean Validation e implementando configuraciones importantes para hacer una aplicación segura con Spring Security

> ## Creación del proyecto 

- Crear un proyecto Spring Boot usando el sitio web Spring Initializr;
- Importar el proyecto a IntelliJ y ejecutar una aplicación Spring Boot a través de la clase que contiene el método ```main```;
- Crear una clase Controller y mapear una URL en él usando las anotaciones ```@RestController``` y ```@RequestMapping```;
- Realizar una solicitud de prueba en el navegador accediendo a la URL mapeada en el Controller.

> ## Request POST

- Mapear solicitudes POST en una clase Controller;
- Enviar solicitudes POST a la API usando Insomnia;
- Enviar datos a la API en formato JSON;
- Utilizar la anotación ```@RequestBody``` para recibir datos del cuerpo de la solicitud en un parámetro en el Controller;
- Use el padrón <b>DTO (Data Transfer Object)</b>, a través de Java Records, para representar los datos recibidos en una solicitud POST.