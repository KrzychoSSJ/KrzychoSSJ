public class ReadOnly {
    private String name = "bartek";

    public String getName(){
        return name + "jest ok"; // getter
    }

    public void setName(String name){
        this.name = name; // setter
    }

}
