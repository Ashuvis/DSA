public class Reverse_number {

    // Main function exposed to the user
    public static int reverse(int num) {
        return reverseHelper(num, 0);
    }

    // Helper function that handles the recursion and accumulator
    private static int reverseHelper(int n, int reversedAcc) {
        // Base case: when no digits are left
        if (n == 0) {
            return reversedAcc;
        }

        // Extract last digit and shift accumulator left
        reversedAcc = (reversedAcc * 10) + (n % 10);

        // Recursive call with the remaining digits
        return reverseHelper(n / 10, reversedAcc);
    }

    public static void main(String[] args) {
        int number = 12345;
        int result = reverse(number);

        System.out.println("Original: " + number);
        System.out.println("Reversed: " + result);
    }

}
