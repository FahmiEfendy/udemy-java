public class Hello {

    public static void main(String[] args) {
        System.out.println("===== CONDITIONAL =====");
        boolean isTrue = false;
        if (isTrue) {
            System.out.println("Value of isTrue is TRUEEE");
        } else if (!isTrue){
            System.out.println("Value of isTrue is FALSEEE");
        }

        System.out.println("===== RACE =====");
        // Learn about AND and OR operator
        boolean isRaceOver = false;
        int currScore = 121;
        int minScore = 0;
        int maxScore = 100;

        if ((isRaceOver && currScore > minScore) || currScore > maxScore) {
            System.out.println("Race is over and your score is " + currScore);
        } else if (!isRaceOver && currScore > minScore && currScore < maxScore) {
            System.out.println("Race is still on progress and your current score is " + currScore);
        }

        System.out.println("===== TERNERY OPERATOR =====");
        int currNumber = 9_232_223;
        boolean isBigNumber = currNumber > 500;
        System.out.println("Current number is " + currNumber + " and it is a " + (isBigNumber ? "big number" : "small number"));

        System.out.println("====== OPERATOR CHALLENGE ======");
        double firstDoubleVal = 20d;
        double secondDoubleVal = 80d;
        double totalDoubleVal = (firstDoubleVal + secondDoubleVal) * 100;
        System.out.println("Total value is " + totalDoubleVal);
        double result = totalDoubleVal % 40;
        boolean isHaveRemainder = result > 0;

        if (isHaveRemainder) {
            System.out.println("You still have " + result + " left");
        } else if (!isHaveRemainder) {
            System.out.println("You have no remainder left");
        }

    }
}
