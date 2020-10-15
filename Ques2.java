import java.util.*;

class RangeException extends Exception {
  private double data;
  RangeException(double a){
     data = a;
  }
  public String toString() {
    return "RangeException: "+data+" is greater then 1 or small than 0";
  }
}

class Ques2{

  static double findsum(String arr[]) throws RangeException
  {
         int n=arr.length;
         double sum=0;
         double doublearr[]= new double[n];
         for(int i=0;i<n;i++)
         {
              doublearr[i] = Double.parseDouble(arr[i]); 
              if(doublearr[i]>1 || doublearr[i]<0)
                  throw new RangeException(doublearr[i]);
              sum+=doublearr[i];
         }
         return sum;
  }
  public static void main(String args[]) {

      String arr[] = new String[5];
      arr[0]="0.04";
      arr[1]="0.87";
      arr[2]="0.93";
   // arr[2]="543.3";        //if this data is greater than 1 or small than 0 then findsum function will throw RangeException
   // arr[3]="ram";          //if we take this element as a word(not numerical) then it will throw NumberFormatException
      arr[3]="1";
      arr[4]="0";

      try {
      double sum = findsum(arr);   
      System.out.println("sum of array is: " + sum); 
      }
      catch (RangeException e) {
         System.out.println("RangeException Caught: " + e);
      }
      catch(NumberFormatException e) {
         System.out.println("NumberFormatException Caught: " + e);
      } 
      finally {
         System.out.println("Thank you for using this program:)");
      }
  }
}
