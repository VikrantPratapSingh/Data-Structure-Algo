
// Java program to print the Fibonacci Series
// using command line arguments

    public class FibonacciSeries {

    // Function to print the Fibonacci Series
    static void fib(int n)
    {

        int a = 0, b = 1, c, i;

        if (n <= 1)
            System.out.print(a + " ");
        else {

            System.out.print(a + " " + b + " ");

            for (i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;

                System.out.print(c + " ");
            }

            System.out.println();
        }
    }

    // Driver code
    public static void main(String[] args)
    {

        // Check if length of args array is
        // greater than 0
        if (args.length > 0) {

            // Get the command line argument and
            // Convert it from string type to integer type
            int num = Integer.parseInt(args[0]);

            // Print the Fibonacci series
            fib(num);
        }
        else
            System.out.println("No command line "
                    + "arguments found.");
    }
}
