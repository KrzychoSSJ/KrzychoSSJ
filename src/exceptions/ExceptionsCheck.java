package exceptions;

import java.util.Scanner;

public class ExceptionsCheck {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age < 0){
            throw new InvalidAgeException("zly wiek");
        }

    }

}
