# Proyecto Spring, ecommer 

![Arquitectura](path/to/your/architecture/image.png)

## Descripción

Este proyecto es una aplicación web basada en Spring Boot 3.3. La aplicación se encarga de gestionar las ordenes de compras. La base de datos utilizada es sql server y el proyecto está configurado para ser desplegado en un entorno Kubernetes.

## Estructura del Proyecto

- `src/main/java`: Contiene el código fuente de la aplicación.
- `src/main/resources`: Contiene los archivos de configuración de la aplicación.

## Requisitos

- Java 17
- Spring Boot 3.3
- SqlServer
- Docker
- Kubernetes

## Instalación

### Clonar el repositorio

```bash
git clone https://github.com/anjamago/gestionpedidos
cd ecommertic
```
siga los del repositorio `https://github.com/anjamago/ecommertic`

### ejecutar aplicacion
Para ejecutar la aplicación localmente, usa Maven.
```bash
./mvnw spring-boot:run
```


### Documentacion api postman
la documentacion fue generada bajo esquema openapi 3
si no se cargan las variables de conexion
para ambiente local
``http://localhost:3158/swagger-ui/index.html``
ambiente Aplication manager
``https://apmdevtic.azure-api.net``