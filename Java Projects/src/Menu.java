import java.util.Scanner;

public class Menu {
    private int num;
    private int exit = 1;
    IntArr intarray = new IntArr();

    public void menuonscreen() {
        while (exit > 0) {
            Scanner in = new Scanner(System.in);
            num = in.nextInt();

            switch (num) {
                case 1:
                    intarray.randArr();;
                    break;
                case 2:
                    intarray.fillArr();
                    break;
                case 3:
                    intarray.outArr();
                    break;
                case 4:
                    exit = 0;
                    break;
//                default:
//                    ;
//                    break;
            }
        }
    }

}

