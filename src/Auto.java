public class Auto {
    public String marka;
    public String model;
    public int przebieg;
    public int rok;

    public Auto (){}

    public Auto (String marka, String model, int rok, int przebieg){
    this.marka = marka;
    this.model = model;
    this.przebieg = przebieg;
    this.rok = rok;
    }

    public void jedz(){
        System.out.println("jedz");
    }
    public void hamuj(){
        System.out.println("hamuj");
    }
}
