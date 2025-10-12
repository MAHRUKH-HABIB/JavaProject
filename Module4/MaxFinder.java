public class MaxFinder {

    // Overloaded method for int values
    public static int findMax(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    // Overloaded method for double values
    public static double findMax(double a, double b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        // Calling int version
        int maxInt = findMax(20, 9);
        System.out.println("Larger integer: " + maxInt);

        // Calling double version
        double maxDouble = findMax(9.5, 12.3);
        System.out.println("Larger double: " + maxDouble);
    }
}