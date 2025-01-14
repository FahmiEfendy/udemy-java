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

        // long: 64 bits
        long minLongValue = Long.MIN_VALUE; // -9223372036854775808
        long maxLongValue = Long.MAX_VALUE; // 9223372036854775807

        // Need to add suffix "L" define long value
        long longValue = 2_147_483_647_032L;

        // Declaring variable in one line
        // Same data type
        byte firstByteValue = -128, secondByteValue = -127;
        // Differnet data type
        short firstShortValue = -32768; int firstIntegerValue = -2147483648;

        // CASTING
        // Error: incompatible types: possible lossy conversion from int to byte
        byte testValue = (minByteValue / 2); // -128 / 2
        // Solution:
        byte testValue = (byte) (minByteValue / 2); // -128 / 2

        // CHALLENGE
        byte byteValue = 5;
        short shortValue = 10;
        int intValue = 15;
        long longValue = 50_000L + 10 * ( byteValue + shortValue + intValue );

        // COMPOUND ASSIGNMENT OPERATOR CHALLENGE
        int result = 10;
        result -= 5;
        System.out.print("Result: " + result);
    }
}