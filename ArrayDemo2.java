import java.util.Scanner;

public class ArrayDemo2
{
  public static void main(String[]args)
  {
  //Declare variables and assign value to each element of array
  final int employees =50;
  int[] hours= new int[employees];
  
  Scanner s = new Scanner(System.in);
  
  System.out.println("Enter the hours worked by" + employees + "employees.");
  
  //assign 1 through 50 to the array
  
   for(int i=0;i<employees;i++)
   {
   // System.out.print("Employee" +(i+1)+":");
   // hours[i] = s.nextInt();
   //   while(hours[i]<1 || hours[i]>20){
   //   System.out.println("Please enter a number that is greater than 1 and less then 20");
   //   System.out.print("Employee" +(i+1)+":");
      hours[i] = i+1;
      }   
    
    
    //output values of array
    System.out.println("The hours you entered are:");
  
    for(int i=0; i<employees; i++)
    {
    System.out.println(hours[i]);
    }
    }
    }