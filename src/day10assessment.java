import java.util.LinkedList;
public class day10assessment {

    static class Student {
            String name;
            int regNo;
            int marks;

            Student(String name, int regNo, int marks) {
                this.name = name;
                this.regNo = regNo;
                this.marks = marks;
            }
        }

        static void removeStudent(LinkedList<Student> students) {
            System.out.println("Removed : " + students.removeFirst().name);
        }

        static void updateStudent(LinkedList<Student> students) {
            for (Student s : students) {
                if (s.name.equals("Deepa")) {
                    s.marks = 95; // Update marks from 85 to 95
                }
            }
        }

        public static void main(String[] args) {

            LinkedList<Student> students = new LinkedList<>();

            // Add 5 Students
            students.add(new Student("Ashmitha", 101, 80));
            students.add(new Student("dhehna", 102, 75));
            students.add(new Student("lasika", 103, 90));
            students.add(new Student("sajitha", 104, 85));
            students.add(new Student("anitha", 105, 88));

            // Remove 1 Student
            removeStudent(students);

            // Update 1 Student
            updateStudent(students);

            // Display Students
            System.out.println("\nStudent Details");
            for (Student s : students) {
                System.out.println(
                        s.name + " " +
                                s.regNo + " " +
                                s.marks
                );
            }
        }

}
