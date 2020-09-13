public class Main {
    public static void main (String[] arg){
        System.out.println("Hello world!");

//        int[][] array = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//                i++;
//            }
//            System.out.println();
//
//        }

//        IntArr intarray = new IntArr();

        Menu menu = new Menu();
        class1 class1 = new class1();

        //class1.fillArr2();

        System.out.println("Menu:");
        System.out.println("1 = random array");
        System.out.println("2 = step fill array");
        System.out.println("3 = out array");
        System.out.println("4 = exit");
        menu.menuonscreen();

//        System.out.println("random array:");
//        intarray.randArr();
//        System.out.println("fill array:");
//        intarray.fillArr();
//
//        System.out.println("out numbers:");
//        intarray.outArr();



    }
}
