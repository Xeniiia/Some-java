package Exeptions;

//класс, реализующий очередь
public class Stack {
    char S[];
    int indpush, indpop;

    //конструктор класса, создает стек размера size
    public Stack(int size){
        S = new char[size+1];
        indpush = indpop = 0; }

    //-----------МЕТОДЫ:----------------------
    //получить элемент стека
    public char pop() throws StackEmpty {
        if (indpop==0) throw new StackEmpty();
        indpop--;
        return S[indpop]; }
    //добавить элемент
    public void push(char x) throws StackFull {
        if (indpush==S.length-1) throw new StackFull();
        indpush++; indpop++;
        S[indpush]=x; }
    //просмотреть элемент сверху
    public char top() throws StackEmpty {
        if (indpop==0) throw new StackEmpty();
        return S[indpop]; }
}