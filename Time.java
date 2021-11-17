import java.util.Scanner;
class Time
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter the number of seconds.");
    int num = scan.nextInt();
    int rnum = num;
    int weeknum = rnum / 604800;
    rnum %= 604800;
    int daynum = rnum / 86400;
    rnum %= 86400;
    int hournum = rnum / 3600;
    rnum %= 3600;
    int minnum = rnum / 60;
    int secnum = rnum % 60;
                  
    System.out.print(num + " seconds = " + weeknum + " weeks " + daynum + " days " + hournum + " hours " + minnum + " minutes and " + secnum + " seconds");
  }
}