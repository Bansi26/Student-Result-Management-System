import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Result Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Delete Student");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks1: ");
                    int m1 = sc.nextInt();
                    System.out.print("Enter Marks2: ");
                    int m2 = sc.nextInt();
                    System.out.print("Enter Marks3: ");
                    int m3 = sc.nextInt();
                    Student student = new Student(id, name, m1, m2, m3);
                    StudentDAO.addStudent(student);
                    break;
                case 2:
                    StudentDAO.viewAllStudents();
                    break;
                case 3:
                    System.out.print("Enter Student ID to Delete: ");
                    int delId = sc.nextInt();
                    StudentDAO.deleteStudent(delId);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}
