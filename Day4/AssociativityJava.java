public class AssociativityJava {
    public static void main(String[] args) {
        // Precedence & Associativity
        int x = 5 * 12 - 30 / 2;
        /*
         * Precedence
         * 5*12 = 60
         * 30/2 = 15
         * 60 - 15 = 45
         */
        int y = 20 / 5 - 30 * 2;
        /*
         * / === * -> Left to Right
         * Associativity
         * 20/5 = 4
         * 30*2 = 60
         * 44 - 60 = -56
         */
        // System.out.println(y);
        /*
         * 
         * + - less precedence * /
         * x => first *, second /, third -,
         * +, - --> Left to Right
         * ++, = --> Right to Left
         */
        // TASK
        int a = 1;
        int c = 2;
        int task1 = (x - y) / 2;
        int task2 = ((x * x) - (4 * a * c)) / (2 * a);
        System.out.println(task1);
        System.out.println(task2);
    }
}
