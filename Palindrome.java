import java.util.Scanner;
class Palindrome
{
  public static boolean charCheck(String x)
  {
    if (!(x.equals(" ") || x.equals(",") || x.equals(".") || x.equals("?") || x.equals("!")))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter a word, phrase or sentence.");
    String in = scan.nextLine();
    String inf = "";
    String revinf = "";
    
    for (int x = 0; x <= in.length()-1; x++)
    {
      if (charCheck(in.substring(x, x+1)))
      {
        inf += in.substring(x, x+1).toLowerCase();
      }
    }
    
    for (int x = inf.length(); x >= 1; x--)
    {
      revinf += inf.substring(x-1, x);
    }
  
    if (inf.equals(revinf))
    {
      System.out.println("\"" + in + "\" is a palindrome.");
    }
    else
    {
      System.out.println("\"" + in + "\" is not a palindrome.");
    }
  }
}