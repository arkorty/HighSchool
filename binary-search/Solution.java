import java.io.*;
import java.util.*;

class Solution {

    // Declaring variables
    int[] data;
    int[] sorted_data;
    int pos;
    int key;

    // Constructor for initializing variables
    Solution() {
        data = new int[10];
        sorted_data = new int[10];
        pos = -1;
    }

    // Main method for running the program
    public static void main(String[] args) throws IOException {
        Solution ob = new Solution();
        ob.input();
        ob.sort();
        ob.search();
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

        System.out.print("Enter the element to be searched: ");
        key = Integer.parseInt(in.readLine());
    }

    // Sorting method for sorting the array in ascending order
    void sort() {
        int[] temp_data = new int[data.length];
        for (int i = 0; i < data.length; i++)
            temp_data[i] = data[i];

        for (int i = 0, l = temp_data.length; i < l - 1; i++)
            for (int j = 0; j < l - i - 1; j++)
                if (temp_data[j] > temp_data[j + 1]) {
                    int temp = temp_data[j];
                    temp_data[j] = temp_data[j + 1];
                    temp_data[j + 1] = temp;
                }

        for (int i = 0; i < temp_data.length; i++)
            sorted_data[i] = temp_data[i];
    }

    // Search method that searching for the key in the array
    void search() {
        int l = 0, r = sorted_data.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (sorted_data[m] == key) {
                pos = m;
                break;
            }

            else if (sorted_data[m] < key)
                l = m + 1;

            else
                r = m - 1;
        }
    }

    // Output method for displaying the results
    void output() {
        System.out.println("Original array - " + Arrays.toString(data));
        System.out.println("Sorted array - " + Arrays.toString(sorted_data));

        if (pos != -1)
            System.out.println(key + " was found at [" + pos + "].");

        else
            System.out.println(key + " was not found.");
    }
}
