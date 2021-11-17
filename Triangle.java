import java.util.Scanner;
import java.lang.Math;
class Triangle
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter the x and y coordinates of point 1 (separated by space)");
    double x1 = scan.nextDouble();
    double y1 = scan.nextDouble();
    System.out.println("Please enter the x and y coordinates of point 2 (separated by space)");
    double x2 = scan.nextDouble();
    double y2 = scan.nextDouble();
    System.out.println("Please enter the x and y coordinates of point 3 (separated by space)");
    double x3 = scan.nextDouble();
    double y3 = scan.nextDouble();
  
    double d12 = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)); //Distance from point 1 to 2
    double d13 = Math.sqrt(Math.pow(x3-x1,2) + Math.pow(y3-y1,2)); //Distance from point 1 to 3
    double d23 = Math.sqrt(Math.pow(x3-x2,2) + Math.pow(y3-y2,2)); //Distance from point 2 to 3
    
    //Rounded to nearest hundredth
    d12 = Math.round(d12 * 100.0) / 100.0;
    d13 = Math.round(d13 * 100.0) / 100.0;
    d23 = Math.round(d23 * 100.0) / 100.0;
    
    if (( d12 == d13) && (d12 == d23)) 
    {
      System.out.println("This is an equilateral triangle.");
    }  
    else if ((d12 == d13) || (d12 == d23) || (d13 == d23))
    {
      System.out.println("This is an isosceles triangle.");
    }
    else
    {
      System.out.println("This is a scalene triangle.");
    }
  }
}
    