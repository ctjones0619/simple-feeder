import java.util.Scanner;
public class feeder
{

   public static void main(String [] args){
  //create scanner object
   Scanner scanner = new Scanner(System.in);
   
  
  
   //display initial messages
   System.out.println("Hello. My name is Zach. I am hungry.");
   System.out.println("Will you feed me?");
   System.out.println("Please enter y or n");
   
   //collect the user input
   String response = scanner.next(); 
   
   //check response
   if (response.equals("y")) {
   System.out.println("I NEED TO CONSUME MORE!! MORE !! MOREEEE!!!!");
   } else if (response.equals("n")){
   System.out.println("But im very very hungry :(");
   }else {
   System.out.println("I do not understand. Please eneter 'y' or 'n' ");
   }
   
  
   
   }
   
   
   
}
   
   
