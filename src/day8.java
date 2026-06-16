/*
/*public class Day8 {
     class Request {
        private String name;
        private String date;
        private String reason;

        Request(String name, String date, String reason) {
            this.name = name;
            this.date = date;
            this.reason = reason;
        }

        void displayDetails() {
            System.out.println("Name   : " + name);
            System.out.println("Date   : " + date);
            System.out.println("Reason : " + reason);
        }

        void approve() {
            System.out.println("Request Approved");
        }

        void reject() {
            System.out.println("Request Rejected");
        }
    }

    static class LeaveRequest extends Request {

        LeaveRequest(String name, String date, String reason) {
            super(name, date, reason);
        }

        void applyLj         System.out.println("Leave Request");
  /      }
 /   }
/
    /static class OnDutyRequest extends Request {
   /     OnDutyRequest(String name, String date, String reason) {
  /          super(name, date, reason);
 /       }
/
        voi"d applyOnDuty() {
            System.out.println("On-Duty Request");
        }
    }

    public static void main(String[] args) {
        LeaveRequest leave = new LeaveRequest(
                "Rithika",
                "12-06-2026",
                "Fever");
        leave.applyLeave();
        leave.displayDetails();
        leave.approve();
        System.out.println();
        OnDutyRequest onDuty = new OnDutyRequest(
                "Rithika",
                "15-06-2026",
                "College Seminar");
          onDuty.applyOnDuty();
        onDuty.displayDetails();
        onDuty.reject;
    }-+*
}
 */
  /*public class Day8{
    class Payment {
        void transfer(double amount) {
            System.out.println("Processing payment" + amount);
        }
    }
    class UPIPayment extends Payment {
        void transfer(double amount) {
            System.out.println("UPI Payment: " + amount);
        }
    }
    class CardPayment extends Payment {
        void transfer(double amount) {
            System.out.println("Card Payment: " + amount);
        }
    }
    class NBPayment extends Payment {
        void transfer(double amount) {
            System.out.println("Net Banking Payment: " + amount);
        }
    }
    public void main(String[] args) {
        UPIPayment upi = new UPIPayment();
        upi.transfer(5000);
        CardPayment card = new CardPayment();
        card.transfer(2500);
        NBPayment nb = new NBPayment();
       nb.transfer(10000);
   }
}/*

   */
 /*public class Day9asses{
    interface Employee {

        String solveProblem();

        String work();
    }
    static class BankEmployee implements Employee {
        String name;
        String id;
        int salary;

        BankEmployee(String name, String id, int salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        @Override
        public String solveProblem() {
            System.out.println("Problem Solved...");
            return "Problem Solved";
        }

        @Override
        public String work() {
            System.out.println("Work Finished");
            return "Work Finished";
        }

        void display() {
            System.out.println("Name:" + "name");
            System.out.println("ID:" + "id");
            System.out.println("Salary:" + "salary");
        }
    }
    class CheckingEmployee implements Employee {
        @Override
        public String solveProblem() {
            System.out.println("Problem Solved.");
            return "Problem Solved";
        }

        public String work() {
            System.out.println("Work Finished");
            return "Work Finished";
        }
    }

    public static void main(String[] args) {
        BankEmployee bankEmployee = new BankEmployee("AKSHAYA","4567",40000);
        bankEmployee.solveProblem();
        bankEmployee.work();
    }
}/*

  */
/*public class day9 {
    record Valueaddedcourse(String name, String dept) {

    }

    static void main() {
        Valueaddedcourse valueaddedcourse = new Valueaddedcourse("Rithika", "BSC (AI&DS)");
        System.out.println(valueaddedcourse.name());
        System.out.println(valueaddedcourse.dept());
    }/*
 */
    /*/ enum LANGUAGES{
        EN("English"),
        GR("German"),
        JP("Japanese"),
        TA("Tamil");

    String description;

    LANGUAGES (String description){
        this.description = description;

}
}  
      static void main() {
         System.out.println( LANGUAGES.EN.description);
          System.out.println( LANGUAGES.GR.description);
          System.out.println( LANGUAGES.JP.description);
          System.out.println( LANGUAGES.TA.description);
}/*

     */

             /*public class day8 {

// login

// Success, Failure, loading
sealed interface LoginResult permits LoginSuccess, LoginFailure, LoginLoading {

}

        record LoginSuccess(String time) implements LoginResult {

        }

        record LoginFailure(String reason) implements LoginResult {

        }

        record LoginLoading(String expectedTime) implements LoginResult {

        }

        record Random(String reason) {

        }

        static void handleLogin(LoginResult result) {
            switch (result) {
                case LoginSuccess success -> System.out.println("Login Success at : " + success.time());

/*

             */
public class Day9{
    static class College implements AutoClose{
        college(){
            System.out.println("college Opens");
        }
        @Override
        public void close() throws Exception {
            System.out.println("College Closed");
        }
    }
    static class Department extend College{
        Department(){
            System.out.println("CT Have opened");
        }
        @Override
        public void close() throws Exception {
            System.out.println("CT Has Closed");
        }
    }
    static class Year extends Department{
        Department(){
            System.out.println("I-Year Have opened");
        }
        @Override
        public void close() throws Exception {
            System.out.println("I-Year Has Closed");
        }
    }

    }
}



































































































































































                case LoginFailure failure -> System.out.println("Login Failure because of " + failure.reason());
                case LoginLoading loading -> System.out.println("Login Loading, " + loading.expectedTime());
            }
        }

        static void main() {
            LoginResult LoginSuccess = new LoginSuccess("2026-06-15:05:07:25");
            LoginResult LoginFailure = new LoginFailure("Network issue");
            LoginResult LoginLoading = new LoginLoading("Please wait for few minutes");

            handleLogin(LoginSuccess);
            handleLogin(LoginFailure);
            handleLogin(LoginLoading);
        }
}
