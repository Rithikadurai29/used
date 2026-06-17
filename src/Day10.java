import .util.ArrayList;

/*
public class day10 {
    static void main() {
        ArrayList<String> list = new ArrayList();

        list.add("Ashmi");
        list.add("Lazzi");
        list.add("Sajii");
        list.add("Rithi");
        list.add("dhesh");
        for (String d : list) {
            System.out.println(d);
        }
        list.remove("dhesh");
        System.out.println();
        for (String d : list) {
            System.out.println(d);
        }
    }
}
 /*
  
 */

      /*import java.util.LinkedList;
public class day10 {
    static void main() {
        LinkedList<String> queue = new LinkedList<String>();
        queue.add("dhanu");
        queue.add("Menaga");
        queue.add("priya");
        queue.add("Mithra");
        queue.add("Nivetha");
        while(!queue.isEmpty()) {
            process(queue);
        }
    }
    static void process(LinkedList<String> queue){
        String removed=queue.removeFirst();
        System.out.println("Removed:"+removed);

    }


}/*

       */
   import java.util.LinkedList;

public class Day10Linked {

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
        students.add(new Student("Arun", 101, 80));
        students.add(new Student("Bala", 102, 75));
        students.add(new Student("Charan", 103, 90));
        students.add(new Student("Deepa", 104, 85));
        students.add(new Student("Esha", 105, 88));

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
                            s.marks +" " +
            );
        }
    }
}





















