/*
11. Array Operations
Write a program with an array that is initialized with test data. Use any primitive data type
of your choice. The program should also have the following methods:
• getTotal. This method should accept a one-dimensional array as its argument and
return the total of the values in the array.
• getAverage. This method should accept a one-dimensional array as its argument and
return the average of the values in the array.
• getHighest. This method should accept a one-dimensional array as its argument and
return the highest value in the array.
• getLowest. This method should accept a one-dimensional array as its argument and
return the lowest value in the array.
Demonstrate each of the methods in the program.
*/

import java.util.Arrays;

public class ch7q11
{
  public static void main(String[]args)
  {
    double[] input={10,20,30,40,50};
    
    System.out.println("Initialized data array:");
    System.out.println(Arrays.toString(input));
    System.out.println("The total value of the array : " + getTotal(input));
    System.out.println("The average value of the array : " + getAverage(input));
    System.out.println("The highest value of the array : " + getHighest(input));
    System.out.println("The lowest value of the array : " + getLowest(input));
  
    
  }
  
  public static double getTotal(double[] input)
  {
    double total=0;
    for(int i=0;i<input.length;i++)
    total+=input[i];
    return total;
  }
  public static double getAverage(double[] input)
  {
    double average = getTotal(input)/input.length;
    return average;
  }
  public static double getHighest(double[] input)
  {
    double highest=input[0];
    for(int i=1;i<input.length;i++)
    {
      if(input[i]>highest)
      {
        highest = input[i];
      }
    }
    return highest;
  }
  
    public static double getLowest(double[] input)
  {
    double lowest=input[0];
    for(int i=1;i<input.length;i++)
    {
      if(input[i]<lowest)
      {
        lowest = input[i];
      }
    }
    return lowest;
  }
  }

