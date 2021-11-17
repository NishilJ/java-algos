import java.util.Scanner;
class Maximum
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter an integer (enter 666 to stop):");
    
    int max = 0;
    int inp = 0;
    while (inp != 666)
    {
     inp = scan.nextInt();
     if (inp > max && inp != 666)
     {
      max = inp; 
     }
    }
    
    System.out.println("The maximum number is " + max + ".");  
  }
}