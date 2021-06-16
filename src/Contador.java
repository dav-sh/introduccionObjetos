package src;
public class Contador {
    private int count;
    
    public Contador(){

    }

    public Contador(int count){
        this.count = count;
    }

    public Contador(Contador contador){
        this.count = contador.count;


    }

    public void setCount(int count){
        this.count = count;
    }
    public int getCount(){
        return this.count;
    }
    public String incrementCounter(){
        return "count +1 : "+this.count++;
    }

    public String decrementCounter(){
        return "cpunt -1 : "+this.count--;
    }

}