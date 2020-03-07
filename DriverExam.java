/*
6. Driver’s License Exam
The local Driver’s License Office has asked you to write a program that grades the written
portion of the driver’s license exam. The exam has 20 multiple choice questions. Here are
the correct answers:
1. B
2. D
3. A
4. A
5. C
The Charge
Account
Validation
Problem
VideoNote

6. A
7. B
8. A
9. C
10. D

11. B
12. C
13. D
14. A
15. D

16. C
17. C
18. B
19. D
20. A
A student must correctly answer 15 of the 20 questions to pass the exam.
Write a class named DriverExam that holds the correct answers to the exam in an array field.
The class should also have an array field that holds the student’s answers. The class should
have the following methods:
• passed. Returns true if the student passed the exam, or false if the student failed
• totalCorrect. Returns the total number of correctly answered questions

490 Chapter 7 Arrays and the ArrayList Class

• totalIncorrect. Returns the total number of incorrectly answered questions
• questionsMissed. An int array containing the question numbers of the questions that
the student missed
Demonstrate the class in a complete program that asks the user to enter a student’s answers,
and then displays the results returned from the DriverExam class’s methods.
Input Validation: Only accept the letters A, B, C, or D as answers.
*/


public class DriverExam
{
//fields
private String[] correctAnswers={"B","D","A","A","C",  "A","B","A","C","D",  "B","C","D","A","D",  "C","C","B","D","A"};
private String[] studentAnswers = new String[20];

public DriverExam(String[] answers)
{
 for(int i=0; i<correctAnswers.length; i++)
 studentAnswers[i]=answers[i];
}

public boolean passed()
{ 
  //local variable
  boolean pass=false;
  
  if(totalCorrect()>=15)
  {
  pass=true;
  }
  return pass;
}

public int totalCorrect()
{
  //local variable
  int correct=0;
  for(int i=0;i<correctAnswers.length;i++)
  {
   if(correctAnswers[i].equals(studentAnswers[i]))
   {
    correct++;
   }
  }
  return correct;
  }

public int totalIncorrect()
{
  int incorrect=0;
  for(int i=0;i<correctAnswers.length;i++)
  {
   if(!correctAnswers[i].equals(studentAnswers[i]))
   {
    incorrect++;
   }
  }
  return incorrect;
  
}

public int[] questionsMissed()
{
  int[] missed=new int[totalIncorrect()];
  for(int i=0,j=0;i<correctAnswers.length;i++)
  {
   if(!studentAnswers[i].equalsIgnoreCase(correctAnswers[i]))
   {
    missed[j]=(i+1);
    j++;
   }
  }
  return missed;
  
}
}

