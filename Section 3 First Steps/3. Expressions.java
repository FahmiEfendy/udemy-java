public class Expressions {

    public static void main(String[] args) {
        int firstNumber = (10 + 5) + (2 * 10); // 35
        int secondNumber = 12;
        int thirdNumber = 6 * 2; // 12
        int total = firstNumber + secondNumber + thirdNumber;
        // out: 59
        System.out.print("Total >>> " + total);

        int lastNumber = 1000 - total;
        // out: 941
        System.out.print("Last Number >>> " + lastNumber);
    }
}