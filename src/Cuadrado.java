package src;
public class Cuadrado {
    private int side;
    public Cuadrado(int side) {
        this.side = side;
    }
    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }
    public String calculateArea(){
        double area = side *side;
        return "Area: "+area;
    }
    public String calculatePerimeter(){
        double perimeter = side *4;
        return "Perimeter: "+perimeter;
    }
}
