
public class day14 {
    static class Student {
        String name;
        String dept;
        int age;

        Student(Builder builder) {
            this.name = builder.name;
            this.dept = builder.dept;
            this.age = builder.age;
        }
        static class Builder {
            private String name;
            private String dept;
            private int age;

            public Builder name(String nameValue) {
                this.name = nameValue;
                return this;
            }

            public Builder dept(String deptValue) {
                this.dept = deptValue;
                return this;
            }

            public Builder age(int ageValue) {
                this.age = ageValue;
                return this;
            }

            public Student build() {
                return new Student(this);
            }
        }
    }

    static void main() {
        Student student = new Student.Builder()
                .name("Rithika")
                .dept("AI&DS")
                .age(18)
                .build();

        System.out.println(student.name);
    }
}





