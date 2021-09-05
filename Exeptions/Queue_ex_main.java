package Exeptions;
public class Queue_ex_main {
    public static void main(String [] args){
        Queue Q = new Queue(10);
        try{
            for (int i=0; i<11; i++) Q.put((char)i); }
        catch (QueueFull ex){
            System.out.println(ex); }

        try{
            for (int i=0; i<11; i++) Q.get(); }
        catch (QueueEmpty ex){
            System.out.println(ex); }
    }
}
