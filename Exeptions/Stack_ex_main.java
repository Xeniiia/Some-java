package Exeptions;

public class Stack_ex_main {
    public static void main(String [] args){
        Stack ss = new Stack(10);
        try{ for (int i=0; i<11; i++) ss.push((char) i); }
        catch (StackFull ex) { System.out.println(ex); }

        try { for (int i=0; i<11; i++) ss.pop(); }
        catch (StackEmpty ex) { System.out.println(ex); }
    }
}
