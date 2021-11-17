public class APLine 
{
  private int a;
  private int b;
  private int c;
    
  public APLine (int parA, int parB, int parC)
  {
    if (parA == 0)
      a = 1;
    else
      a = parA;
    if (parB == 0)
      b = 1;
    else
      b = parB;
    c = parC;
  }
  
  public double getSlope ()
  {
    return (double) -a/b;
  }
  
  public boolean isOnLine(int x, int y)
  {
    if ((a*x + b*y + c) == 0)
      return true;
    else
      return false;
  } 
}