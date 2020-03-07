import java.util.Scanner;

public class ch7q1;

{
  public static void main(String[]args)
  {
  int[] references = new int[20];
  Scanner s = new Scanner();
  
  for(int i=0; i<20; i++)
  {
    System.out.println("Enter the " +(i+1) +" number:");
    references[i]= s.nextInt;
    }
    
    for(int i=0; i<20;i++)
    {
      System.out.println(" References " +(i+1) + " :" + references[i]
      }