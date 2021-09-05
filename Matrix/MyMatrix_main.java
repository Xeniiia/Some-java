public class MyMatrix_main {
    public static void main (String [] args){
        //матрица 3х3, заполненная нулями:
        MyMatrix_class m_3x3_zero = new MyMatrix_class(3);
        //выведем для проверки:
        System.out.println("Матрица 3х3, заполненная нулями:");
        m_3x3_zero.printMatrix();

        System.out.println();

        //матрица 2х3, заполненная нулями:
        MyMatrix_class m_MxN_zero = new MyMatrix_class(2, 4);
        //выведем для проверки:
        System.out.println("Матрица MxN (2x4), заполненная нулями:");
        m_MxN_zero.printMatrix();

        System.out.println();

        //матрица 2х3, заполненная константой:
        MyMatrix_class m_MxN_const = new MyMatrix_class(2, 3, 7);
        //выведем для проверки:
        System.out.println("Матрица MxN (2x3), заполненная числом (7):");
        m_MxN_const.printMatrix();

        //копия уже имеющейся матрицы:
        int ar[][] = {{ 1, 2, 3}, {4, 5, 6 }};
        MyMatrix_class m_copy = new MyMatrix_class(ar);
        //выведем для проверки:
        System.out.println("Копия матрицы:");
        m_copy.printMatrix();

        //Узнаем высоту и ширину:
        System.out.println("Высота матрицы m_3x3_zero = "+m_3x3_zero.get_height());
        System.out.println("Ширина матрицы m_MxN_zero = "+m_MxN_zero.get_widht());

        System.out.println();

        //Зададим отдельный элемент матрицы:
        m_MxN_zero.newElem(1,3,5);
        //выведем для проверки:
        System.out.println("Зададим отдельный элемент, (2, 4) должен быть равен 5:");
        m_MxN_zero.printMatrix();

        System.out.println();

        //прибавим к матрице число
        m_3x3_zero.sum_const(3);
        System.out.println("Прибавим к матрице 3х3, заполенной нулями, 3:");
        m_3x3_zero.printMatrix();

        System.out.println();

        //прибавим к матрице матрицу
        int ar2[][] = {{ 0, 0, 0}, {1, 1, 1 }, {2, 2, 2 }};
        m_3x3_zero.sum_matrix(ar2);
        System.out.println("Прибавим к предыдущей матрице другую матрицу:");
        m_3x3_zero.printMatrix();

        //транспонируем матрицу
        int trMatrix[][] = m_3x3_zero.transp();
        System.out.println("Транспонируем предыдущюю матрицу:");
        for (int i=0; i<trMatrix.length; i++){
            for (int j=0; j<trMatrix[0].length; j++)
                System.out.print(trMatrix[i][j]+" ");
            System.out.println();}

    }
}
