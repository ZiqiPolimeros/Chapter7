import java.util.Scanner;
public class DriverExamDemo
{
public static void main(String[] args)
{
  String answer;
  String[] userAnswers = new String[20];
  Scanner scanner = new Scanner(System.in);
  
  System.out.println("Please enter 20 answers (A/B/C/D) for the multiple choice questions:");
  for(int i=0;i<20;i++)
  {
    do
    {
     System.out.print("Answer # "+(i+1)+":");
     answer=scanner.nextLine();
     }
    while(!answer.equalsIgnoreCase("A")&&!answer.equalsIgnoreCase("B")&&!answer.equalsIgnoreCase("C")&&!answer.equalsIgnoreCase("D"));
    userAnswers[i]=answer;
    }
    
//create an object for DriverExam class
  DriverExam driverExam = new DriverExam(userAnswers);
  
//disply
  System.out.println("Results:");
  System.out.println("Number of correct answers: " + driverExam.totalCorrect());
  System.out.println("Number of incorrect answers: " + driverExam.totalIncorrect());
  if(driverExam.passed())
  {
  System.out.println("You has PASSED the driver exam.");
  }else{
  System.out.println("You has FAILED the driver exam.");
  }
  //questionsMissed()
  int[] missed = new int[driverExam.totalIncorrect()];
  missed=driverExam.questionsMissed();
  
  System.out.println("Missed question:");
  for(int i=0;i<driverExam.totalIncorrect();i++)
     {
      System.out.println(missed[i]);
     }
  }
  }
  
  