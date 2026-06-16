import java.util.ArrayList;


public class day10 {
    static void main() {
        ArrayList<String>list = new ArrayList();

        list.add("Ashmi");
        list.add("Lazzi");
        list.add("Sajii");
        list.add("Rithi");
        list.add("dhesh");
        for(String d: list) {
            System.out.println(d);
        }
        list.remove("dhesh");
        System.out.println();
        for(String d: list) {
            System.out.println(d);
        }
    }
}