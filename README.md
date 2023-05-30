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
