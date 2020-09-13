import java.util.Scanner;

public class class1 {

    private int[] array = new int[4];
    private int firstnum;
    private int step;

    public void fillArr2 () {

        System.out.println("first number:");
        Scanner in = new Scanner(System.in);
        firstnum = in.nextInt();

        System.out.println("step:");
        Scanner in2 = new Scanner(System.in);
        step = in.nextInt();

        for (int i = 0; i < array.length; i++) {

            array[i] = firstnum;

            firstnum = array[i] + step;

            System.out.print(array[i] + "\t");
        }
    }
}
