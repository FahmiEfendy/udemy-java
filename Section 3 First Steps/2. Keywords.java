public class Keywords {

    public static void main(String[] args) {
        // Create new variable called 'number' with data types 'int' and assign a value
        int number = 5;
        // Print number, out: 5
        System.out.print(number);

        // Gives new value to variable 'number', without need to define the data types
        number = 10;
        // Print number, out: 10
        System.out.print(number);

        // Gives new value that can be calculated
        number = 10 + 5;
        // Print number, out: 15
        System.out.print(number);

        // Print from 1 to 1000
        int i = 1;
        int maxNumber = 1000;
        while (i <= maxNumber) {
            System.out.println("Count >>> " + i);
            i++;
        }

    }
    
}