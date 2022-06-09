public class Switch {
    public static void main(String[] args) {
        String danie = "kotlet";
        switch (danie){
            case "pizza":
                System.out.println("10 zl");
                break;
            case "kotlet":
                System.out.println("pyszny za darmo");
                break;
            case "golabki":
                System.out.println("drogie 15 ziko marynarzu");
                break;
            default:
                System.out.println("brak dania w karcie");

        }
    }
}
