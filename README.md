# School Website – Full Stack Project

A role-based, modern school website with a Spring Boot backend and a Thymeleaf-based frontend, supporting admissions, events, announcements, analytics, and more.

## Table of Contents
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Setup Instructions](#setup-instructions)
- [Backend Implementation](#backend-implementation)
- [Frontend Implementation](#frontend-implementation)
- [Role-Based Access](#role-based-access)
- [Form Handling & Validation](#form-handling--validation)
- [Dynamic Data Binding](#dynamic-data-binding)
- [Role-Based Navigation](#role-based-navigation)
- [User Experience Enhancements](#user-experience-enhancements)
- [API Documentation](#api-documentation)
- [Deployment](#deployment)
- [Further Improvements](#further-improvements)
- [Credits](#credits)

## Features
- Role-based login: Admin, Principal, Teacher, Student
- Admissions: Online form, status tracking, export options
- Events & Gallery: List and manage events with images
- Announcements: Notices for exams, holidays, PTMs, etc.
- Insights & Analytics: Subject/class performance, trends, downloadable reports
- Secure authentication: Spring Security with BCrypt
- Frontend: Thymeleaf templates, dynamic data, AJAX forms, role-based navigation

## Tech Stack
- **Backend**: Spring Boot 3.x, Spring Data JPA, Spring Security, Jakarta Persistence
- **Frontend**: Thymeleaf, HTML, CSS, JavaScript (Chart.js)
- **Database**: PostgreSQL
- **API Docs**: Swagger/OpenAPI
- **Build Tool**: Maven

## Project Structure
```
src/
└── main/
    ├── java/
    │   └── org/
    │       └── schoolwebsite/
    │           └── website/
    │               ├── controller/
    │               ├── model/
    │               ├── repository/
    │               ├── service/
    │               ├── security/
    │               └── dto/
    └── resources/
        ├── static/
        │   ├── css/styles.css
        │   ├── js/main.js
        │   └── images/logo.png
        ├── templates/
        │   ├── fragments/header.html
        │   ├── fragments/footer.html
        │   ├── layouts/layout.html
        │   ├── index.html
        │   ├── admissions.html
        │   ├── events.html
        │   ├── announcements.html
        │   ├── insights.html
        │   └── ...
        └── application.properties
pom.xml
README.md
```

## Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/yourusername/school-website.git
cd school-website
```

### 2. Configure Database
Create a PostgreSQL database named `school`. Then update the following in `src/main/resources/application.properties`:
```
spring.datasource.url=jdbc:postgresql://localhost:5432/school
spring.datasource.username=YOUR_DB_USER
spring.datasource.password=YOUR_DB_PASSWORD
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Install Dependencies
```bash
mvn clean install
```

### 4. Run the Application
```bash
mvn spring-boot:run
```
Visit `http://localhost:8080` in your browser.

## Backend Implementation

### Key Packages
- `model/` – Entity classes: User, Student, Admission, Marks, Event, Announcement
- `repository/` – JPA repositories
- `service/` – Business logic and workflows
- `controller/` – MVC controllers
- `security/` – Spring Security configuration

### Highlights
- `jakarta.persistence` used in entities
- Services encapsulate core logic (admissions, analytics, etc.)
- Spring Security with role-based access

## Frontend Implementation

### Static Assets
- CSS: `/static/css/styles.css`
- JS: `/static/js/main.js` (AJAX, chart rendering)
- Images: `/static/images/logo.png`

### Thymeleaf Templates
- Fragments: header/footer for reuse
- Pages: index, admissions, events, announcements, insights

## Role-Based Access
- Spring Security and Thymeleaf Extras for UI element access control.
- `sec:authorize` used in header/footer.

## Form Handling & Validation
- DTOs with `@jakarta.validation` annotations
- Use of `@Valid` and `BindingResult` in controllers
- AJAX for seamless form submission

## Dynamic Data Binding
- Use of `th:each`, `th:text`, `th:if` to render dynamic content from the model.

## Role-Based Navigation
- Header fragment dynamically shows navigation items based on user roles.

## User Experience Enhancements
- AJAX feedback, confirmation dialogs, form validation, and accessibility improvements

## API Documentation
- Swagger UI enabled via `springdoc-openapi-starter-webmvc-ui`
- Access at: `http://localhost:8080/swagger-ui.html`

## Deployment
- Configure production DB credentials securely
- Enable HTTPS via SSL config in `application.properties`
- Add Dockerfile and docker-compose (optional)
- Cloud-ready for AWS, Azure, etc.

## Further Improvements
- More analytics features (heatmaps, trends)
- Gallery/event file uploads
- Notifications & messaging system
- Unit & integration tests
- Expand user documentation

## Credits
Built with Spring Boot, Thymeleaf, and PostgreSQL. Inspired by best practices for scalable, maintainable web apps.
