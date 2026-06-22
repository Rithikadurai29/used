
     public class day14 {
          static class Student {
              String name;
              int regNo;
              int age;
              String dept;


          }

          static class Builder {
              private String name;
              private int age;
              private int regNo;
              private String dept;


              public Builder name(String nameValue) {
                  this.name = nameValue;
                  return this;
              }

              public Builder age(int ageValue) {
                  this.age = ageValue;
                  return this;
              }

              public Builder regNo(int regNoValue) {
                  this.regNo = regNoValue;
                  return this;
              }

              public Builder dept(String deptValue) {
                  this.dept = deptValue;
                  return this;
              }

              public Student build() {
                  return new Student(this);


              }
          }



        static  void main(){
            Student student = new Student.Builder()
                    .name("RITHIKA")
                    .age(18)
                    .regNo(2342343)
                    .dept("AI&DS")
                    .build();
            System.out.println(Student.name);
        }






