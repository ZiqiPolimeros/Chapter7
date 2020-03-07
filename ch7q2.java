import java.util.Scanner;
public class ch7q2
{
  public static void main(String[]args)
  {
  //declear variables
  double[] numberArray1 = new double[100];
  double[] numberArray2 = new double[100];
  
  Scanner s = new Scanner(System.in);
  
   for(int i=0; i<100; i++)
  {
    System.out.println("Enter the " +(i+1) +" number:");
    numberArray1[i] = s.nextInt();
    }
    
    for(int i=0; i<100;i++)
    {
     numberArray2[i]=numberArray1[i]; 
     System.out.println(numberArray2[i]);
}
}
}
  
  
  
  
  
  
  