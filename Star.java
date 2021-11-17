import java.util.Scanner;
class Star
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter a number less than 20.");
    int num = scan.nextInt();
    
    for (int x = 1; x <= num; x++)
    {
      for (int y = 1; y <= x; y++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}