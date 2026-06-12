/*
public class Day5 {

    static class Car {
        String color;
        String brand;
        int speed;
        int fuel;

        public Car(String brand, String color, int fuel) {
            this.brand = brand;
            this.color = color;
            this.fuel = fuel;
            this.speed = 0;
        }

        public void accelerate() {
            if (fuel > 0) {
                speed += 10;
                fuel -= 5;
                System.out.println(" accelerated. Speed: " + speed +
                        " km/h | Fuel: " + fuel + "%");
            }
        }

        public void decelerate() {
            if (speed > 0) {
                speed -= 10;
                System.out.println( " slowed down. Speed: " + speed + " km/h");
            }
        }

        public void refill() {
            fuel += 20;
            if (fuel > 100) {
                fuel = 100;
            }
            System.out.println( " refueled. Current Fuel: " + fuel + "%");
        }

        public void showFuel() {
            System.out.println("Fuel Status of " + fuel + "%");
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car("Tata", "Red", 30);

        myCar.showFuel();
        myCar.accelerate();
        myCar.accelerate();
        myCar.decelerate();
        myCar.refill();
        myCar.showFuel();
    }
}
 */
public class Day6_part {

    static class Student {
        String Name;
        int RegNo;
        String Department;
        int MathsMark;
        int PhysicsMark;
        int CSEMark;

        // Constructor n+r
        void StudentInfo(String Name, int RegNo) {
            this.Name = Name;
            this.RegNo = RegNo;
        }

        // Constructor n+r+d
        void information(String Name, int RegNo, String Department) {
            this.Name = Name;
            this.RegNo = RegNo;
            this.Department = Department;
        }

        // Getters
        int getMathsMark() {
            return MathsMark;
        }

        int getPhysicsMark() {
            return PhysicsMark;
        }

        int getCSEMark() {
            return CSEMark;
        }

        // Method Overloading
        void StudentMarks(int MathsMark) {
            this.MathsMark = MathsMark;
            System.out.println("Updating Maths Mark : " + MathsMark);
        }

        void StudentMarks(int PhysicsMark, int CSEMark) {
            this.PhysicsMark = PhysicsMark;
            this.CSEMark = CSEMark;
            System.out.println("Updating Physics Mark : " + PhysicsMark);
            System.out.println("Updating CSE Mark : " + CSEMark);
        }

        void display() {
            System.out.println("Name : " + Name);
            System.out.println("Reg No : " + RegNo);
            System.out.println("Department : " + Department);
            System.out.println("Maths Mark : " + MathsMark);
            System.out.println("Physics Mark : " + PhysicsMark);
            System.out.println("CSE Mark : " + CSEMark);
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.StudentInfo("RITHIKA", 2526105);
        s1.information("rithika", 2526105, "AI%DS");

        s1.StudentMarks(90);
        s1.StudentMarks(85, 95);

        s1.display();
    }
}
