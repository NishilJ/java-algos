public class Die
{
    private String dieName;
    private String bias;  // "fair" or "bias"
    private int outcome;
  
    //  Constructor.
    // initialize private variables.
    public Die (String pDieName, String pBias)
    {
      dieName = pDieName;
      bias = pBias;
    }
  
    //  Throw the die.
    //  For a fair die, the chance of getting any number is the same.
    //  For a bias die, a six happens twice as frequent as the other numbers.
    public int throwDie ()
    {
      if (bias.equals("fair"))
      {
        outcome = (int)(Math.random() * 6 + 1);
      }
      else
      {
        outcome = (int)(Math.random() * 7 + 1);
        if (outcome == 7)
          outcome = 6;
      }
      return outcome;
    }
    
    
    //  Print format:
    //  Die <dieName> gives a <outcome>.
    public String toString()
    {      return ("Die " + dieName + " gives a " + outcome);  }
}
