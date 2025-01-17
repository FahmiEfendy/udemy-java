public class ChallengeMethodOverloading {
    // 1 inch = 2.54 cm
    // 1 ft = 12 inch

    public static void main(String[] args) {
        convertToCentimeters(5, 8);
        convertToCentimeters(5, 11);

    }

    public static double convertToCentimeters(int inches) {
        double inchToCm = 2.54d;

        return inches * inchToCm;
    }

    public static void convertToCentimeters(int feet, int inches) {
        int ftToInch = 12;

        double result = convertToCentimeters(feet * ftToInch + inches);

        System.out.println(feet + " ft " + inches + " inch = " + result + " cm");
    }
}
