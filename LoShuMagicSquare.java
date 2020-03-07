/*
19. Lo Shu Magic Square
The Lo Shu Magic Square is a grid with 3 rows and 3 columns, shown in Figure 7-31. The
Lo Shu Magic Square has the following properties:
• The grid contains the numbers 1 through 9 exactly.
• The sum of each row, each column, and each diagonal all add up to the same number.
This is shown in Figure 7-32.
In a program you can simulate a magic square using a two-dimensional array. Write a
method that accepts a two-dimensional array as an argument, and determines whether the
array is a Lo Shu Magic Square. Test the function in a program.
*/



public class LoShuMagicSquare
{


  public static void main(String[]args)
  {
    //array of magic sqare
    int[][] magic={{4,9,2},{3,5,7},{8,1,6}};
    for(int row=0; row<magic.length;row++)
    {
      for(int col=0;col<magic.length;col++)
      {
         System.out.printf("%-2d",magic[row][col]);
      }
      System.out.println();
    }
    System.out.println("Magic Square: "+isMagicSquare(magic));
    
    int[][] nonmagic={{4,9,2},{3,7,5},{8,1,6}}; 
    for(int row=0; row<magic.length;row++)
    {
      for(int col=0;col<magic.length;col++)
      {
          System.out.printf("%-2d",magic[row][col]);
      }
         System.out.println();
    }
    System.out.println("Magic Square: "+isMagicSquare(nonmagic));
    
  }



public static boolean isMagicSquare(int[][] arr)
{
//local variables
  boolean valid=false;
  int row1sum=0;
  int row2sum=0;
  int row3sum=0;
  int col1sum=0;
  int col2sum=0;
  int col3sum=0;
 
 //calculate the sum of rows 
  for(int row=0;row<arr.length;row++)
  {
   row1sum+=arr[0][row];
  }
   for(int row=0;row<arr.length;row++)
  {
   row2sum+=arr[1][row];
  }
    for(int row=0;row<arr.length;row++)
  {
   row3sum+=arr[2][row];
  } 
  
  //calculate the sum of columns
  for(int col=0; col<arr.length; col++)
  {
   col1sum+=arr[col][0];
  }
    for(int col=0; col<arr.length; col++)
  {
   col2sum+=arr[col][1];
  }
    for(int col=0; col<arr.length; col++)
  {
   col3sum+=arr[col][2];
  }
  
  // sum of diagonals
  int leftDiagonalSum= arr[0][0]+arr[1][1]+arr[2][2];
  int rightDiagonalSum= arr[0][2]+arr[1][1]+arr[2][0];
  
  if((row1sum==row2sum)&&(row2sum==row3sum)
  &&(row3sum==row1sum)&&(col1sum==col2sum)
  &&(col2sum==col3sum)&&(col3sum==col1sum)
  &&(leftDiagonalSum==rightDiagonalSum)
  &&(row1sum==col1sum)&&(row1sum==leftDiagonalSum))
  valid=true;
  
  return valid;
  
  
}
}