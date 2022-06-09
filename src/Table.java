public class Table {
    public static void main(String[] args) {
        String[] imiona = new String[3];
        imiona[0] = "bartek";
        imiona[1] = "krzys";
        imiona[2] = "michal";

        System.out.println(imiona[0]);
        System.out.println(imiona[2]);

        int[] cyfry = new int[]{1,2,3,4};
        System.out.println(cyfry[0]);
        System.out.println(cyfry.length); // pokazuje dlugosc tablicy

        for (int i = 0; i < imiona.length; i++)
        {
            System.out.println(imiona[i]);
        }

    }
}
