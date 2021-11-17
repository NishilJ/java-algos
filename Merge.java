import java.util.Scanner;
import java.util.ArrayList;

public class Merge
{  
  public static void inputArr (String name, ArrayList<Integer> arr)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter the values for the " + name + " array, up to 10 values. (Enter a negative number to quit.)");
    while (arr.size() < 10)
    {
      int val = scan.nextInt();
      if (val < 0)
      {
        break;
      }
      arr.add(val);
    }
    
    for (int x = 1; x < arr.size(); x++)
    {
      if (arr.get(x) < arr.get(x - 1))
      {
        System.out.println("ERROR: Array not in correct order");
        System.exit(0);
      }
    }
  }
  
  public static void printArr (String name, ArrayList<Integer> arr)
  {
    System.out.print(name + " Array: ");
    for (int x = 0; x < arr.size(); x++)
    {
      System.out.print(arr.get(x) + " ");
    }
    System.out.println();
  }
  
  public static void main (String [] args)
  {
    ArrayList<Integer> arr1 = new ArrayList<Integer>();
    ArrayList<Integer> arr2 = new ArrayList<Integer>();
    ArrayList<Integer> arrM = new ArrayList<Integer>();
    
    inputArr("first", arr1);
    inputArr("second", arr2);
    
    int count = 0;
    for (int x = 0; x < arr1.size(); x++)
    {      
      while ((count != arr2.size()) && (arr2.get(count) < arr1.get(x)))
      {
        arrM.add(arr2.get(count));
        count++;
      }
      arrM.add(arr1.get(x));
    }
    
    for (int x = count; x < arr2.size(); x++)
    {
      arrM.add(arr2.get(x));
    }
   
    printArr("First", arr1);
    printArr("Second", arr2);
    printArr("Merged", arrM);
  }
}