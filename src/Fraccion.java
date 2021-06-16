package src;
public class Fraccion {
    private int number1, number2;
    public Fraccion(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumbe1r() {
        return this.number1;
    }
    public void setNumber1(int number) {
        this.number1 = number;
    }

    public int getNumbe2r() {
        return this.number2;
    }
    public void setNumber2(int number){
        this.number2 = number;
    }
    public String add(){
        double add = this.number1 + this.number2;
        return "Add : "+add;
    }
    public String subtract(){
        double subtract = this.number1 - this.number2;          
        return "Subtract : "+subtract;
    }
    public String divide(){
        double divide = this.number1/this.number2;
        return "Divide: "+divide;
    }
    public String multiply(){
        double multiply = this.number1*this.number2;
        return "Multiply: "+multiply;
    }
}
