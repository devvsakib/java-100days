public class Practice {

    static void foo() {
        System.out.println("Hello Foo 1");
    }

    static void foo(int a, int b) {
        if (a < b) {
            System.out.println("A is small");
        } else {
            System.out.println("B is small");
        }
    }

    static void foo(int[] ar){
        for (int i : ar) {
            if (i == 5) {
                System.out.format("Your array contain %d \n", i);

            }
        }
    }
    static void foo(String a){
        if (a.contains("dib")) {
            System.out.println(true);
        }
        else{
            System.out.println("Sorry! This word doesn't exit!");
        }
    }


    public static void main(String[] args) {
        // foo();
        // foo(7, 5);
        int [] arr = {1,2,3,4,5};
        // foo(arr);

        String name = "DevvSakib";
        // foo(name);

        

    }
}