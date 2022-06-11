public class AutoTest {
    public static void main(String[] args) {
        Auto mercedes = new Auto();
        mercedes.marka = "mercedes";
        mercedes.model ="c";
        mercedes.rok = 2001;
        mercedes.przebieg = 210000;

        mercedes.jedz();
        mercedes.hamuj();

        Auto audi = new Auto();
        audi.rok = 2003;
        audi.przebieg = 0;
        audi.marka = "audi";
        audi.model ="a6";
        }
    }
