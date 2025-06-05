# Student-Result-Management-System
A Java console-based application to manage student academic records and results using JDBC and MySQL. This project simulates a backend system for schools or colleges, ideal for learning CRUD operations, OOPs, and database integration.

---

## 📌 Project Highlights

- Built with **Java**, **MySQL**, and **JDBC**
- Follows **OOP principles** and **DAO design pattern**
- Functional CLI menu system for admin control
- Auto-grade calculation based on average marks

---

## 🗂️ Project Structure

StudentResultManagement/
├── src/
│ ├── Main.java # CLI interface
│ ├── Student.java # Model class
│ ├── StudentDAO.java # Data Access Object
│ └── DBConnection.java # MySQL connection utility
└── database/
└── schema.sql # MySQL database and table creation

---

## 📐 UML Diagram (Text Format)

+-------------------+ +-------------------+
| Student | | DBConnection |
+-------------------+ +-------------------+
| - id: int | | - URL |
| - name: String | | - USER |
| - marks1: int | | - PASSWORD |
| - marks2: int | +-------------------+
| - marks3: int | | + getConnection() |
+-------------------+ +-------------------+
| + getAverage() |
| + getGrade() |
+-------------------+

markdown
     |
     ↓
+-----------------------+
| StudentDAO |
+-----------------------+
| + addStudent() |
| + deleteStudent() |
| + viewAllStudents() |
+-----------------------+

markdown
     |
     ↓
+----------------------+
| Main |
+----------------------+
| + main() |
| => menu-based system |
+----------------------+


---

## ✅ Key Features

- 🔹 Add student with ID, name, and 3 subject marks  
- 🔹 View all students with auto-calculated average and grade  
- 🔹 Delete student by ID  
- 🔹 Grade scale: A (75+), B (60+), C (40+), F (<40)  
- 🔹 JDBC-based SQL integration  
- 🔹 Clean modular architecture  

---

## 🧰 Technologies Used

| Tech       | Purpose                        |
|------------|--------------------------------|
| Java       | Core programming language      |
| MySQL      | Relational database            |
| JDBC       | Java Database Connectivity     |
| SQL        | Table creation and queries     |
| Git & GitHub | Version control and hosting  |
| IntelliJ / Eclipse | Java IDEs              |

---

## 🛠️ Setup Instructions

1. Clone the repo or download the ZIP
2. Import into your Java IDE (Eclipse or IntelliJ)
3. Run `database/schema.sql` in MySQL
4. Update `DBConnection.java` with your MySQL password
5. Compile and run `Main.java`
6. Use the CLI to manage student data

---

## 👩‍💻 Sample Console Menu

--- Student Result Management System ---

Add Student
View All Students
Delete Student
Exit
Enter choice:

---

## 🧑‍💻 Author

**Bansi Bhalala**  
📧 bhalalabansi4@gmail.com  
🌍 [LinkedIn](https://www.linkedin.com/in/bansi-bhalala/)  
📁 [GitHub](https://github.com/Bansi26)

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).
