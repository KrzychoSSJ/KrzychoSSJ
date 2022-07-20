public class Metody {
    public void policzWynik() {
        System.out.println("liczy wynik");
        int result = 0;
        for (int i = 0; i < 100; i++){
            result= result + i;
        }
        System.out.println("wynik to " + result);
    }

    public int pobierzWynik (int number){
        System.out.println("liczy wynik");
        int result = 0;
        for (int i = 0; i < number; i++){
            result= result + i;
        }
        System.out.println("wynik to " + result);
        return result;
    }
}
