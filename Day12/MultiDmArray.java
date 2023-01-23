public class MultiDmArray {
    public static void main(String[] args) {
        // 2D Array
        String[][] twoD;
        twoD = new String[2][3];
        twoD[0][0] = "DevvSakib";
        twoD[0][1] = "Frontend";
        twoD[0][2] = "Hi!";
        twoD[1][0] = "Developer";
        twoD[1][1] = "I'm";
        twoD[1][2] = "";
        // System.out.print(twoD[0][2] + " ");
        // System.out.print(twoD[1][1] + " ");
        // System.out.print(twoD[0][0] + " ");
        // System.out.print(twoD[0][1] + " ");
        // System.out.print(twoD[1][0] + " ");
        // System.out.println();
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j]);
                System.out.print(" ");
            }
        }
    }
}

// Multidimentional Array
// Array of Array = array element also array = array of array elements also
// array 3D array