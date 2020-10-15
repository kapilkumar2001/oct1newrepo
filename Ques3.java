import java.util.*;
import java.io.*;
class Ques3{
 
    public static void main(String args[]) 
    { 
        if(args.length!=1)
        {
             System.out.println("Usage Ques3 fully quilifies name of class");
        }
        try {
            Class cls = Class.forName(args[0]);
            int count=0;
            while(cls.getSuperclass()!=null)
            {
                 cls = cls.getSuperclass();
                 count++;
            }
            System.out.println("count is: "+count);
        }
        catch(ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: "+e);
        }
    } 
}
