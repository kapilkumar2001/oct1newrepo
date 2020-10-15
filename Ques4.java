import java.util.*;
import java.io.*;
class Ques4{
 
    static int fibonacci(int n) 
    { 
        int fib[] = new int[n+2]; 
        int i; 
        fib[0] = 0; 
        fib[1] = 1; 
        for(i=2;i<=n;i++) 
        { 
            fib[i]=fib[i-1]+fib[i-2]; 
        } 
        return fib[n]; 
    } 
  
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);


        //create a file
        try {
        File myObj = new File("201951079_fib.txt");
              if (myObj.createNewFile()) {
                 System.out.println("File created: " + myObj.getName());
              } 
              else {
                 System.out.println("File already exists.");
              }         
        }
        catch (IOException e) {
             System.out.println("An error occurred.");
             e.printStackTrace();
        }
    
        System.out.println("what is your choice ?? ");
       System.out.println("press 1 : write first n fibonacci numbers in file ");
        System.out.println("press 2 : read the file");
       int choice = sc.nextInt();
       switch(choice) {

            case 1: 
                  //write in file
                 try {
                     System.out.print("Enter value of n: ");
                     int n= sc.nextInt();
                     FileWriter myWriter = new FileWriter("201951079_fib.txt");
                     myWriter.write("first "+n+" number of bibonacci series: ");
                     for (int i=0;i<n;i++) 
                     {
                           myWriter.write(fibonacci(i));
                     }
                     myWriter.close();
                     System.out.println("Successfully wrote to the file.");
                 }
                 catch (IOException e) {
                         System.out.println("An error occurred.");
                         e.printStackTrace();
                 }
                 break;


            case 2:
                //read a file
                try {
                    File myObj = new File("201951079_fib.txt");
                    Scanner myReader = new Scanner(myObj);
                    while (myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        System.out.println(data);
                    }
                    myReader.close();
                } 
                catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
                break;
 

             default : 
                     System.out.println("Invalid choice");
                      break; 

          }

    } 
}
