package src;
public class Principal {
    public static void main(String[] args){
        Principal p = new Principal();
    }

    public Principal(){
        //Intance objects
        Contador counter = new Contador(10);
        Circulo circle = new Circulo(2);
        Rectangulo rectangle = new Rectangulo(2,3);
        Cuadrado square = new Cuadrado(2);
        Libro book = new Libro("Hunger Games");
        Fraccion fraction = new Fraccion(3,2);
        
        //calls to method
        //counter
        System.out.println(counter.incrementCounter());
        System.out.println(counter.decrementCounter());
        //circle
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
        //rectangle
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        //square
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());
        //book
        System.out.println(book.borrow());
        System.out.println(book.returned());
        //fraction
        System.out.println(fraction.add());
        System.out.println(fraction.subtract());
        System.out.println(fraction.multiply());
        System.out.println(fraction.divide());


        

    }
}
