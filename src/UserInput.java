import java.util.Scanner;

public class UserInput {
    // Declare Scanner object publicly
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        GetUserData();
    }
    public static void GetUserData(){
        try {
            System.out.print("Enter the amount of a purchase: ");
            double purchaseAmount = input.nextDouble();
            taxes(purchaseAmount);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void taxes(double purchases){
        TaxCalculator taxCalculator = new TaxCalculator(purchases);
        System.out.printf("Purchases: $%.2f%n",  purchases);
        System.out.printf("State Sales Tax: $%.2f%n", taxCalculator.calculateStateSalesTax());
        System.out.printf("County Sales Tax: $%.2f%n", taxCalculator.calculateCountySalesTax());
        System.out.printf("Total Sales Tax: $%.2f%n", taxCalculator.totalSaleTax());
        System.out.printf("Total Sales: $%.2f%n",taxCalculator.totalSales());
    }
}
