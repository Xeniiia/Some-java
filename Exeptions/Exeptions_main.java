package Exeptions;
//Часть 1 (задание 1-2)
public class Exeptions_main {
    public static void main (String args []){
        //генерировать ошибку деления на ноль. При помощи обработчика исключений
        // обработать эту ситуацию и вывести свое сообщение об ошибке.
        int a = 10; int b = 0;
        try { int c = a/b; }
        catch (ArithmeticException ехс){ System.out.println("Ошибка! На ноль делить нельзя!"); }

        //генерировать NullPointerException. При помощи обработчика исключений
        // обработать эту ситуацию и вывести свое сообщение об ошибке.
        int [] arr = null;
        try{ arr[0] = 1;}
        catch (NullPointerException е) { System.out.println("Ошибка! Обращение к пустой ссылке!"); }
    }
}