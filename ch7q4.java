import java.util.Scanner;
public class ch7q4
{
  public static void main(String[]args)
  {
  //declear variables
  String[] name = new String[12];
  int[] population = new int[12];

  //create scanner object
  Scanner s = new Scanner(System.in);
  
  //take input from user
   for(int i=0; i<12; i++)
  {
    System.out.println("Enter the name of a country:" );
    name[i]=s.nextLine();
    System.out.println("Enter the population of the country:");
    String p =s.nextLine();
    population[i] = Integer.parseInt(p);

    
    }
   //output
   for(int i=0; i<12; i++)
   {
   System.out.println( "The " + (i+1) + " country is "+ name[i] + ". The population is " + population[i]);
   } 
    

}
}
  
  
  
  
  
  
  