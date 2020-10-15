import java.util.*;
class Ques1{

  static double average(String arr[]) throws NullPointerException,NumberFormatException
  {
      int n=arr.length;
         double sum=0;
         double doublearr[]= new double[n];
         for(int i=0;i<n;i++)
         {
              doublearr[i] = Double.parseDouble(arr[i]); 
              sum+=doublearr[i];
         }
         return (sum/n);
  }
  public static void main(String args[]) {
      String arr[] = new String[5];
      arr[0]="1.04";
      arr[1]="2";
      arr[2]="532.93";       //if we hide this(or don't fill data in any element of array) then average function will throw NullPointerException
   // arr[3]="ram";          //if we take this element as a word(not numerical) then it will throw NumberFormatException
      arr[3]="43";
      arr[4]="0.04";
      try {
      double avg = average(arr);   
      System.out.println("average value is: " + avg); 
      }
      catch(NullPointerException e) {
        System.out.println("NullPointerException Caught: " + e);
      } 
      catch(NumberFormatException e) {
        System.out.println("NumberFormatException Caught: " + e);
      } 
   }
}
