/*
13. Name Search
If you have downloaded this book’s source code (the companion Web site is available

at www.pearsonhighered.com/gaddis), you will find the following files in the Chap-
ter 07 folder:

• GirlNames.txt – This file contains a list of the 200 most popular names given to girls
born in the United States for the years 2000 through 2009.
• BoyNames.txt – This file contains a list of the 200 most popular names given to boys
born in the United States for the years 2000 through 2009.
Write a program that reads the contents of the two files into two separate arrays, or
ArrayLists. The user should be able to enter a boy’s name, a girl’s name, or both, and
the application will display messages indicating whether the names were among the
most popular.
*/

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NameSearch
{
  public static void main(String[] args) throws IOException
  {
  //create ArrayList
    ArrayList<String> boys = new ArrayList<String>();
    ArrayList<String> girls = new ArrayList<String>();
    Scanner keyboard = new Scanner(System.in);
  
  //declare variables  
    String boyName = "";
    String girlName = "";
    boolean isPopularBoy = false;
    boolean isPopularGirl = false;
    int choice;
    
    boys = readNames("BoyNames.txt");
    girls = readNames("GirlNames.txt");
    
    System.out.println("Enter your choice:\n"+
                        "1. Search for boy\n"+
                        "2. Search for girl\n"+
                        "3. Search for both");
    choice = keyboard.nextInt();
    
    if(choice == 1 || choice == 3)
    {
      System.out.println("Enter the name of a boy: ");
      boyName = keyboard.nextLine();
      isPopularBoy = boys.contains(boyName);
    }
    
    if(choice == 2 || choice ==3)
    {
      System.out.println("Enter the name of a girl: ");
      girlName = keyboard.nextLine();
      isPopularBoy = girls.contains(girlName);        
    }
     System.out.println(); 
     
    //display     
    if(isPopularBoy)
    {
      System.out.println(" "+ boyName + " is the most popular name in boys.");
     }
     if((choice ==1 || choice == 3)&&!isPopularBoy)
     {
       System.out.println(" "+ boyName + " is NOT the most popular name in boys.");    
     }
     
     if(isPopularGirl)
    {
      System.out.println(" "+ girlName + " is the most popular name in girls.");
     }
     if((choice ==2 || choice == 3)&&!isPopularGirl)
     {
       System.out.println(" "+ girlName + " is NOT the most popular name in girls.");
     }
     

      
      //end of read file method
  }
   //end of main method    
   
   
   public static ArrayList<String> readNames(String fileName) throws IOException
   {
        //create an object for ArrayList
        ArrayList<String> names = new ArrayList<String>();
        Scanner infile =new Scanner(new File(fileName));
        String name;
        
        while(infile.hasNextLine())
        {
          name = infile.nextLine();
          names.add(name);
        }
        
        infile.close();
        
        return names;
     }  
        
}