public class Teacher extends Person {
    public String school;

    public Teacher(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public void teachMath() {
        System.out.println("im teaching math");
    }
}
