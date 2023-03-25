/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deilverysystem;
import java.util.ArrayList;
 /**
  * This Class is for declaring the lists of items to be in the Mini Market.  
  * @author Hadeel.
  */
   public class CreatItems {
     /**
      * Attribute of type MiniMarket to store all the items lists in the (allitems) list.
      */  
   MiniMarket allitems = new MiniMarket (); 
    
   
   /**
    * No-arg constructor. 
    */
    public CreatItems(){
        
    }
     /**
      * Method (M_Plist) to declare the list of Meat & Poultry available in our market. 
      * array of type (items) to store the name and the price of each item. 
      * for loop to add all the items in the allitems list. 
      */

    public void M_Plist(){
        items [] m = new items [9];
        m[0] =  new items ("beef -1kg-", 80);
        m[1] = new items ("lamb meat -1kg-", 70);
        m[2] = new items ("goat meat -1kg-", 75);
        m[3] = new items("beef -0.5kg-",40);
        m[4] = new items("lamb meat -0.5kg-",50);
        m[5] = new items("goat meat -0.5kg-",40);
        m[6] = new items ("Whole Chicken 8 cut",37);
        m[7] = new items ("Fresh chicken", 40);
        m[8] = new items ("Marinated chicken", 42);
        for (int i =0; i<m.length; i++){
            allitems.add(m[i]);
        }
                
    }
    
    /**
     * Method (V_FList) to declare the list of Fruits & Vegetables available in our market.
     * array of type (items) to store the name and the price of each item.
     * for loop to add all the items in the allitems list.
     */
    
    public void V_FList(){
        items [] m = new items [10];
        m[0] = new items ("Carrots -1 kg-", 9);
        m[1] = new items("Cantaloupe -2 kg-", 24);
        m[2] = new items ("Avocado -500 g-", 6);
        m[3] = new items ("Watermelon -3 kg-", 10);
        m[4] = new items ("Pomegranate -1 kg-", 20);
        m[5] = new items ("Apple -1 kg-", 11);
        m[6] = new items ("Strawberry -450 g-", 39);
        m[7] = new items ("Mango -1 kg-", 16);
        m[8] = new items ("Orang -1 kg-", 10);
        m[9] = new items ("Grape -500 g-", 12);
        
       
        for (int i =0; i<m.length; i++){
            allitems.add(m[i]);
        }   
    }
    
    /**
     *  Method (OthersList) to declare the list of other items -Daily necessities- available in our market.
     * array of type (items) to store the name and the price of each item.
     * for loop to add all the items in the allitems list.
     */
    
    public void OthersList(){
         items [] m = new items [20];
        m[0] = new items ("Tea Bags Rabea", 10);
         m[1] = new items ("Country CornFlakes Nestle", 22);
        m[2] = new items ("Goody Fusilli" , 4);
        m[3] = new items ("nutella -B-Ready- " , 10);
        m[4] = new items ("Vegetable oil Afia" ,9);
        m[5] = new items ("Nescafe Gold", 39);
        m[6] = new items ("Indomie Fries Noodles", 7);
        m[7] = new items ("Nutella -750 g-", 30);
        m[8] = new items ("Tuna Freshly", 8);
        m[9] = new items("Powder Milk saudi -2.5kg-" ,77 );
        m[10] = new items ("Abu Kass Rice -40Kg-", 237);
        m[11] = new items("Lasagna Freshly", 12);
        m[12] = new items("Quaker White Oats -500g-", 9);
        m[13] = new items("Hershey's Semi-Sweet -275g-", 19);
        m[14] = new items("AlOsra fine white sugar -5kg-", 16);
        m[15] = new items("Magnesia Mag Salt -700g-", 7);
        m[16] = new items ("Tomato Past saudia -1+7 135g-", 9);
        m[17] = new items ("KFM Flour -1kg-", 4);
        m[18] = new items ("Maggi Chicken Stock Bouillon Cube -20*28g-", 15);
        m[19] = new items ("Al Shifa Natural Honey -1kg-", 64);
     
        for(int i=0; i<m.length; i++){
            allitems.add(m[i]);
        }
    }
    

    
}



    
    
    
   
     


