import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Wyjatki {
    public static void main(String[] args)  {
        try {
            System.out.println("przed wyjatkiem bla");
            readFile("C:\\Automaty\\src\\test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("catch");
            throw new RuntimeException(e);
        } finally {
            System.out.println("git");
        }
    }
   public static void readFile(String path) throws FileNotFoundException {
       FileInputStream fileInputStream = new FileInputStream(path);
   }
}
