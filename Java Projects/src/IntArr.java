import java.util.Scanner;

public class IntArr {
    //int[][] array = new int[2][2];
    private int[][] array = new int[4][4];
    private int firstnum;
    private int step;

    public void intArr() {
        //array = new int[2][2]
        //int[][] array = new int[4][4]
    }

    public void randArr() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = ((int) (Math.random() * 12) - 15);
                System.out.print(array[i][j] + "\t");

            }
            System.out.println();
        }
    }


    public void fillArr() {
        //a = 1;

        System.out.println("first number:");
        Scanner in = new Scanner(System.in);
        firstnum = in.nextInt();

        System.out.println("step:");
        Scanner in2 = new Scanner(System.in);
        step = in.nextInt();



        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {



                array[i][j] = firstnum;
//
//                if (z < 1) {
//                    z = a + b;
//                } else if (z == 1) {
//                   z = a + b;
//                } else {
//                    z = a + b;
//               }

                firstnum = array[i][j] + step;

                //a++;
                //z = a * b;
                //array[i][j] = a * b;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public void outArr(){
        // с 4.4 до 1.1
//        for (int i = array.length-1; i > -1; i--) {
//            for (int j = array[i].length-1; j > -1; j--) {
//                System.out.print(array[i][j] + "\t");
//                i--;
//            }
//            System.out.println();
//        }


        // с 1.4 до 4.1
        for (int i = 0; i < array.length; i++) {
            for (int j = array[i].length-1; j > -1; j--) {
                System.out.print(array[i][j] + "\t");
                i++;
            }
            System.out.println();
        }


        // с 4.1 до 1.4
//        for (int i = array.length-1; i > -1; i--) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//                i--;
//            }
//            System.out.println();
//        }

    }
}



