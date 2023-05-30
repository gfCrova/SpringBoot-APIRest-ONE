# Spring Boot API Rest ONE <img align="right" width="80" src="https://github.com/gfCrova/SpringBoot-APIRest-ONE/assets/103906625/e6a2d376-a881-4b8c-943e-556d289fbda8" />

<br><br>

> ## Creación del proyecto

- Crear un proyecto Spring Boot usando el sitio web <b>Spring Initializr</b>;
- Importar el proyecto a IntelliJ y ejecutar una aplicación Spring Boot a través de la clase que contiene el método ```main```;
- Crear una clase Controller y mapear una <b>URL</b> en él usando las anotaciones ```@RestController``` y ```@RequestMapping```;
- Realizar una solicitud de prueba en el navegador accediendo a la <b>URL</b>mapeada en el Controller.

<br>

> ## Request POST

- Mapear solicitudes <b>POST</b> en una clase Controller;
- Enviar solicitudes <b>POST</b> a la <b>API</b> usando Insomnia;
- Enviar datos a la <b>API</b> en formato <b>JSON</b>;
- Utilizar la anotación ```@RequestBody``` para recibir datos del cuerpo de la solicitud en un parámetro en el Controller;
- Use el padrón <b>DTO (Data Transfer Object)</b>, a través de Java Records, para representar los datos recibidos en una solicitud <b>POST</b>.

<br>

> ## Spring Data JPA

- Agregar nuevas dependencias en el proyecto;
- Asignar una entidad <b>JPA</b> y crear una interfaz de Repositorio para ella;
- Utilizar <b>Flyway</b> como herramienta de migración de proyectos;
- Realice validaciones con <b>Bean Validation</b> usando algunas de sus anotaciones, como ```@NotBlank```.

<br>

> ## Request GET

- Usar la anotación ```@GetMapping``` para mapear métodos en los Controllers que producen datos;
- Usar la interfaz ```Pageable``` de Spring para realizar consultas con paginación;
- Controlar la paginación y el ordenamiento de los datos devueltos por la <b>API</b> con los parámetros ```page```, ```size``` y ```sort```;
- Configurar el proyecto para que los comandos <b>SQL</b> se visualicen en la consola.

<br>

> ## Request PUT y DELETE

- Mapear solicitudes <b>PUT</b> con la anotación ```@PutMapping```;
- Escribir un código para actualizar la información de un registro en la base de datos;
- Mapear solicitudes <b>DELETE</b> con la anotación ```@DeleteMapping```;
- Mapear parámetros dinámicos en la <b>URL</b> con la anotación ```@PathVariable```;
- Implementar el concepto de exclusión lógica utilizando un atributo booleano.

<br><br>

## Aplicando las mejores prácticas y proteger una API REST

<br>

> ## Buenas Prácticas

- Usar la clase ```ResponseEntity```, de Spring, para personalizar los retornos de los métodos de una clase Controller;
- Modificar el código <b>HTTP</b> devuelto en las respuestas de la <b>API</b>;
- Agregar encabezados a las respuestas de la <b>API</b>;
- Utilice los códigos <b>HTTP</b> más apropiados para cada operación realizada en la <b>API</b>.

<br>

> ## Tratando Errores

- Crear una clase para aislar el manejo de excepciones de <b>API</b>, utilizando la anotación ```@RestControllerAdvice```;
- Utilizar la anotación ```@ExceptionHandler```, de Spring, para indicar qué excepción debe capturar un determinado método de la clase de manejo de errores;
- Manejar errores <b>404</b> (Not Found) en la clase de manejo de errores;
- Manejar errores <b>400</b> (Bad Request), para errores de validación de Bean Validation, en la clase de manejo de errores;
- Simplificar el <b>JSON</b> devuelto por la <b>API</b> en casos de error de validación de Bean Validation.

<br>

> ## Spring Security

- Identificar cómo funciona el proceso de autenticación y autorización en una <b>API Rest</b>;
- Agregar Spring Security al proyecto;
- Cómo funciona el comportamiento padrón de Spring Security en una aplicación;
- Implementar el proceso de autenticación en la <b>API</b>, de forma Stateless, utilizando clases y configuraciones de Spring Security.

<br>

> ## JSON Web Token

- Agregar la biblioteca ```Auth0 java-jwt``` como una dependencia del proyecto;
- Utilizar esta biblioteca para generar un token en la <b>API</b>;
- Inyectar una propiedad del archivo application.properties en una clase administrada por Spring, usando la anotación ```@Value```;
- Devolver un token generado en la <b>API</b> cuando un usuario se autentica.

<br>

> ## Control de acceso

- Los Filters funcionan en una solicitud;
- Implementar un Filter creando una clase que herede de la clase ```OncePerRequestFilter``` de Spring;
- Utilizar la biblioteca ```Auth0 java-jwt``` para validar los tokens recibidos en la <b>API</b>;
- Realizar el proceso de autenticación de la solicitud, utilizando la clase ```SecurityContextHolder``` de Spring;
- Liberar y restringir solicitudes, según la <b>URL</b> y el verbo del protocolo <b>HTTP</b>.
