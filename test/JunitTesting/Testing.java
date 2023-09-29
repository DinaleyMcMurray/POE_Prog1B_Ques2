/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JunitTesting;

import org.junit.Test;
import poe_progoneb_qtwo.POE_ProgOneB_Qtwo;

/**
 *
 * @author dinal
 */
public class Testing {
POE_ProgOneB_Qtwo poe = new POE_ProgOneB_Qtwo();   
    
//POE_Activity2 poe = new POE_Activity2(); 
    @Test
    public void testMilk(){
        
        int milk_cost_FC = 35;
        int milk_amount = 4;
        int milk_total = 140;
        milk_total = milk_cost_FC * milk_total;
        
        int milk_cost_LLM = 30;
        int milk_Total=120 ;
        milk_Total = milk_cost_LLM * milk_amount;
        
    }//end of testMilk()

    @Test 
    public void testBread(){
        
        int bread_cost_BB = 15;
        int bread_amount = 4;
        int bread_total = 60;
         bread_total = bread_cost_BB * bread_amount;
        
        int bread_cost_WB = 18;
        int bread_Total = 72;
        bread_Total = bread_cost_WB * bread_amount;
        
    }//end of testBread()
    
    @Test 
    public void testWine(){
        
        int wine_red = 105;
        int wine_white = 95;
        
        int wine_Total = 630;
        int wine_total = 570;
        int wine_amount = 6;
    }//end of testWine() 
    
    @Test 
    public void testMeat(){
        
        int meat_pork = 150;
        int meat_beef = 180;
        
        int meat_amount = 8;
        int meat_total = 1200;
        meat_total = meat_pork * meat_amount;
        
        int meat_Total= 1440;
        meat_Total = meat_beef * meat_amount;
        
    }//end of testMeat()
}
