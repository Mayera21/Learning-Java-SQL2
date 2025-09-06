class Student {
    int id;
    String name;
    int marks;
    
     // Constructor
    Student(int id, String name, int marks) {
        this.id =id;
        this.name = name;
        this.marks = marks;
    }
         // Method to calculate grade
    String  getGrade() {
        if (marks >=85) {
            return  "A";
        } else if (marks >= 70) {
            return "B";
        } else {
            return "C";
        }
    }
    // Method to display student details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks + ", Grade: " + getGrade());
    }
}
public class StudentsTest {
    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student(1, "Alice", 90);
        Student student2 = new Student(2, "Bob", 75);
        Student student3 = new Student(3, "Charlie", 60);
        
        // Displaying student details
        student1.display();
        student2.display();
        student3.display();
    }
}
