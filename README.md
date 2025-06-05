# Student-Result-Management-System

A Java-based full-stack web application for managing student academic records and results using Servlets, JDBC, MySQL, and a modern HTML/CSS/JS frontend. This project simulates a backend system for schools or colleges, and now includes a login system, session management, and a web-based interface.

---

## 📌 Project Highlights

- Built with **Java (Servlets), MySQL, JDBC, HTML, CSS, JavaScript**
- Implements a **Login & Logout system** with session management
- Modular OOP structure following **DAO design pattern**
- Responsive and user-friendly **web interface**
- Auto-grade calculation and record display
- Easy-to-use admin dashboard (add, view, delete student)

---

## 🗂️ Project Structure

Student-Result-Management-System/
├── src/
│ ├── LoginServlet.java
│ ├── LogoutServlet.java
│ ├── AddStudentServlet.java
│ ├── ViewStudentServlet.java
│ ├── DeleteStudentServlet.java
│ ├── Student.java
│ ├── StudentDAO.java
│ └── DBConnection.java
├── WebContent/
│ ├── login.html
│ ├── dashboard.html
│ ├── add-student.html
│ ├── view-students.html
│ ├── delete-student.html
│ └── style.css
└── database/
└── schema.sql

---

## 🎯 UML Diagram (Tabular Format)

### Classes & Responsibilities

| Class Name     | Attributes / Methods                             | Description                                                  |
|----------------|--------------------------------------------------|--------------------------------------------------------------|
| Student        | id, name, marks1-3, getAverage(), getGrade()     | Represents a student and their academic data                |
| DBConnection   | URL, USER, PASSWORD, getConnection()             | Handles database connection setup using JDBC                 |
| StudentDAO     | addStudent(), deleteStudent(), viewAllStudents() | CRUD operations on student records                           |
| LoginServlet   | doPost()                                         | Validates user login and starts session                      |
| LogoutServlet  | doGet()                                          | Destroys session and logs user out                           |
| AddStudentServlet | doPost()                                     | Adds student record from HTML form                           |
| ViewStudentServlet | doGet()                                     | Retrieves and displays all student records                   |
| DeleteStudentServlet | doPost()                                  | Deletes student record by ID                                 |

### Class Relationships

- `Main/Dashboard` → uses → `StudentDAO`  
- `StudentDAO` → uses → `Student`, `DBConnection`  
- `LoginServlet` ↔ `users` table in MySQL  
- `Session` ↔ Login state management  

---

## ✅ Key Features

- 🔐 Secure **Login & Logout** functionality
- 🧾 Add student with ID, name, and subject marks
- 📊 View student list with **auto-grade calculation**
- 🗑️ Delete student by ID
- 🧮 Grade logic:
  - A (75+), B (60+), C (40+), F (<40)
- 💡 Cleanly separated backend + frontend
- 🌐 Fully functional **UI with HTML/CSS/JS**

---

## 🧰 Technologies Used

| Tech          | Purpose                                  |
|---------------|-------------------------------------------|
| Java          | Backend logic using Servlets & OOP       |
| HTML/CSS/JS   | Frontend forms and UI                     |
| MySQL         | Relational database for storing records   |
| JDBC          | DB connection and queries                 |
| Apache Tomcat | Web server for running Java Servlets      |
| Git & GitHub  | Version control and source hosting        |
| IntelliJ/Eclipse | Java IDEs for development              |

---

## 🛠️ Setup Instructions

1. **Clone this repository** or download the ZIP
2. **Run `database/schema.sql`** in your MySQL to create tables
3. **Update `DBConnection.java`** with your MySQL credentials
4. Import the project in **Eclipse or IntelliJ** as a Dynamic Web Project
5. Deploy using **Apache Tomcat**
6. Access via browser: `http://localhost:8080/Student-Result-Management-System/login.html`
7. Use the UI to:
   - Log in
   - Add students
   - View all students
   - Delete students
   - Logout

---

## 🧑‍💻 Author

**Bansi Bhalala**  
📧 bhalalabansi4@gmail.com  
🌐 [LinkedIn](https://linkedin.com/in/bansi-bhalala)  
💻 [GitHub](https://github.com/Bansi26)

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).
