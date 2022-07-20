import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("podaj druga liczbe");
        int secondNumber = scanner.nextInt();
        Calculator2 calculator = new Calculator2();
        System.out.println("dodawanie" + calculator.dodawanie(firstNumber,secondNumber));
        System.out.println("odejmowanie" + calculator.odejmowanie(firstNumber,secondNumber));
        System.out.println("modulo: " + calculator.modulo(firstNumber,secondNumber));
    }
}
