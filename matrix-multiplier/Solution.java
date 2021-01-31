import java.io.*;
import java.util.*;

public class Solution {

    // Declaring vaiables
    int[][] mtx_1;
    int[][] mtx_2;
    int[][] mtx_3;

    // Constructor for initializing variables
    Solution() {
        mtx_1 = new int[3][3];
        mtx_2 = new int[3][3];
        mtx_3 = new int[3][3];
    }

    // Main method for running the program
    public static void main(String[] args) throws IOException {
        Solution ob = new Solution();
        ob.input();
        ob.multiply();
        ob.output();
    }

    // Input method for taking inputs from the user
    void input() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter elements of the first matrix below:-");
        for (int i = 0; i < mtx_1.length; i++)
            for (int j = 0; j < mtx_1[0].length; j++) {
                System.out.print("Enter an integer at [" + i + "][" + j + "]: ");
                mtx_1[i][j] = Integer.parseInt(in.readLine());
            }

        System.out.println("Enter elements of the second matrix below:-");
        for (int i = 0; i < mtx_2.length; i++)
            for (int j = 0; j < mtx_2[0].length; j++) {
                System.out.print("Enter an integer at [" + i + "][" + j + "]: ");
                mtx_2[i][j] = Integer.parseInt(in.readLine());
            }
    }

    // Multiply method for multiplying the two matrices
    void multiply() {
        for (int i = 0; i < mtx_1.length; i++)
            for (int j = 0; j < mtx_2[0].length; j++)
                for (int k = 0; k < mtx_1[0].length; k++)
                    mtx_3[i][j] += mtx_1[i][k] * mtx_2[k][j];
    }

    // Output method for displaying the results
    void output() {
        System.out.println("First Matrix:-");
        for (int i = 0; i < mtx_1.length; i++)
            System.out.println(Arrays.toString(mtx_1[i]));
        System.out.println("Second Matrix:-");
        for (int i = 0; i < mtx_2.length; i++)
            System.out.println(Arrays.toString(mtx_2[i]));
        System.out.println("Multiplied Matrix:-");
        for (int i = 0; i < mtx_3.length; i++)
            System.out.println(Arrays.toString(mtx_3[i]));
    }
}
