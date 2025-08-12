import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HELLOFILE_HelloFile {
    public static void main(String[] args) {
        try {
            File file = new File("Hello.txt");
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
