/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deilverysystem;
import java.util.*;
public class fastFood extends resturants { 

 Scanner input = new Scanner (System.in);
 
 String sauce ;
 
 String bread;
 
 String soda;
 
 String romveVegetable ;

    public fastFood(String restName, String restType) {
        super(restName, restType);
    }
 
 

    public fastFood() {
    }
 
 

    public fastFood( String sauce, String bread, String soda) {
        this.sauce = sauce;
        this.bread = bread;
        this.soda = soda;
    }
  
 public void typeOfBread(){
     System.out.println("Which bread you prefer? ");
     System.out.println("-White bread      -Brown breaf");
     this.bread = input.nextLine(); 
 }

 
 public void addsauce(){
     System.out.println("Which sauce do you want? ");
     System.out.println("-Ketchup      -Mayonnaise");
     this.sauce = input.nextLine(); 
 }
 
  public void romveVegetable(){
      System.out.println("Without: ");
      System.out.println("-Tomatoes    -Onions    -Pickle    -Mayonnaise    -Cheese");
      this.romveVegetable = input.nextLine();  
    }
  
  
  public void typeOfSoda(){
      System.out.print("write your favorite drink: ");
      this.soda = input.next();
  }
 
  
 @Override
 public String toString (){
    return( "With " + this.bread + " ,"+ this.sauce +" ," + this.soda + " and without " + this.romveVegetable);
 }
 
  }
    
    
    
    
    
    
    
    
    
    


    
    
    
    
    
    
    
    
    
    




