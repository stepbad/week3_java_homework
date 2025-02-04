import java.util.Scanner;

public class TestBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompting for department selection
        System.out.println("Enter department (1 for Sales, 2 for Units Sold, 3 for Part Assembly): ");
        int department = scanner.nextInt();
        
        double bonus = 0;

        switch (department) {
            case 1:
                // Sales department
                System.out.println("Enter total sales amount:");
                double sales = scanner.nextDouble();
                bonus = Bonus.getBonus(sales);
                break;
            case 2:
                // Units sold department
                System.out.println("Enter number of units sold:");
                int units = scanner.nextInt();
                bonus = Bonus.getBonus(units);
                break;
            case 3:
                // Parts assembly department
                System.out.println("Enter number of pieces completed:");
                int pieces = scanner.nextInt();
                System.out.println("Enter employment type (1 for Full-time, 2 for Part-time):");
                int empType = scanner.nextInt();
                boolean isFullTime = (empType == 1);
                bonus = Bonus.getBonus(pieces, isFullTime);
                break;
            default:
                System.out.println("Invalid department entered. No bonus calculation performed.");
                break;
        }

        if (department >= 1 && department <= 3) {
            System.out.printf("Calculated Bonus: $%.2f\n", bonus);
        }
        
        scanner.close();
    }
}
