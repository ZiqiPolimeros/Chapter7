
import java.util.Scanner;
public class StudentGradeAverage
{
   //Main method
   public static void main(String args[])
   {
       //Arrays to hold values
       String[] names = new String[5];
       double[][] scores = new double[5][4];
      
       int i,j;
      
      
       Scanner reader = new Scanner(System.in);
      
     
       for(i=0; i<5; i++)
       {  
           System.out.print("\n\n Enter student name: ");
           names[i] = reader.nextLine();

           System.out.print("\n Enter four scores of " + names[i] + ": ");

           for(j=0; j<4; j++)
           {

               scores[i][j] = reader.nextDouble();

               while(scores[i][j] < 0 || scores[i][j] > 100)
               {
                   System.out.print("\n\n Invalid Score... Re-enter: ");
                   scores[i][j] = reader.nextDouble();
               }
           }

           reader.nextLine();
       }

       GradeBook studentsObj = new GradeBook(names, scores);

       System.out.printf("\n\n %-10s %-10s %-10s \n", "Name", "Average", "Grade");
 
       double avg;

       for(i=0; i<5; i++)
       {

           avg = studentsObj.getAvgScore(i);

           System.out.printf("\n %-10s %-10.2f %-10c ", studentsObj.getName(i), avg, studentsObj.getGrade(avg));
       }  
      
       System.out.println("\n\n");
   }
}