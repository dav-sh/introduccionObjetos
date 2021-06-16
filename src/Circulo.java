package src;

public class Circulo {
    private int radius;
    public Circulo(int radius){
        this.radius = radius;
    }
    public int getradius(){
        return this.radius;
    }
    public void setradius(int radius){
        this.radius = radius;
    }
    public String calculateArea(){
        double area = radius *radius*Math.PI;
        return "Area: " + area;
    }
    public String calculatePerimeter(){
        double perimeter=2*Math.PI*radius;
        return "Perimeter: " + perimeter;

    }

}
