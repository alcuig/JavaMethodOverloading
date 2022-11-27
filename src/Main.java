public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(100);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no score");
        return 0;
    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) && (inches > 12)) {
            System.out.println("Invalid feet or inches parameters.");
            return -1;
        }
        double inchesTotal = (feet * 12) + inches;
        double centimetres = inchesTotal * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimetres + " cm");
        return centimetres;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + "inches is equal to " + feet + " feet " + inches + " inches" );
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

}
// call the other overloaded method passing the correct feet and inches
// calculated so that it can calculate correctly.
// hints: Use double for your number datatypes is probably a good idea
// 1 inch = 2.54cm  and one foot = 12 inches
// use the link I give you to confirm your code is calculating correctly.
// Calling another overloaded method just requires you to use the
// right number of parameters.