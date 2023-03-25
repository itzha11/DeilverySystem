/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deilverysystem;
import java.util.*;
public class healthyFood extends resturants {
  Scanner input = new Scanner(System.in);
  
  String romveVegetable;
  
  String salads;
  
  
  public healthyFood() {
    }

    public healthyFood(String restName, String restType) {
        super(restName, restType);
    }
  
    
  
 public void romveVegetable(){
     System.out.println("Without: ");
      System.out.println("-Tomatoes    -Onions    -Pickle    -Mayonnaise    -Cheese");
      this.romveVegetable = input.nextLine();
  }
  
  
public void addsalad(){
    System.out.println("Do you wanna salad with you meal? ");
    this.salads = input.next(); int compare = salads.compareToIgnoreCase("yes");
    if (compare == 0){
        salads = "with salad";
    }
    else
        salads = "without salad";
        
    }

  @Override
  public String toString (){
    return( "-With " + this.salads+ "  and without" + this.romveVegetable);
 }

}
