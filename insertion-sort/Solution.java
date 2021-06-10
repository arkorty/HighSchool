import java.io.*;
import java.util.*;

class Solution {
    // Declaring variables
    int[] data;
    int[] sorted_data;

    // Constructor for initializing variables
    Solution() {
        data = new int[10];
        sorted_data = new int[10];
    }

    // Main method for running the program
    public static void main(String[] args) throws IOException {
        Solution ob = new Solution();
        ob.input();
        ob.sort();
        ob.output();
    }

    // Input method for taking inputs from the user
    void input() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the array elements below:-");
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter an integer at [" + i + "]: ");
            data[i] = Integer.parseInt(in.readLine());
        }
    }

    // Sorting method for sorting the array in ascending order
    void sort() {
        int[] temp_data = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            temp_data[i] = data[i];
        }

        for (int i = 1, l = temp_data.length; i < l; ++i) {
            int temp = temp_data[i];
            int j = i - 1;

            while (j >= 0 && temp_data[j] > temp) {
                temp_data[j + 1] = temp_data[j];
                j = j - 1;
            }

            temp_data[j + 1] = temp;
        }

        for (int i = 0; i < temp_data.length; i++) {
            sorted_data[i] = temp_data[i];
        }
    }

    // Output method for displaying the results
    void output() {
        System.out.println("Original array:-\n" + Arrays.toString(data));
        System.out.println("Sorted array:-\n" + Arrays.toString(sorted_data));
    }
}
