public class Student {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;

    public void przedstawSie(){
        System.out.println("nazywam sie" + imie + " " + nazwisko);
    }
    public void zalogujSie(){
        System.out.println("moj nick" + nick);
    }

    public static void infoUczelnia(){
        System.out.println("uczelnia to agh");
    }
}
