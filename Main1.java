import java.util.*;
public class average {

    double avg(String[] a) throws NullPointerException , NumberFormatException{
        double Ans = 0.0;
        int n= a.length;
        double ar[] = new double[n];
        for(int i=0;i<a.length;i++){
            ar[i] = Double.parseDouble(a[i]);
        }
        for(int i=0;i<n;i++){
            Ans = Ans+ ar[i];
        }
        return Ans/n;
    }


    public static void main(String[] args) {
        String[] s = new String[] {"9.6","12.8"}; 
        average ob = new average();
        try{
            double lastAns = ob.avg(s);
            System.out.println(lastAns);
        }catch(NullPointerException e){
            System.out.println("NullPointerException");
        }catch(NumberFormatException e){
            System.out.println("NumberFormatException");
        }
        
        
    }
}