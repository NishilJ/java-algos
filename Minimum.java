import java.util.Scanner;
class Minimum
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter 5 numbers:");
    int min = scan.nextInt(); //min starts off as num1 to shorten code
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();
    int num4 = scan.nextInt();
    int num5 = scan.nextInt();
    
    if (min > num2)
      min = num2;
  
    if (min > num3)
      min = num3;
    
    if (min > num4)
      min = num4;
    
    if (min > num5)
      min = num5;
    
    System.out.println("The minimum number is " + min + ".");
  }
}