public class Practice {
    public static void main(String[] args) {

        // Practice 4 Reverse array
        int[] arr = { 1, 65, 78, 10, -5, 6, 7 };
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
        // Practice 5
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
        // System.out.println(Integer.MAX_VALUE);

        // Practice 6
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}
