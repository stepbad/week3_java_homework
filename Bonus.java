import java.util.Scanner;

public class Bonus {
    // Constants for calculations
    public final static int UNITS_PT = 250;
    public final static int UNITS_FT = 700;
    public final static double SALES_BONUS = 5000.0;
    public final static double SALES_BONUS_RATE = 0.05;
    public final static double SALES_UNIT_REG = 20.0;
    public final static double SALES_UNIT_EXTRA = 10.0;
    public final static int SALES_UNIT_BONUS = 25;
    public final static double PARTS_BONUS = 0.1;

    // Main method to run the program
    public static void main(String[] args) {
        Scanner keysIn = new Scanner(System.in);
        System.out.println("Enter department: ");
        int dept = keysIn.nextInt();
        double bonus = 0;

        switch (dept) {
            case 1:
                System.out.print("Enter sales: ");
                double sales = keysIn.nextDouble();
                bonus = getBonus(sales);
                break;
            case 2:
                System.out.print("Enter number of units sold: ");
                int numUnits = keysIn.nextInt();
                bonus = getBonus(numUnits);
                break;
            case 3:
                System.out.print("Enter # of pieces completed: ");
                int pieces = keysIn.nextInt();
                System.out.print("Full-time (1) or Part-Time (2)? ");
                int empType = keysIn.nextInt();
                boolean isFullTime = (empType == 1);
                bonus = getBonus(pieces, isFullTime);
                break;
            default:
                System.out.println("Error! Invalid department.");
                break;
        }
        System.out.printf("Bonus Amount: $%.2f%n", bonus);
        keysIn.close();
    }

    // Overloaded method for sales-based bonus
    public static double getBonus(double sales) {
        return sales > SALES_BONUS ? sales * SALES_BONUS_RATE : 0;
    }

    // Overloaded method for units sold bonus
    public static double getBonus(int numUnits) {
        if (numUnits == 0) return 0;
        return (numUnits >= SALES_UNIT_BONUS) ?
               numUnits * (SALES_UNIT_REG + SALES_UNIT_EXTRA) :
               numUnits * SALES_UNIT_REG;
    }

    // Overloaded method for parts completed bonus, taking into account full-time or part-time
    public static double getBonus(int pieces, boolean isFullTime) {
        int bonusLimit = isFullTime ? UNITS_FT : UNITS_PT;
        return pieces > bonusLimit ? pieces * PARTS_BONUS : 0;
    }
}
