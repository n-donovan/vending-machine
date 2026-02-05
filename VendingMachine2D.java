import java.util.*;
import java.util.Scanner;
public class VendingMachine2D
{
   public static void main(String[] args)
   {  
   
           
      String[] [] snacks = { {"Takis", "Doritos", "Cheetos", "Lay's"},
                             {"Snickers", "Milky Way", "Starburst", "M&M's"},    
                             {"Chex Mix", "Sour Patch Kids", "Skittles", "Twix"},
                             {"Cheez-It", "Mint Gum", "Nutter Butter", "Reese's"} };
                             
      for(int i = 0; i < snacks.length; i++)
      {
         System.out.println();
         for(int x = 0; x < snacks.length; x++)
         {
            System.out.println(snacks[i][x]);
         }
      }
      
      String[] rows = {"A", "B", "C", "D"}; 
      double[] prices = {1.50, 1.25, 1.00, 0.75};
      String row; 
      int column;
      double price = 0;
      int number = 0; 
      String snackChoice = "";
      
      
   
      
      Scanner input = new Scanner(System.in); 
      System.out.println("\nPlease enter the row letter of the item you wish to purchase (A, B, C, or D):"); 
      row = input.nextLine(); 
      System.out.println("Please enter the columm number of the item you wish to purchase (0, 1, 2, or 3):"); 
      column = input.nextInt(); 
      
      number = Arrays.binarySearch(rows, row);
      snackChoice = snacks[number][column]; 
      price = prices[number]; 
      

      
       System.out.println("The row you selected is row " + row);
       System.out.println("The column you selected is column " + column);
       System.out.println("The item you have chosen is " + snackChoice);
       System.out.println("The price is " + price );
      
   }
}