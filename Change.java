import java.util.Scanner;
class Change
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please Enter the Cost of the Item:");
    double cost = scan.nextDouble();
    System.out.println("Please Enter the Amount Paid:");
    double paid = scan.nextDouble();
    
    double change = ((paid * 100) - (cost * 100)) / 100;
    double rchange = change;
    int quarters = (int)(rchange / 0.25);
    rchange %= 0.25;
    int dimes = (int)(rchange / 0.10);
    rchange %= 0.10;
    int nickels = (int)(rchange / 0.05);
    rchange %= 0.05;
    int pennies = (int)(rchange / 0.01 + 0.1);
    
    System.out.println("Change Owed: " + change); 
    System.out.println("Quarters: " + quarters);
    System.out.println("Dimes: " + dimes);
    System.out.println("Nickels: " + nickels);
    System.out.println("Pennies: " + pennies);
  }
}
