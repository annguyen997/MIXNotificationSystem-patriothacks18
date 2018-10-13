import java.io.*;
import java.util.Scanner;
import java.util.Iterator;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;

public class Mix
{
 private static Worker[] staff;
 
 public Mix()
 {
  Staff();
 }
 
 
 @SuppressWarnings("unchecked")
 public static void Staff()
  {
   File workerFile = new File("staff.txt");
     Scanner workerScan = null;
       
     try 
     {
      workerScan = new Scanner(workerFile);  
     }
     catch (IOException ex) 
     {
      // Report
     } 
     finally
     {
      int numWorkers = Integer.parseInt(workerScan.nextLine());
      staff = new Worker[numWorkers];
      
        for(int i = 0; i < numWorkers; i++)
        {
          String str, name, position;
          int number;
        
          str = workerScan.nextLine();
          if(str.length() > 6 && str.substring(0,5).equals("Name:"))
          {
             name = str.substring(6);
          }
        
          str = workerScan.nextLine();
          if(str.length() > 7 && str.substring(0,6).equals("Number:"))
          {
             number = Integer.parseInt(str.substring(7));
          }
        
          str = workerScan.nextLine();
          if(str.length() > 10 && str.substring(0,9).equals("Position:"))
          {
             position = str.substring(10);
          }
          
          Worker worker = new Worker(name, number, position);
          staff[i] = worker;
     
          workerScan.nextLine();
          str = workerScan.nextLine();
        }
     }
 } 
}