/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deilverysystem;

public class menu {
   private String dishName;
    private int dishPrice ;
    private int calories;
    
    public menu(){
        
    }
    public menu (String name, int price, int cal){
        this.dishName = name;
        this.dishPrice = price;
        this.calories = cal;
        
    }
    /*
    ------------------------------------------------------------------------------------
    --------------------SETTER METHODS--------------------------------------------------
    ------------------------------------------------------------------------------------
    */
    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public void setDishPrice(int dishPrice) {
        this.dishPrice = dishPrice;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    
    /*
    ------------------------------------------------------------------------------------
    --------------------GETTER METHODS--------------------------------------------------
    ------------------------------------------------------------------------------------
    */

    public String getDishName() {
        return dishName;
    }

    public int getDishPrice() {
        return dishPrice;
    }

    public int getCalories() {
        return calories;
    }

   

    @Override
    public String toString() {
        return ( dishName + "     - " + dishPrice + "SR     - " + calories + "Kcal" ); // 5 space
    }
    
}
