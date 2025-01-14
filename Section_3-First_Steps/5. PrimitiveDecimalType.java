public class PrimitiveDecimalType {
    // double is better than float

    public static void main(String[] args) {
         
        float minFloatValue = Float.MIN_VALUE; // 1.4E-45
        float maxFloatValue = Float.MAX_VALUE; // 3.4028235E38

        double minDoubleValue = Double.MIN_VALUE; // 4.9E-324
        double maxDoubleValue = Double.MAX_VALUE; // 1.7976931348623157E308

        // Need to add suffix "D" define double value
        double doubleValue = 1.2323232323D;

        // Error: incompatible types: possible lossy conversion from double to float
        float invalidTypeValue = 5.25;
        // Solution: 
        float correctTypeValue = 5.25F;
        float correctTypeValue = (float) 5.25;

        // CHALLENGE
        double poundsValue = 200;
        double poundsToKgValue = poundsValue * 0.45359237;
        System.out.println("Pounds to Kg >>> " + poundsToKgValue);
    }
}