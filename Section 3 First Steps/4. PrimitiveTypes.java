public class PrimitiveTypes {
    // 4 primitive types
    // 1. byte | Byte
    // 2. short | Short
    // 3. int | Integer
    // 4. long | Long

    public static void main(String[] args) {
        // Assign value with better readibility for large number
        int readableNumber = 2_147_483_647;

        // integer: 32 bits
        int minIntValue = Integer.MIN_VALUE; // -2147483648 
        int maxIntValue = Integer.MAX_VALUE; // 2147483647
        // out: Integer Value Range (-2147483648 to 2147483647)
        System.out.print("Integer Value Range (" + minIntValue + " to " + maxIntValue + ")");

        // OVERFLOW
        // out: -2147483648 because it will restarted to min value
        System.out.print(maxIntValue + 1);
        // out: -2147483647
        System.out.print(maxIntValue + 2);

        // UNDERFLOW
        // out: 2147483647 because it will restarted to max value
        System.out.print(minIntValue - 1);
        // out: 2147483646
        System.out.print(minIntValue - 2);
        
        // Error: integer number too large
        // int testMaxValue = 2147483648;
        // int testMinValue = -2147483649;

        // byte: 8 bits
        byte minByteValue = Byte.MIN_VALUE; // -128
        byte maxByteValue = Byte.MAX_VALUE; // 127

        // short: 16 bits
        short minShortValue = Short.MIN_VALUE; // -32768
        short maxShortValue = Short.MAX_VALUE; // 32767
    }
}