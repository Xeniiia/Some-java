public class Point2D extends Point {
    int x;
    int y;
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

    //Для абстрактного класса Point:

    //конструктор со значениями
    public Point2D (int x){
        this.x = x;
        this.y = 0;}

    //метод, выводящий координаты точки на экран
    //void coutCoordinates(){
    //   System.out.println("Point's coordinates: x = "+x); }

    //метод, позволяющий вычислить расстояние от точки до начала координат
    //double distToBegin(){
    //    return x; }

    //метод, возвращающий расстояние между двумя точками
    double distToPoint(int x2){
        if (x2>x) return x2-x;
        else return x-x2; }
}
