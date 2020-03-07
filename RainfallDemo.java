

import java.util.Scanner;
import java.text.DecimalFormat;

public class RainfallDemo {
 
  public static void main (String[]args)
  {
    //Declare variables  
    double total;
    double average;
    double mostRainfall;
    double leastRainfall;
    String mostMonth;
    String leastMonth;
    
    //create a new rainfall object
    Rainfall r = new Rainfall(11,12,13,14,15,16,17,18,19,10,11,12);
       
    total = r.getTotal();
    average = r.getAverage();
    mostRainfall = r.getMostRainfall();
    leastRainfall = r.getLeastRainfall();
   // mostMonth = r.getMost();
   // leastMonth = r.getLeast();
    
    DecimalFormat decimal = new DecimalFormat("0.00") ; 
    System.out.println( "The total rainfall in the year :" + decimal.format(total));
    System.out.println( "The average rainfall in the year :" + decimal.format(average));
    System.out.println( "The month with the most rain: "  + " The rainfall is " + decimal.format(mostRainfall));
    System.out.println( "The month with the least rain: "  + " The rainfall is " + decimal.format(leastRainfall));
    
  }
  }
    


    
