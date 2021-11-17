import java.util.Scanner;
class Tips
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter the dinner amount (up to 2 decimal places)");
    double dinner = scan.nextDouble() * 100;
    System.out.println("Please enter the satisfaction level (1 - 3)");
    int stfn = scan.nextInt();
    double tip;

    if (stfn == 1)
    {
      System.out.println("Customer is totally satisfied.");
      tip = (int)(dinner * 0.2 + 0.5);
    }
    else if (stfn == 2)
    {
      System.out.println("Customer is satisfied.");
      tip = (int)(dinner * 0.15 + 0.5);
    }
    else
    {
      System.out.println("Customer is dissatisfied.");
      tip = (int)(dinner * 0.10 + 0.5);
    }
    
    System.out.println("Dinner amount = $" + dinner / 100);
    System.out.println("Tip amount = $" + tip / 100);
    System.out.println("Total amount = $" + (dinner + tip) / 100);
  }
}