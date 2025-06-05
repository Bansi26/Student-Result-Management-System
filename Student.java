public class Student {
    private int id;
    private String name;
    private int marks1, marks2, marks3;

    public Student(int id, String name, int marks1, int marks2, int marks3) {
        this.id = id;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getMarks1() { return marks1; }
    public int getMarks2() { return marks2; }
    public int getMarks3() { return marks3; }
    public double getAverage() { return (marks1 + marks2 + marks3) / 3.0; }

    public String getGrade() {
        double avg = getAverage();
        if (avg >= 75) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 40) return "C";
        else return "F";
    }
}
