package core;

import java.util.Scanner;


public class staticvariable {
    String name;
    int  roll;
    static String college="AVIT";
    public static void main(String args[])
    {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter the no of candidate, you want to submit");
        int no=keyboard.nextInt();
        staticvariable[] objt=new staticvariable[no];
        
        
        
       for(int i=0; i<objt.length; i++){
            objt[i] = new staticvariable();
        }
       
       for(int j=0; j<objt.length; j++)
       {
          System.out.println("Enter the name:");
          objt[j].name=keyboard.next();
          System.out.println("Enter the roll no:");
          objt[j].roll=keyboard.nextInt();
      
      
       }
       
       for(int k=0;k<objt.length; k++)
       {
           System.out.println(objt[k].name);
           System.out.println(objt[k].roll);
       }
       
       
        
        
    }

   

    
}
