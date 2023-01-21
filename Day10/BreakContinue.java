public class BreakContinue {
    public static void main(String[] args) {

        // for (int j = 0; j < 10; j++) {
        // System.out.println(j);

        // // end loop when j equal 3
        // if (j == 3) {
        // System.out.println("End Loop");
        // break;
        // }
        // }

        // int i = 3;
        // while (i < 10) {
        // if (i == 7) {
        // System.out.println("End Loop");
        // break;
        // }
        // System.out.println(i);
        // i++;
        // }

        // Continue
        // for (int j = 0; j < 10; j++) {
        // if (j == 7) {
        // System.out.println("Ignore below code");
        // continue;
        // }
        // System.out.println(j);
        // }

        int i = 2;
        do {
            i++;
            if (i == 4) {
                System.out.println("Ignore 4");
                continue;
            }
            System.out.println(i);
        }while (i < 10);

    }
}
