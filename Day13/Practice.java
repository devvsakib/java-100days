public class Practice {
    public static void main(String[] args) {

        // Practice 1
        // float[] marks = {50.45f, 76.4f,87.56f, 100.0f};
        // float sum = 0;
        // for (float f : marks) {
        // sum += f;
        // }
        // System.out.println(sum);

        // Practice 2
        // float[] marks = {50.45f, 76.4f,87.56f, 100.0f};
        // float num = 87.556f;
        // float num = 87.556f;
        // boolean isArray = false

        // Practice 3
        // float[] marks = {50.45f, 76.4f,87.56f, 100.0f};
        // float sum = 0;
        // for (float f : marks) {
        // sum += f;
        // }
        // sum = sum / marks.length;
        // System.out.println(sum);

        // Practice 4 addition of two 2D array
        /*
         * int[][] mat1 = {
         * { 1, 2, 3 },
         * { 4, 5, 6 } };
         * int[][] mat2 = {
         * { 3, 4, 5 },
         * { 6, 5, 8 } };
         * int[][] result = {
         * { 0, 0, 0 },
         * { 0, 0, 0 } };
         * 
         * for (int m1 = 0; m1 < mat1.length; m1++) { // row
         * for (int i = 0; i < mat1[m1].length; i++) { // column
         * result[m1][i] = mat1[m1][i] + mat2[m1][i];
         * System.out.print(result[m1][i] + " ");
         * }
         * System.out.println();
         * }
         */

        // Practice 4 Reverse array
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int a = Math.floorDiv(arr.length, 2);
        int temp;
        for (int i = 0; i < a; i++) {
            // swap a[i] [l-1-i]
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for (int e : arr) {
            System.out.println(e);
        }
    }
}
