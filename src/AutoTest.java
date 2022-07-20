public class AutoTest {
    public static void main(String[] args) {
        Auto mercedes = new Auto();
        mercedes.marka = "mercedes";
        mercedes.model ="c";
        mercedes.rok = 2001;
        mercedes.przebieg = 210000;

        mercedes.jedz();
        mercedes.hamuj();

        Auto audi = new Auto(mercedes.marka, mercedes.model, mercedes.rok, mercedes.przebieg);
        }
    }
