import java.io.*;
import java.util.*;
class RangeException extends Exception{
    private int detail;
    
    RangeException(int a){
        detail = a;
    }
    
    public String toString(){
        if(a>1)
        {
            return "RangeException because" + detail + "is greater than 1";
            
        }
        else
        return "RangeException because" + detail + "is less than 0";
    }
}
public class Main
{
    static double add(String[] str,10) throws NumberFormatException, RangeException
    {
        Scanner sc = new Scanner(System.in);
	    try{
	        for(int i=0;i<10;i++)
	    	{
		        str[i] = sc.nextLine();
		    }
            double[] strtodouble;
            strtodouble = new double[10];
            for(int i=0;i<10;i++)
            {
                 double strtodouble[i] = Double.parseDouble(str);
                 if(strtodouble[i] > 1 || strtodouble[i])
                 throw new RangeException(strtodouble[i]);
            }
	    } finally{
	        System.out.println("Thanku");
	    }
        double sum=0;
        for(int i=0;i<10;i++)
        {
            sum += strtodouble[i];
        }
        return sum;
    }
	public static void main(String[] args) {
		String[] str;
		str = new String[10];
		try{
		    double sum = sum(str);
		} catch (NumberFormatException n){
	        System.out.println("Number format exception occured" + n);
	    } catch (RangeException e) {
	        System.out.println("null pointer exception occured");
	        System.out.println(e);
	    }
	   
	   System.out.println(Average);
		
	}
}