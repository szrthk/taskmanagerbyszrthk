# Task Manager CRUD Application — taskmanagerbyszrthk

A fully functional **Spring Boot CRUD Application** for managing tasks, built from scratch by **szrthk**. This project demonstrates real-world backend architecture using **Spring Boot**, **MongoDB**, and clean layered structure with **Controller-Service-Repository pattern**.

---

## 🚀 Features
- Add New Task (POST)
- View All Tasks (GET)
- View Task by ID (GET)
- Update Task (PUT)
- Delete Task (DELETE)
- Clean RESTful API design
- Layered MVC Architecture (Controller → Service → Repository)

---

## 🛠️ Tech Stack
- Java 1.8
- Spring Boot 2.7.18
- MongoDB
- Maven
- Lombok
- Git & GitHub (Version Control)

---

## 📂 Project Structure
taskmanagerbyszrthk/
├── src/
│   └── main/
│       ├── java/
│       │   └── com.szrthk.taskmanager/
│       │       ├── controller/
│       │       │   └── TaskController.java
│       │       ├── entity/
│       │       │   └── Task.java
│       │       ├── service/
│       │       │   └── TaskService.java
│       │       ├── repo/
│       │       │   └── TaskRepo.java
│       │       └── TaskmanagerbyszrthkApplication.java
│       └── resources/
│           ├── application.properties
├── pom.xml
├── README.md
└── .gitignore
---

## 🧑‍💻 How to Run Locally
1. Clone the repository:
    ```bash
    git clone https://github.com/szrthk/taskmanagerbyszrthk.git
    ```
2. Navigate into the project directory:
    ```bash
    cd taskmanagerbyszrthk
    ```
3. Run Maven Install:
    ```bash
    mvn clean install
    ```
4. Start the Spring Boot Application:
    ```bash
    mvn spring-boot:run
    ```
5. Access API Endpoints at:
    ```
    http://localhost:8080/tasks
    ```

---

## 📋 API Endpoints
| Method | Endpoint          | Description                      |
|--------|-------------------|----------------------------------|
| POST   | /tasks             | Create a new task                |
| GET    | /tasks             | Retrieve all tasks               |
| GET    | /tasks/{id}        | Retrieve task by ID              |
| PUT    | /tasks/{id}        | Update existing task             |
| DELETE | /tasks/{id}        | Delete a task                    |

---

## 🔍 Key Concepts Implemented
- Controller-Service-Repository Architecture
- Dependency Injection (@Autowired)
- Spring Boot RESTful API design
- MongoDB Document Mapping (@Document)
- Lombok Annotations (@Data)
- Version Control with Git & GitHub

---

## 📌 Future Enhancements
- Add User Authentication (JWT)
- Swagger API Documentation
- Deploy on Render/Heroku for public access

---

## 👤 Author
- Sarthak (szrthk) — [GitHub Profile](https://github.com/szrthk)