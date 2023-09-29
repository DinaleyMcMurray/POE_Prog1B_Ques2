/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe_progoneb_qtwo;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dinal
 */
public class POE_ProgOneB_Qtwo {

   
    public static Scanner scanner = new Scanner(System.in);
    public static int userInput;
    public static int userInput2;
    public static ArrayList<String> VariantItems = new ArrayList<>();

    public static void main(String[] args) {
        
        /*
        this program is a self check out program 
        
        as for the self check out option
        customers are prompted to enter how much of each item was bought and at the end the customer will 
        have a reciept drawn up for them 
        
        in the beginning of this program the customer is given the opportunity to add suggested items 
        that they want to be made available to them, these items will be stored in an array  
        */

    //____________________________________________________________________________________________________________welocme()    

         System.out.println("____________________________________________________________________");
         System.out.println("Welcome to the MIKHAIL CONSUMERS' program");
         System.out.println("____________________________________________________________________");
         
         while(true){
         
         System.out.println( "Please state whether you would like to shop or suggest items to be added to our store"
         + "\nDo this by entering 1 OR 2 OR 3"
         + "\n1 --> you want to close this program "
         + "\n2 --> you would like to shop "
         + "\n3 --> you would like to suggest items to be added to our store");
         userInput = scanner.nextInt();
         
          switch(userInput)
          {
              case 1:   System.out.println("\nYou will now bw exiting the program..."); System.exit(0);

              case 2: Customer_Class.customerclass();
                  break; 
                  
              case 3: Customer_Class.Suggestions(); break;  
          }//end of switch 
        
   
         }//end of while loop 
    }//end of main
    }
    

