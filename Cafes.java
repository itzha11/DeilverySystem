/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deilverysystem;

import java.util.*;
    
   public class Cafes extends resturants {
 Scanner input = new Scanner(System.in);
String CupSiez ;            
boolean Ice;    
boolean Sugar = false;
String MilkType ;
String Sauce ;


    public Cafes() {
    }

    public Cafes(String restName, String restType) {
        super(restName, restType);
    }



    public Cafes(String CupSiez, boolean Sugar, String MilkType, String Sauce) {
        this.CupSiez = CupSiez;
        this.Sugar = Sugar;
        this.MilkType = MilkType;
        this.Sauce = Sauce;
    }


  public void addsugar(){
      System.out.println("Do you prefer to add more sugar? ");
      String addsugar = input.nextLine();
    int compare = addsugar.compareToIgnoreCase("yes"); 
    if (compare == 0){
        Sugar = true;
    }
    }

  public void addice(){
     System.out.println("Do you want to add more ice ?");
     String ice = input.nextLine();
     int compare = ice.compareToIgnoreCase("yes");
     if (compare == 0){       
        this.Ice= true;
     }
       
    } 

   public void typemilk(){
       System.out.println("Which type of milk you prefer? ");
       System.out.println("-Full fat milk      -Skimmed milk      -Soya milk     -Almond milk      -Coconut milk");
       MilkType = input.nextLine();
   }
  
   
  public void addSauce(){
      System.out.println("Which sauce do you want?");
      System.out.println("Choose one please: ");
      System.out.println("- Caramel      -Chocolate      -White Chocolate      -Salt Caramel      -non");
      Sauce = input.nextLine();
  }
  
   
    
 public void CupSiez(){
    System.out.println("Which cup size do you want? ");
    System.out.println("- small     -medium     -large");
    CupSiez = input.nextLine(); 
    }

 public void displayAddition (){
    
    System.out.print(this.CupSiez + " cup  - " + this.MilkType + "  with " + this.Sauce + "  ");
    if (this.Ice == true){
        System.out.print("extra ice  ");
    }
    if (this.Sugar == true){
        System.out.println("extra sugar  ");
    }
    } // metod
 
    } // class
    
     
   
 



