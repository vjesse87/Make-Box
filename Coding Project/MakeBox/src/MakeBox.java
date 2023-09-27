
import java.util.Scanner;
import java.util.InputMismatchException; 

public class MakeBox {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int width = 0;
      int height = 0;
      char interior = '\0';
      char border = '\0';
      boolean needsInput = true; 
      
      while (needsInput) {
    	 try {
    		 System.out.print("Enter width    : ");
    		 width = scnr.nextInt();
    		 System.out.println(); 
    		 System.out.print("Enter height   : ");
    		 height = scnr.nextInt(); 
    		 System.out.println();
    		 System.out.print("Enter interior character: ");
    		 interior = scnr.next().charAt(0);
    		 System.out.println(); 
    		 System.out.print("Enter border character : ");
    		 border = scnr.next().charAt(0);
    		 System.out.println();
    		 needsInput = false; 
    	 }
    	 catch(InputMismatchException excpt) {
    		 System.out.println("Please enter correct value");
    		 scnr.next(); 
    	 }
     }
      makeBox(width, height, interior, border);
   } 
   
   public static void makeBox(int width, int height, char interior, char border){
      makeHeader(width, border);
      System.out.println();
      makeRows(width, height, interior, border);
      makeHeader(width, border); 
   }
   public static void makeHeader(int width, char interior){
      for(int i = 0; i < width; i++){
         System.out.print(interior);
      }
   }
   public static void makeInterior(int width, char interior,  char border){
      System.out.print(border);
      for(int i = 0; i < width -2; i++){
         System.out.print(interior);  
      }
      System.out.println(border);
   }
   public static void makeRows(int width, int height, char interior, char border){
      for(int i = 0; i < height - 2 ; i++){
      makeInterior(width, interior, border);  
      }
   }  
}
