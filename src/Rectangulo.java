package src;
public class Rectangulo {
    private int width;
    private int height;
    public Rectangulo(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public String calculateArea(){
        double area = width*height;
        return "Area: "+area;
    }
    public String calculatePerimeter(){
        double perimeter = 2*width+2*height;
        return "Perimeter: "+perimeter;
    }


}
