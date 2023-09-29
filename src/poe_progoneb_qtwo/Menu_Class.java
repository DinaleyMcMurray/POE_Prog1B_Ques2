/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe_progoneb_qtwo;

import static poe_progoneb_qtwo.POE_ProgOneB_Qtwo.VariantItems;

public class Menu_Class extends Customer_Class{
     public static void receipts()
    {
        System.out.println("THANK YOU FOR YOUR PURCHASE !!!" );
        
        System.out.println("\nHere is your receipt:"
        + "\nMilk " + milk_amount 
        + "\ncost: " + milk_total);
        
         System.out.println( "\nBread " + bread_amount 
        + "\ncost: " + bread_total);
         
          System.out.println( "\nWine " + wine_amount 
        + "\ncost: " + wine_total);
          
           System.out.println( "\nMeat " + meat_amount 
        + "\ncost: " + meat_total);
       
           
            for (int i = 0; i < VariantItems.size(); i++) {
           System.out.println("here are the suggestions you made to be added while you shopped: " + VariantItems.get(i));
            }//end of for loop
    }//end receipts()
    
}
