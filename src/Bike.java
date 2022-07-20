public class Bike implements Vehicle{

    @Override
    public void jazda(int speed) {
        System.out.println("jade rowerem" + speed);
    }

    @Override
    public void stop() {
        System.out.println("hamuje rowerem");

    }
}
