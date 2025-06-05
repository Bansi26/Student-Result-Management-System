import java.sql.*;
import java.util.Scanner;

public class StudentDAO {

    public static void addStudent(Student student) {
        String sql = "INSERT INTO students (id, name, marks1, marks2, marks3) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, student.getId());
            stmt.setString(2, student.getName());
            stmt.setInt(3, student.getMarks1());
            stmt.setInt(4, student.getMarks2());
            stmt.setInt(5, student.getMarks3());
            stmt.executeUpdate();
            System.out.println("Student added successfully!");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void viewAllStudents() {
        String sql = "SELECT * FROM students";
        try (Connection conn = DBConnection.getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("marks1"),
                        rs.getInt("marks2"),
                        rs.getInt("marks3")
                );
                System.out.printf("ID: %d, Name: %s, Avg: %.2f, Grade: %s%n",
                        s.getId(), s.getName(), s.getAverage(), s.getGrade());
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Student deleted successfully.");
            } else {
                System.out.println("Student ID not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
