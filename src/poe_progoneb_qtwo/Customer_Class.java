/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe_progoneb_qtwo;

import java.util.Scanner;
import static poe_progoneb_qtwo.POE_ProgOneB_Qtwo.VariantItems;

/**
 *
 * @author dinal
 */
public class Customer_Class {
    
   protected static int milk_amount;
   protected static int milk_choice;
   protected static int milk_LLM = 30;
   protected static int milk_FC = 35;
   protected static int milk_total;
   protected static  int bread_choice;
   protected static int bread_amount;
   protected static int bread_brown = 15;
   protected static int bread_white = 18;
   protected static int bread_total;    
   protected static int wine_choice;
   protected static int wine_amount;
   protected static int wine_red = 105;
   protected static int wine_white = 95;
   protected static int wine_total;   
   protected static int meat_choice;
   protected static int meat_amount;
   protected static int meat_pork = 150;
   protected static int meat_beef = 180;
   protected static int meat_total; 
   public static Scanner scanner = new Scanner(System.in);
   public static int optionItem;
   public static int switchChoice;
   
   public static void customerclass()
    {
//____________________________________________________________________________________________________________welcome        
        System.out.println("Welcome to the customer self checkout services");
        System.out.println("\n");
        System.out.println("****************************************************************");
//____________________________________________________________________________________________________________menu       
    
while(true)
      {
        
        System.out.println("\nPlease enter which items you are purchasing "
        + "\nNote that you will be required to enter one item at a time by entering the given digit");
       System.out.println("\n****************************************************************");
        
        System.out.println("\n Are you purcahsing:"
        + "\n 1--> milk"
        + "\n 2--> bread "
        + "\n 3 --> wine "
        + "\n 4--> meat "
        + "\n");
         optionItem =  scanner.nextInt();
         
         switch(optionItem)
          {
              case 1: Customer_Class.milk();
                       break;
              case 2: Customer_Class.bread();
                       break;        
              case 3: Customer_Class.wine();
                       break;        
              case 4: Customer_Class. meat();
                       break;
         }//end of switch case
         
//____________________________________________________________________________________________________________menu2         
          System.out.println("\nWill you continue shopping or would you now like your receipt \n"
          + "enter: 1 --> to continue shopping \n"
                  + "       2 --> to recieve receipt");
          System.out.println("****************************************************************\n");
          switchChoice = scanner.nextInt();
          
          switch(switchChoice)
          {
              case 1: continue; 
              case 2: Menu_Class. receipts();break;   
          }//end of switch 
         
        }//end of while 
    }//end of customer class

//____________________________________________________________________________________________________________milk()
    
         public static void milk()
         {

          System.out.println("\n Which type of milk are you purchasing" 
             + "\n 1 --> Long Life Milk"
             + "\n 2 --> Full Milk");
             milk_choice = scanner.nextInt();
             
             System.out.println("How much are you purchasing: ");
             milk_amount = scanner.nextInt();
          
             if(milk_choice == 1)
             {
               milk_choice = milk_LLM;
               milk_total = milk_amount * milk_choice;       
               
             }//end of if 
             else{
                 milk_choice = milk_FC;
                 milk_total = milk_amount * milk_choice;
             }
            System.out.println("****************************************************************");
         }//end of milk()
         
//____________________________________________________________________________________________________________bread()
         
    private static void bread()
    {
         Scanner scanner = new Scanner(System.in);   
          
          System.out.println("\n Which type of bread are you purchasing" 
             + "\n 1 --> Brown Bread"
             + "\n 2 --> White bread");
             bread_choice = scanner.nextInt();
             
             
             System.out.println("How much are you purchasing: ");
             bread_amount = scanner.nextInt();
          
             if(bread_choice == 1)
             {
               bread_choice = bread_brown;
               bread_total =   bread_amount * bread_choice;       
               
             }//end of if 
             else
             {
                 bread_choice = bread_white;
                 bread_total = bread_amount * bread_choice;
             }
            System.out.println("****************************************************************");
          
    }//end of bread
//____________________________________________________________________________________________________________wine()
    private static void wine() 
    {   
          
          System.out.println("\n Which type of wine are you purchasing" 
             + "\n 1 --> Red Wine"
             + "\n 2 --> Wine White");
             wine_choice = scanner.nextInt();
             
             
             System.out.println("How much are you purchasing: ");
             wine_amount = scanner.nextInt();
          
             if(wine_choice == 1)
             {
               wine_choice = wine_red;
               wine_total = wine_amount * wine_choice;       
               
             }//end of if 
             else{
                 wine_choice = wine_white;
                 wine_total = wine_amount * wine_choice;
             }
            System.out.println("****************************************************************");
             
    }//end of wine()
    
//____________________________________________________________________________________________________________meat()
    
    private static void meat() 
    {
      Scanner scanner = new Scanner(System.in);   
          
          System.out.println("\nWhich type of meat are you purchasing" 
             + "\n 1 --> pork "
             + "\n 2 --> beef ");        
             meat_choice = scanner.nextInt();
             
             
             System.out.println("How much are you purchasing: ");
             meat_amount = scanner.nextInt();
          
             if(meat_choice == 1)
             {
                 
               meat_choice = meat_pork;
               meat_total = meat_amount * meat_choice;       
               
             }//end of if 
             else{
                 meat_choice = meat_beef;
                 meat_total = meat_amount * meat_choice;
             }//end of else 
            System.out.println("****************************************************************");
             
    }//end of meat()
   
//

public static void Suggestions()
     {
         String varItem;
         System.out.println("\nplease name the item you would like to be suggested: ");
         varItem = scanner.nextLine();
         VariantItems.add(varItem);

     }    

    public static int getMilk_total() {
        return milk_total;
    }

    public static int getBread_total() {
        return bread_total;
    }

    public static int getWine_total() {
        return wine_total;
    }

    public static int getMeat_total() {
        return meat_total;
    }

}
