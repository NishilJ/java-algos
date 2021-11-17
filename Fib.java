import java.util.Scanner;
class Fib
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    int num1 = -1;
    int num2 = 1;
    int count  = 0;
    
    while (count <= 44)
    {
      int sum = num1 + num2;
      num1 = num2;
      num2 = sum;
      System.out.print(sum + " ");
      
      count++;
      if (count % 5 == 0)
      {
        System.out.println("");
      }
    }  
  }
}