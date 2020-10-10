import java.util.*;
import java.io.*;
class Main{
 
    public static void main(String args[]) 
    { 
        if(args.length!=1)
        {
             System.out.println("Name of class");
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