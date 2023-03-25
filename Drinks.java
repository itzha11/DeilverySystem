/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deilverysystem;
import java.util.*;
public class Drinks extends resturants {
Scanner input = new Scanner (System.in);
String CupSiez ;             
boolean Sugar ;
boolean ice = false ;
boolean FruitSalad = false ;

String yourDrink ;

     public Drinks() {
    }

    public Drinks(String restName, String restType) {
        super(restName, restType);
    }
   
    public Drinks(String CupSiez ) {
        this.CupSiez = CupSiez;
        
 
    }

  public void addsuger(){
      System.out.println("Do you wanna more sugar? ");
    int compare = (input.next()).compareToIgnoreCase("yes");
    if (compare == 0){
        Sugar = true;
    }  
    }
    
   
 public void CupSiez(){
     System.out.println("Which cup size do you want? ");
     System.out.println("- small     -medium     -large");
     CupSiez = input.next(); 
 }
  
 public void addice(){
     System.out.println("Do you want to add more ice ?");
     String ice = input.next();
     int compare = ice.compareToIgnoreCase("yes");
     if (compare == 0){       
        this.ice= true;
     }
       
    } 
    
public void FruitSalad(){
    System.out.println("Do you want a fruit in your juice? ");
    String fruit = input.next();
    int compare = fruit.compareToIgnoreCase("yes");
    if (compare == 0){
        this.FruitSalad = true;
    }
    } 

public void displayAddition (){

    System.out.print(this.CupSiez +" cup  " + " ");
    if (this.ice == true){
        System.out.print("-extra ice  ");
    }
    if (this.Sugar == true){
        System.out.print("-extra sugar  ");
    }
    if (FruitSalad == true){
        System.out.println("-with fruits");
    }
}
  
}
