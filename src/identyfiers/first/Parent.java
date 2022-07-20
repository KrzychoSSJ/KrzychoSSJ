package identyfiers.first;

public class Parent {

    public String first ="public";
    String second = "domyslna";
    protected String third = "protected";
    private String fourth = "prywatna";

    public void firstMethod(){
        System.out.println("public");
    }
    void secondMethod(){
        System.out.println("domyslna");
    }
    private void fourthMethod(){
        System.out.println("prywatna");
    }
    protected void thirdMethod(){
        System.out.println("chroniona");
    }

    public void testIdentyfiers(){
        thirdMethod();
    }
}
