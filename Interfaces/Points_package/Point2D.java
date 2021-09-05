package Interfaces.Points_package;

public class Point2D extends Point implements Comparable {
    int x;
    int y;

    int x_s = 5;
    int y_s = 3;

    //конструктор по умолчанию
    public Point2D() {
        x = 0;
        y = 0; }
    //конструктор со значениями
    public Point2D(int x, int y){
        this.x = x;
        this.y = y; }

    //метод, выводящий координаты точки на экран
    void coutCoordinates(){
        System.out.println("Point's coordinates: x = "+x+", y = "+y); }

    //метод, позволяющий вычислить расстояние от точки до начала координат
    double distToBegin(){
        return Math.sqrt(x*x+y*y); }

    //метод, возвращающий расстояние между двумя точками
    double distToPoint(int x2, int y2){
        return Math.abs(Math.sqrt(x*x+y*y)-Math.sqrt(x2*x2+y2*y2)); }

    //метод интерфейса
    public boolean lessThan(){ //меньше чем точка
        if (Math.sqrt(x*x+y*y) < Math.sqrt(x_s*x_s+y_s*y_s)) return true;
        else return false; }

    public boolean moreThan(){ //больше чем точка
        if (Math.sqrt(x*x+y*y) > Math.sqrt(x_s*x_s+y_s*y_s)) return true;
        else return false; }
}