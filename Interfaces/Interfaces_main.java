package Interfaces;
import Interfaces.Points_package.*;

public class Interfaces_main {
    public static void main(String args []){
        Point3D p = new Point3D(1, 7, 5);
        System.out.println(p.lessThan());
        System.out.println(p.moreThan()); }
}
