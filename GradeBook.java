/*
8. Grade Book
A teacher has five students who have taken four tests. The teacher uses the following grading
scale to assign a letter grade to a student, based on the average of his or her four test scores:
Test Score Letter Grade
90–100 A
80–89 B
70–79 C
60–69 D
0–59 F
Write a class that uses a String array or an ArrayList object to hold the five students’ names,
an array of five characters to hold the five students’ letter grades, and five arrays of four
doubles each to hold each student’s set of test scores. The class should have methods that
return a specific student’s name, the average test score, and a letter grade based on the average.
Demonstrate the class in a program that allows the user to enter each student’s name and his
or her four test scores. It should then display each student’s average test score and letter grade.
Input Validation: Do not accept test scores less than zero or greater than 100.
*/

import java.util.*;
//Class definition
class GradeBook
{
   //Private instance variables
   private String[] names = new String[5];
   private char[] grades = new char[5];
   private double[][] scores = new double[5][4];
  
   //Constructor
   public GradeBook(String[] tnames, double[][] tscores)
   {
       int i, j;     
       
       for(i=0; i<5; i++)
       {
           names[i] = tnames[i];
       }
      
       for(i=0; i<5; i++)
       { 
           for(j=0; j<4; j++)
           {
              
               scores[i][j] = tscores[i][j];
           }
       }
   }
     
   public String getName(int index)
   {
       return names[index];
   }
  
   public double getAvgScore(int index)
   {
       double sum=0;
      
       for(int i=0; i<4; i++)
       {
           sum = sum + scores[index][i];
       }
      
       return (sum/4.0);
   }
  
   public char getGrade(double avg)
   {
       if(avg >= 90)
       {
           return 'A';
       }

       else if(avg > 80 && avg < 90)
       {
           return 'B';
       }

       else if(avg > 70 && avg < 79)
       {
           return 'C';
       }

       else if(avg > 60 && avg < 69)
       {
           return 'D';
       }

       else
       {
           return 'F';
       }
   }
}
