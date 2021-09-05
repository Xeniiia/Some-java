package Exeptions;

//класс, реализующий очередь
public class Queue {
    char q[];
    int indp, indg;

    //конструктор класса, создает очередь размера size
    public Queue(int size){
        q = new char[size+1];
        indp = indg = 1; }

    //-----------МЕТОДЫ:----------------------
    //получить элемент очереди
    public char get() throws QueueEmpty {
        if (indp==indg) throw new QueueEmpty();
        indg++;
        return q[indg]; }
    //добавить элемент
    public void put(char x) throws QueueFull {
        if (indp==q.length-1) throw new QueueFull();
        indp++;
        q[indp]=x; }
}
