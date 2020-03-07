public class Rainfall
{
//fields
private double[] rain;

//methods

  public Rainfall(double[] r)
  {
    
    rain = new double[r.length];
    for(int i=0;i<r.length;i++)
    rain[i]=r[i];
    }
    
  public double getTotalRainFall()
  {
    double total = 0;
    for(int i = 0; i<rain.length; i++)
    total += rain[i];
    return total;
  }
  
   public double getTotal()
  {
    //local variable
     double total =0.0;
  
     for(int i=0;i<12;i++)
     {
     total += rain[i];
     }
     return total;
  }
  
  public double getAverage()
  {
    double average = 0.0;
    average = getTotal()/12;
  
    return  average;
  }
  
 /* public String getMost()
  {
    double most=rain[0];
    int month = 0;
    
    for(int i=1;i<11;i++)
    {
      if(rain[i]>most)
      {
        most = rain[i];
        month = i;
        }
     }
    return monthString[month];
  }
  */
  
  public double getMostRainfall()
  {
    double most=rain[0];
    int month = 0;
    
    for(int i=1;i<11;i++)
    {
      if(rain[i]>most)
      {
        most = rain[i];
        month = i;
        }
     }
    return most;
  }
  
 /* public String getLeast()
  {
    double least=rain[0];
    int month = 0;
    
    for(int i=1;i<11;i++)
    {
      if(rain[i]<least)
      {
        least = rain[i];
        month = i;
        }
  }
     return monthString[month];
 }
 */
   public double getLeastRainfall()
  {
    double least=rain[0];
    int month = 0;
    
    for(int i=1;i<11;i++)
    {
      if(rain[i]<least)
      {
        least = rain[i];
        month = i;
        }
  }
     return least;
 }
 
 }

