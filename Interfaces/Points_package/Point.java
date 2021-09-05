package Interfaces.Points_package;

public class Point implements Comparable {
    int x;

    int x2 = 5;

    //конструктор по умолчанию
    public Point() {
        x = 0; }
    //конструктор со значениями
    public Point(int x){
        this.x = x; }

    //метод, выводящий координаты точки на экран
    void coutCoordinates(){
        System.out.println("Point's coordinates: x = "+x); }

    //метод, позволяющий вычислить расстояние от точки до начала координат
    double distToBegin(){
        return x; }

    //метод, возвращающий расстояние между двумя точками
    double distToPoint(int x2){
        if (x2>x) return x2-x;
        else return x-x2; }

    //метод интерфейса
    public boolean lessThan(){ //меньше чем точка
        if (x<x2) return true;
        else return false; }

    public boolean moreThan(){ //больше чем точка
        if (x>x2) return true;
        else return false; }
}
