package Interfaces.Points_package;

public class Point3D extends Point2D implements Comparable {
    int x;
    int y;
    int z;

    //координаты точки для lessThan и more Than
    int x_t = 4;
    int y_t = 2;
    int z_t = 20;

    //конструктор по умолчанию
    public Point3D() {
        x = 0;
        y = 0;
        z = 0;}
    //конструктор со значениями
    public Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z; }

    //метод, выводящий координаты точки на экран
    void coutCoordinates(){
        System.out.println("Point's coordinates: x = "+x+", y = "+y+", z = "+z); }

    //метод, позволяющий вычислить расстояние от точки до начала координат
    double distToBegin(){
        return Math.sqrt(Math.sqrt(x*x+y*y)*Math.sqrt(x*x+y*y)+z*z); }

    //метод, возвращающий расстояние между двумя точками
    double distToPoint(int x2, int y2, int z2){
        double  a = Math.sqrt(Math.sqrt(x*x+y*y)*Math.sqrt(x*x+y*y)+z*z);
        double b = Math.sqrt(Math.sqrt(x2*x2+y2*y2)*Math.sqrt(x2*x2+y2*y2)+z2*z2);
        return Math.abs(a-b); }

    //метод интерфейса
    public boolean lessThan(){ //меньше чем точка
        double  a = Math.sqrt(Math.sqrt(x*x+y*y)*Math.sqrt(x*x+y*y)+z*z);
        double b = Math.sqrt(Math.sqrt(x_t*x_t+y_t*y_t)*Math.sqrt(x_t*x_t+y_t*y_t)+z_t*z_t);
        if (a < b) return true;
        else return false; }

    public boolean moreThan(){ //больше чем точка
        double  a = Math.sqrt(Math.sqrt(x*x+y*y)*Math.sqrt(x*x+y*y)+z*z);
        double b = Math.sqrt(Math.sqrt(x_t*x_t+y_t*y_t)*Math.sqrt(x_t*x_t+y_t*y_t)+z_t*z_t);
        if (a > b) return true;
        else return false; }
}