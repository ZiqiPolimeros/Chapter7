import java.util.Scanner;

public class payRollTest
{
  public static void main(String[] args)
  { 
  //variables
    int hours;
    double payRate;
    double wages;
    int employeeID;
  
  //create new payroll, scanner object.   
    System.out.println("Payroll Application");
    Payroll payroll=new Payroll();
    Scanner kb = new Scanner(System.in);
  
  //loop repeats for 7 employees  
    for(int i=0; i<7; i++)
    {
      System.out.println("Employee :" +(i+1));
      do
      {  
        System.out.println("Enter working hours:");
        hours = Integer.parseInt(kb.nextLine());
        }
       while(hours<0);
       payroll.setHours(i, hours);
       do
       {
         System.out.print("Enter pay Rate: ");
         payRate = Double.parseDouble(kb.nextLine());
         }
       while(payRate<6);
       payroll.setPayRate(i,payRate);
       employeeID = payroll.getEmployeeID(i);
       wages = payroll.calculateGrossPay(employeeID);
       payroll.setWages(i, wages);
     }
     
     //display
     for(int i=0;i<7;i++)
     {
       System.out.println( "  Employee ID:"+ payroll.getEmployeeID(i));
       System.out.println("Gross Wages: "+ payroll.getWages(i));
     }
     }
     }
  
  