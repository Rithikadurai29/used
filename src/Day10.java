import java.util.ArrayList;


/*public class day10 {
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
 */

      import java.util.LinkedList;
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
}





















