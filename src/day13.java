import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class day13 {
    static void main() {
        Path path = Path.of("files", "student.csv");
        try {
            List<String> student= Files.readAllLines(path);

            for (String line : student) {
                String[] row = line.split(",");
                for (int i = 0; i < row.length; i++) {
                    System.out.print(row[i] + " | ");
                }
                System.out.println();
            }
            /*List<String> newData = new ArrayList<>();
            newData.add("Student1");
            newData.add("Student2");
            newData.add("Student3");
            newData.add("Student4");
            newData.add("Student5");/*

             */
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}


