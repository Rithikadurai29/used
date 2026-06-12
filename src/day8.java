
public class Day7 {
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

        void applyLeave() {
            System.out.println("Leave Request");
        }
    }

    static class OnDutyRequest extends Request {
        OnDutyRequest(String name, String date, String reason) {
            super(name, date, reason);
        }

        void applyOnDuty() {
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
        onDuty.reject();
    }
}
