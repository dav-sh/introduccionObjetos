package src;
public class Contador {
    private int count;
    
    public Contador(){

    }

    public Contador(int count){
        this.count = 0;
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
    public void incrementCounter(){
        this.count++;
    }

    public void decrementCounter(){
        this.count--;
    }

}