package at.ran.patterns.singleton;

public class Counter {
    private int count = 0;
    public static Counter counter = null;

    private Counter(){
        
    }

    public static Counter getInstance(){
        if(counter == null){
            counter = new Counter();
        }
        return counter;
    }

    public void increment(){
        count++;    
    }

    public int getCount() {
        return count;
    }
}
