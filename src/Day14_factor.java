 public class Day14_factor {
     interface Notification {
         void send(String to, String message);
     }


     class EmailNotification implements Notification {
         @Override
         public void send(String to, String message) {
             System.out.println("Sending Email: " + message + ", to " + to);

         }

     }

     class WhatsappNotification implements Notification {
         @Override
         public void send(String to, String message) {
             System.out.println("Sending Whatsapp: " + message + ", to " + to);
         }
     }

       static Notification getNotification(Day14_factor factor,String type){
           return switch (type) {
               case "Email" -> factor.new EmailNotification();
               case "Whatsapp" -> factor.new WhatsappNotification();
               default -> throw new IllegalArgumentException("Invalid notification type: " + type);
           };
       }
 static void main() {
     Day14_factor factor= new Day14_factor();

     String type = "Whatsapp";
     getNotification(factor, type).send("89324590","user world");
 }
}