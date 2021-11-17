public class CustomerRunner
{
  public static void main(String[] args)
  {
     Customer c1 = new Customer ("Bob", 13);
     Customer c2 = new Customer ("Bob", 14);
     System.out.println(c1.getName());
     System.out.println(c1.getID());
     System.out.println(c1.toString());
     System.out.println(c1.compare(c2));

  }
}