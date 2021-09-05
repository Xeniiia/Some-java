public class MyMatrix_class {
    //Ограничьте доступ к переменным, задающим высоту,
    //ширину и массив, в котором будут храниться элементы матрицы.
    private int hei; //высота
    private int wid;// ширина
    private int [][] arr;

    //Напишите конструктор, который принимает число,
    // создает квадратную матрицу соответствующего размера, и заполняет ее нулями.
    public MyMatrix_class(int x){
        hei = x;
        wid = x;
        arr = new int[hei][wid];
        for (int i=0; i<hei; i++)
            for (int j=0; j<wid; j++)
                arr[i][j]=0; }
    //Перегрузите конструктор матрицы - создайте версии конструктора, которые:
    //Будет создавать прямоугольную матрицу с заданными высотой и шириной.
    public MyMatrix_class(int x, int y) {
        hei = x; wid = y;
        arr = new int[x][y];
        for (int i=0; i<x; i++)
            for (int j=0; j<y; j++)
                arr[i][j]=0; }
    //Будет создавать прямоугольную матрицу и заполнять ее заданным числом.
    public MyMatrix_class(int x, int y, int c){
        hei = x; wid = y;
        arr = new int[x][y];
        for (int i=0; i<x; i++)
            for (int j=0; j<y; j++)
                arr[i][j]=c;}

    //Будет создавать копию уже имеющейся матрицы.
    public MyMatrix_class(int arrForCopy[][]){
        hei = arrForCopy.length;
        wid = arrForCopy[0].length;
        arr = new int[hei][wid];
        for (int i=0; i<hei; i++)
            for (int j=0; j<wid; j++)
                arr[i][j]= arrForCopy[i][j];}


    //Создайте методы, позволяющие узнать ширину и высоту матрицы.
    int get_height(){ return hei;}
    int get_widht(){ return wid;}

    //Добавьте методы, позволяющие задать значение отдельному элементу матрицы
    public void newElem(int i, int j, int zn){
        arr[i][j] = zn; }
    // и получить значение отдельного элемента матрицы.
    public int knowElem(int i, int j){
        return arr[i][j]; }

    //Напишите метод, который выводит матрицу на экран.
    public void printMatrix(){
        //System.out.println("Матрица "+hei+"x"+wid);
        //System.out.println(hei+" "+wid);
        for (int i=0; i<hei; i++){
            for (int j=0; j<wid; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();} }


    //Напишите метод, который будет добавлять к матрице число.
    public void sum_const(int k){
        for (int i=0; i<hei; i++)
            for (int j=0; j<wid; j++)
                arr[i][j] += k; }
    //Перегрузите его, чтобы можно было добавить матрице другую матрицу.
    public void sum_matrix(int [][] arrForSum){
        for (int i=0; i<hei; i++)
            for (int j=0; j<wid; j++)
                arr[i][j] += arrForSum[i][j]; }

    //Напишите метод для транспонирования матрицы.
    public int[][] transp(){
        int [][] arrTransp = new int[wid][hei];
        for(int i=0; i<hei; i++)
            for(int j=0; j<wid; j++)
                arrTransp[j][i] = arr[i][j];
            return arrTransp; }

    }