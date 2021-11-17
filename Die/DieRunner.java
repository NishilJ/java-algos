public class DieRunner
{
  public static int throw20 (Die x)
  {
    int num = 0;
    for (int count = 1; count <= 20; count++)
    {
      if (x.throwDie() == 6)
      {
        num++;
      }
    }
    return num;
  }
  
  public static void main(String[] args)
  {
    Die fDie = new Die("fDie", "fair");
    Die bDie = new Die("bDie", "bias");
    
    System.out.println("Fair\tBias");
    for (int x = 1; x <= 5; x++)
    {
      System.out.println(throw20(fDie) + "\t" + throw20(bDie));
    }
  }
}
