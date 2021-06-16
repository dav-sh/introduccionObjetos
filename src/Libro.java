package src;
public class Libro {
    private String name;
    public Libro() {

    }
    public Libro(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String borrow(){
        return this.name+" borrowed";
    }
    public String return(){
        return this.name+" returned"
    }
    public String seeInformation(){
        return this.name+ " information...";
    }
}
