package Opps.Interface;

interface vehicle{
    void start();

    default void stop(){
        System.out.println("car stoped");

    }
}

class car implements vehicle{
    public void start(){
        System.out.println("car started");
    }

}
public class program3 {

    public static void main(String[] args) {
        vehicle rr = new car();
        rr.start();
        rr.stop();

        
    }
    
}
