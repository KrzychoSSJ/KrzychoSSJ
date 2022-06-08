import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwsza liczbe");
        int liczba1 = scanner.nextInt();
        System.out.println("podaj druga liczbe");
        int liczba2 = scanner.nextInt();
        int dodawanie = liczba1 + liczba2;
        System.out.println("Wynik dodawnia tych liczb to:" + dodawanie);
    }


}
