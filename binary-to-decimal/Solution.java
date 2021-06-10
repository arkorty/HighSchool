import java.io.*;

class Solution {
    // Declaring variables
    String bin;
    int dec;

    // Constructor for initializing variables
    Solution() {
        bin = "";
        dec = 0;
    }

    // Main method for running the program
    public static void main(String[] args) throws IOException {
        Solution ob = new Solution();
        ob.input();
        ob.compute();
        ob.output();
    }

    // Input method for taking inputs from the user
    void input() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number in binary: ");
        bin = in.readLine();
    }

    // Compute method for calculating the result
    void compute() {
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) != '0' && bin.charAt(i) != '1') {
                dec = -1;
                return;
            } else
                dec += Character.getNumericValue(bin.charAt(bin.length() - i - 1)) * Math.pow(2, i);
        }
    }

    // Output method for displaying the results
    void output() {
        if (dec != -1)
            System.out.println("Result: " + dec);
        else
            System.out.println("Entered number is not binary.");
    }
}
