import java.util.Scanner;

public class ZadaniePiwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoj wiek kapitanie");
        int wiek = scanner.nextInt();
        if(wiek >= 18)
        {
            System.out.println("mozesz kupic piwo");
        }
            else if (wiek <=0)
            {
            System.out.println("podaj poprawna wartosc");
            }
            else
            {
            System.out.println("nie mozesz kupic piwa  ");
            }
        }
    }
