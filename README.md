Foro Hub
API REST para manejar **tópicos de un foro**.  
Permite crear, leer, actualizar y eliminar tópicos (CRUD) usando **Spring Boot**, **MySQL** y **Spring Security**.

Tecnologias 
Java 17, Spring Boot 3.5  
- Spring Web, Spring Data JPA, Spring Security  
- Lombok, Flyway, MySQL

Instalación
1. Clonar el repositorio:
git clone https://github.com/SilviaSaucedo/Foro-hub.git
cd foro-api 
2. Configurar la base de datos MySQL:
CREATE DATABASE forohubdb;
3. Configurar application.properties
4. Ejecutar la aplicación:
   La aplicación correrá en http://localhost:8080
   Endpoints
  Método	 Ruta	              Descripción
  POST	  /api/topics	        Crear un nuevo tópico. JSON body: { "title": "...", "description": "..." }
  GET	    /api/topics	        Obtener todos los tópicos
  GET	    /api/topics/{id}	  Obtener un tópico específico
  PUT	    /api/topics/{id}	  Actualizar un tópico existente. JSON body: { "title": "...", "description": "..." }
  DELETE	/api/topics/{id}	  Eliminar un tópico
Autenticación

5. La API requiere Basic Auth para todos los endpoints.
