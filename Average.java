import java.util.Scanner;
class Average 
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter your test grades.");
    System.out.print("Test 1 >");
    int test1 = scan.nextInt();
    System.out.print("Test 2 >");
    int test2 = scan.nextInt();
    
    System.out.println("Please enter your quiz grades.");
    System.out.print("Quiz 1 >");
    int quiz1 = scan.nextInt();
    System.out.print("Quiz 2 >");
    int quiz2 = scan.nextInt();
    System.out.print("Quiz 3 >");
    int quiz3 = scan.nextInt();
    
    System.out.println("Please enter your homework average.");
    System.out.print("Homework >");
    double hw = scan.nextDouble();
    
    double testavg = (double)(test1 + test2)/2;
    double quizavg = (double)(quiz1 + quiz2 + quiz3)/3;
    double finalg = (testavg * 0.5) + (quizavg * 0.3) + (hw * 0.2);
    System.out.println("Test Average: " + testavg);
    System.out.println("Quiz Average: " + quizavg);
    System.out.print("Final Grade: " + finalg);
    
  }
}