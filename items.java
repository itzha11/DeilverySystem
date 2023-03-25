/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deilverysystem;
import java.util.*;
/**
 * Class items, to control adding and modifying items to the Mini Market.
 * @author Hadeel.
 */
public class items {
    
    /**
     * Attribute named itemName of type string to naming the items.
     */
    private String itemName;
    
    /**
     * Attribute named itemPrice of type int to setting the prices of the items.
     */
    private int itemPrice ;
    
    
    /**
     * No-arg constructor.
     */
    public items (){
        
    }

    /**
     * Parameterized Constructor. 
     * @param itemName of type String, to assign the name of the item.
     * @param itemPrice of type int, to assign the price of the item.
     */
    public items(String itemName, int itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    /*
    ------------------------------------------------------------------------------------
    --------------------GETTER METHODS--------------------------------------------------
    ------------------------------------------------------------------------------------
    */
    
    /**
     * Method aims to return the item name.
     * @return the value of the itemName attribute. 
     */
    public String getItemName() {
        return itemName;
    }
   /**
   * Method aims to return the item price.
   * @return the value of the itemPrice attribute. 
   */
    public int getItemPrice() {
        return itemPrice;
    }
  


    /*
    ------------------------------------------------------------------------------------
    --------------------SETTER METHODS--------------------------------------------------
    ------------------------------------------------------------------------------------
    */

    /**
     * Method to sets/updates the value of the attribute itemName.
     * @param itemName of type String. The method takes the itemName parameter and assign it to the attribute.
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * Method to sets/updates the value of the attribute itemPrice.
     * @param itemPrice of type int. The method takes the itemPrice parameter and assign it to the attribute.
     */
    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * Method override the method in Object class, aims to display a string representation of an object. 
     * @return String representation of the item. (display its name, and its price).
     */
    @Override
    public String toString() {
        return ( "Name : " + itemName + ", Price:" + itemPrice);
    }
    
    
   
     
}

