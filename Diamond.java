
// 1. inport libary
import java.util.Scanner;

import javax.print.DocFlavor.STRING;
public class Diamond {
  public static void main(String[] args) {
    // 2. define variables
    Integer Minloop = 0;
    Integer Maxloop = 1;
    Integer Counter;
    Integer Inputnumber;
    String Result  = "*" ;
    String Resultout = "";
    Scanner scan = new Scanner(System.in);
// 3. Write program
    System.out.println("Please enter a number");
    Inputnumber = scan.nextInt();
    //Inputnumber is a variable
    if (Inputnumber > Minloop )
     for (int i = 0; i < Inputnumber; i++) 
     { 
     System.out.print(Resultout);
     // triying to get the input to Print and loop 
     System.out.println(Result);
      Resultout = Resultout.concat(Result);
     }
     //for (int t = 0; t < Inputnumber; t=-1) 
     //{ 
     //System.out.print(Resultout);
     // triying to get the input to Print and loop 
     // Change to use SubString
     //System.out.println(Result);
     // Resultout = Resultout.concat(Result);
     //}
      {
      
    }
      System.out.println("Good job please enter new input ");
    
    
    //Result = "That number is" + (Inputnumber%2 == 0 ? "even" : "odd");
  }
}
