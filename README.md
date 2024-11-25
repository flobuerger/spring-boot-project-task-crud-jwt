# Sample Spring Boot Authentication/Authorization

## Application creating Projects with Tasks

### Setup

- JDK: Java 21
- Spring Boot: 3.3.6
- Setup with Maven

#### Testing

Requests are added in json-File for Postman, Hoppscotch, ... etc.

1. Import Json
2. Register an user with /auth/register
    3. add the responded token as Authorization Header (Bearer)
4. CRUD Project with Task
    5. be sure to have Authentication-Header

<b>Note:</b> CORS is set to localhost
