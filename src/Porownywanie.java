import java.util.Scanner;

public class Porownywanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj 1 liczbe");
        int  liczb1 = scanner.nextInt();
        System.out.println("podaj 2 liczbe");
        int liczba2 = scanner.nextInt();
        boolean wieksze = (liczb1>liczba2);
        System.out.println("wieksze: " + wieksze);

    }
}
