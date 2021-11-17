import java.util.Scanner;

public class HiddenWord 
{
  private String word;
  public HiddenWord (String w)
  {
    word = w;
  }
  
  public String getHint (String guess)
  {
    String hint = "";
    loop1: for (int x = 0; x < word.length(); x++)
    {
      if (guess.substring(x,x+1).equals(word.substring(x,x+1)))
      {
        hint += word.substring(x,x+1);
        continue;
      }
      for (int y = 0; y < word.length(); y++)
      {
        if (guess.substring(x,x+1).equals(word.substring(y,y+1)))
        {
          hint += "+";
          continue loop1;
        }
      }
      hint += "*";
    }
    return hint;
  }
  
  public static void main (String [] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a 5 letter word.");
    String in1 = scan.nextLine();
    HiddenWord puzzle = new HiddenWord(in1);
    System.out.println("Enter Guesses");
    String in2 = "";
    while (!(in1.equals(in2)))
    {
      in2 = scan.nextLine();
      System.out.println(puzzle.getHint(in2));
    }
    System.out.println("Yes, you got it.");
  }
}
