# My First Spring + React — Backend (Spring Boot)

Hi, I’m Wemerson 👋 This is my first full-stack learning project.
Backend: **Spring Boot 3 (Java 21)** with a simple REST endpoint.

- API: `GET /api/users` (http://localhost:8080)
- DB: PostgreSQL via Spring Data JPA (HikariCP)
- Dev: `spring.jpa.hibernate.ddl-auto=update`, optional `data.sql` seeding

## Run (dev)
```bash
mvn -DskipTests spring-boot:run
