public class Points_main {
    public static void main(String args []){
        Point2D A = new Point2D(3);
        Point2D B = new Point2D(8);
        Point2D Zero = new Point2D();
        Zero.coutCoordinates();
        A.coutCoordinates();
        System.out.println(A.distToBegin());
        System.out.println(Zero.distToBegin());
        System.out.println(B.distToPoint(3));

        Point2D A2 = new Point2D(3, 3);
        Point2D B2 = new Point2D(8, 2);
        Point2D Zero2 = new Point2D();
        Zero2.coutCoordinates();
        A2.coutCoordinates();
        System.out.println(A2.distToBegin());
        System.out.println(Zero2.distToBegin());
        System.out.println(B2.distToPoint(3, 2));

        Point3D A3 = new Point3D(3, 3, 2);
        Point3D B3 = new Point3D(8, 2, 5);
        Point3D Zero3 = new Point3D();
        Zero3.coutCoordinates();
        A3.coutCoordinates();
        System.out.println(A3.distToBegin());
        System.out.println(Zero3.distToBegin());
        System.out.println(B3.distToPoint(3, 2, 16));

    }
}
