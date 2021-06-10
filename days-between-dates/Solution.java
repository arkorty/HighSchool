import java.io.*;
import java.time.*;
import java.time.temporal.*;

class Solution {
    // Declaring vaiables
    String date_1, date_2;
    long days;

    // Constructor for initializing variables
    Solution() {
        date_1 = "";
        date_2 = "";
        days = 0;
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

        System.out.print("Enter starting date in YYYY-MM-DD format: ");
        date_1 = in.readLine();
        System.out.print("Enter ending date in YYYY-MM-DD format: ");
        date_2 = in.readLine();
    }

    // Compute method for calculating days between the dates
    void compute() {
        LocalDate ld_1 = LocalDate.parse(date_1);
        LocalDate ld_2 = LocalDate.parse(date_2);

        days = ChronoUnit.DAYS.between(ld_1, ld_2);
    }

    // Output method for displaying the results
    void output() {
        System.out.println("Days between starting and ending date: " + days);
    }
}
