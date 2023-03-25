/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deilverysystem;
import java.util.*;
/**
 * This Class implements Manager interface to be the responsible for the controlling the Market in our application.
 * @author Hadeel. 
 */
public class MiniMarket implements Manager{
    /**
     * Set the name of the market to be 'Mini Market '.
     */
  String MarketName = "Mini Market";
  
   /**
    * ArrayList of type (items) to store the list of all the items available in the market.  
    */
    ArrayList <items> allItems = new ArrayList <items> () ;
    /**
     * Object of type (items).
     */
    items I = new items();
  
    /**
     *  No-arg constructor. 
     */
   public MiniMarket(){
       
   }
    
   /**
    * Implements (add) method in Manager interface. u 
    * @param o of type Object, which will be casting to (items) to be added in the all items list.  
    */
   @Override
    public void add(Object o){
        items It = ((items)o);
         allItems.add(It);  
    }
    
    /**
     * Implements (update) method in Manager interface. and it aims to update an object in the list of all items.
     * @param o of type Object, which will be casting to (items) to store the object to be updated from the list of all items.
     * @param newO of type Object, which will be casting to (items). it is the updated object which will replace the old object in the list.  
     */
   @Override
    public void update(Object o, Object newO){
       items i = (items) o; 
       items newItems = (items) newO;
          int index = allItems.indexOf(i);
          allItems.set(index, newItems);
    
    }

    
    /**
     * implements (display_infor) in Manager interface, which display the information about the market, and the list of items available in it.  
     */
   @Override
    public void display_infor(){
        System.out.println(MarketName + "  ");
        System.out.println("-------------------------Items List-----------------------------------");
        for(int i=0; i<allItems.size(); i++){
            if(allItems.get(i) != null){
                System.out.println(i+1 + " - " + allItems.get(i));
            }
        }
    }
    
    /**
     * implements (displayList) method in Manager interface, which aims to display the List of the items available to buy from the market.  
     * @param choose of type int, which will be re-assign to 0 to store the chosen Items from the user in it.Mn
     * @param o of type Object, which will be casting to (CreateItems) to get the list of items in class (CreatItems)
     * @param price of type receipts, to be added in it the list of all items chosen, to display the price.
     * @param m  of type Object, which will be casting to (items), to add the chosen items to it.
     */
  @Override
    public void displayList(int choose, Object o, receipts price, Object m){
        Scanner input = new Scanner (System.in);
        CreatItems I = (CreatItems) o;
        items list = (items) m;
         choose = 0;
        int size = (I.allitems.allItems.size() +1);
                System.out.println((size) +" - Finished ordering");
            while (choose != size){
                System.out.println("Choose the item you want to order by its number: ");
                choose = input.nextInt();
                 if ( choose == size){continue;}
                list = I.allitems.allItems.get(choose-1);
                price.addItems(list);
                System.out.println("Added to cart :) ");
            }
     }

    
   
    
}
 


    
   
    

 

