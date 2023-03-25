/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deilverysystem;
import java.util.*;

public abstract class resturants implements Manager{
   
    
    private String restName;
    private String restType;
    private String chosenBranch;
    ArrayList <menu> allMenu = new ArrayList<menu> ();
    ArrayList <String> Branch = new ArrayList <String> ();
    menu menu2 = new menu();

    public resturants(String restName, String restType) {
        this.restName = restName;
        this.restType = restType;
    }

    public resturants() {
    }
    
    
    
    @Override
    public void add (Object o){
        menu m = (menu) o;
        allMenu.add(m);
    }
    
    @Override
    public void update(Object o , Object NewO){
        menu m = (menu) o ; menu NewMenu = (menu) NewO;
         int index = allMenu.indexOf(m);
         allMenu.set(index, NewMenu);
    }
    
  //  @Override
//    public void sort(ArrayList R){
//        ArrayList<menu> R1 = R;
//        Collections.sort(R1);
//    }
    
  
    
    public void Branches(String BName){
        Branch.add(BName);
    }
    
    public void displayBranches (){
        Scanner in = new Scanner(System.in);
        String chosenBranch = "";
         System.out.println( "          - " + restName + " -"+ "\n          - " + restType + " -");
        System.out.println("Branches : ");
        for (int i = 0; i<Branch.size(); i++){
            System.out.println(i+1 +" - "+ Branch.get(i));
        }
        System.out.println("Please choose the closest branch to you: ");
        int chosenB = in.nextInt();
        for(int i =0; i<Branch.size(); i++){
            if(chosenB == i+1){
            System.out.println("Choosen Branch is " + Branch.get(i));
                setChosenBranch(Branch.get(i));
             }
        }
    }
    
    @Override
    public void display_infor(){
        String name;
        int price = 0;
        int cal;
        System.out.println( "\n- " + restName + " -"+ "          - " + restType + " -"); // 10 space
       // System.out.println("Branch: \"" + Branch.get(Branch.indexOf(B)) + "\"" );
        System.out.println("\n************************ MENU ********************************");
        for (int i = 0; i<allMenu.size(); i++){
            System.out.println("------------------------------------------------------------");
            if (allMenu.get(i) != null){
                name = allMenu.get(i).getDishName();
                price = allMenu.get(i).getDishPrice();
                cal =allMenu.get(i).getCalories();
                System.out.print("- "+ (i+1) +" ");
                System.out.printf("%-36s%-5d%-6d-\n", name, price, cal);
            //System.out.println(i+1 + " -" + allMenu.get(i));
            }
        }
        System.out.println("------------------------------------------------------------");
       

    }
    
  
    @Override
   public void displayList(int choose, Object o, receipts price, Object m){
         Scanner input = new Scanner (System.in);
         declaringRestaurants R = (declaringRestaurants) o;
         menu dish = (menu) m;
        int yourChoose = 0;
        int size = (R.allRest[choose].allMenu.size()) + 1; 
          R.allRest[choose].display_infor();
            System.out.println("- "+(size) +" Finished ordering");
            System.out.println("------------------------------------------------------------");
            while (yourChoose != size){
                System.out.println("Choose the dish you want to order by its number: ");
                yourChoose = input.nextInt();
                System.out.println("------------------------------------------------------------");
                 if ( yourChoose == size){continue;}
                 if (R.allRest[choose] instanceof fastFood){
                   price.n =(fastFood)R.allRest[choose];
                   price.n.typeOfBread();
                   System.out.println("------------------------------------------------------------");
                   price.n.addsauce();
                   System.out.println("------------------------------------------------------------");
                   price.n.romveVegetable();
                   System.out.println("------------------------------------------------------------");
                   price.n.typeOfSoda();
                 }
                else if (R.allRest[choose] instanceof healthyFood){
                    price.h = (healthyFood)R.allRest[choose];
                    price.h.addsalad(); price.h.romveVegetable();
                }
                else if (R.allRest[choose] instanceof Cafes){
                    price.c = (Cafes)R.allRest[choose];
                    price.c.CupSiez(); price.c.typemilk(); price.c.addsugar(); price.c.addSauce(); price.c.addice(); 
                }
                 else if (R.allRest[choose] instanceof Drinks){
                     price.d = (Drinks)R.allRest[choose];
                     price.d.CupSiez(); price.d.addsuger(); price.d.addice(); price.d.FruitSalad(); 
                 }
                dish = R.allRest[choose].allMenu.get(yourChoose-1);
                price.adddish(dish);
                System.out.println("------------------------------------------------------------");
                System.out.println("              Added to cart :) ");
                System.out.println("------------------------------------------------------------");
            }
     }
   
   
   

    
    @Override
    public String toString(){
        return ("-"+restName + "  -" + restType);
    }
    
    public void setRestName(String restName){
        this.restName = restName;
    }
     public void setRestType(String restType){
        this.restType = restType;
    }
     public String getName(){
         return restName;
     }
     
     public String getType(){
         return restType;
     }
     
     public void setChosenBranch(String chosenBranch){
         this.chosenBranch = chosenBranch;
     }
     public String getChosenBranch(){
         return chosenBranch;
     }
}


