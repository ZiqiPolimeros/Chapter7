import java.util.Scanner;

public class ch7q5
{
  public static void main(String[]args)
  {
  //Declare variables;
  int[] employees = new int[10];
  double[] weeklyPay = new double[10];
  
  Scanner s = new Scanner(System.in);
  
  for(int i=0; i<10; i++)
  {
    System.out.println("Enter the " +(i+1) +" employee ID :");
    employees[i] = s.nextInt();
    System.out.println("Enter the weekly gross pay:");
    weeklyPay[i] = s.nextDouble();
    }
    
    for(int i=0; i<10;i++)
    {
      System.out.println(" The " +(i+1) + " employee :" + employees[i] + ". The weekly gross pay: $" +weeklyPay[i]);
      }
      }
      }