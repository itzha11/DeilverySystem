/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deilverysystem;
import java.util.*;
import javax.swing.*;

public class declaringRestaurants {
   
    resturants [] allRest = new resturants[12];
    int count = 0;
    Drinks SG = new Drinks ("Signature", "Juice Shop"); //1
    fastFood Mc = new fastFood("McDonalds", "Fast Food");//2
    healthyFood Boga = new healthyFood ("BOGA", "Healthy Food");//3
    Cafes sB = new Cafes("StarBucks", "Cafe");//4
    fastFood Mp = new fastFood("Meastro pizza","Fast Food" );//5
    Drinks DD = new Drinks("Dankin Donuts","Drinks");//6
    healthyFood Ro = new healthyFood("Roots", "Healthy Food");//7
    Cafes TH = new Cafes ("Tim Hortons", "Cafe and Bake shop");//8
    fastFood BK = new fastFood("burger King", "Fast Food");//9
    fastFood baik = new fastFood("ALBAIK","Fast Food" );//10
    fastFood He = new fastFood("herfy", "fastFood");//11
    
    public void McDonalds (){
        Mc.Branches("Al-Aziza");
        Mc.Branches("AL-SHOQIYAH");
        Mc.Branches("AL-AWALI");
        menu [] m = new menu[13];
        m[0] = new menu ("Grand Chicken Special Meal", 35, 1713);
        m[1] = new menu ("Grand Chicken Spicy Meal", 33, 1561);
        m[2] = new menu ("Grand Chicken Deluxe Meal", 33, 1541);
        m[3] = new menu ("Grand Chicken Classic Meal", 31, 1708);
        m[4] = new menu ("Big Tasty Meal", 31, 1513);
        m[5] = new menu ("Mc Chiclen Meal",  25, 1099);
        m[6] = new menu ("9 Pcs Chicken Mc Nuggets Meal", 27, 1058);
        m[7] = new menu ("9 Pcs Chicken Mc Nuggets", 21, 379);
        m[8] = new menu ("Mc Arabic Chicken Meal", 27, 1215);
        m[9] = new menu ("Chicken Caesar Salad", 28, 190);
        m[10] = new menu ("Fries", 12, 679);
        m[11] = new menu ("Happy Meal Chicken Burger", 19, 740);
        m[12] = new menu ("Happy Meal Chicken Nuggets", 19, 300);
        for (int i =0; i<m.length; i++){
            Mc.add(m[i]);
        }
//        Mc.sort(Mc.allMenu);
          allRest[count] = Mc;
          count++;
        
    }
    public void Baik (){ // salwa
        baik.Branches("Al-Shoqiyah");
        baik.Branches("Al-Azizia");
        baik.Branches("Al zahir");
        menu [] m = new menu[15];
        m[0] = new menu ("ALBAIK Chicken Meal", 31, 2448);
        m[1] = new menu ("Spicy Fish Fillet Meal", 22, 1085);
        m[2] = new menu ("Value Shrimp Meal", 22, 1140);
        m[3] = new menu ("Chicken Fillet Nuggets Meal", 16, 1262);
        m[4] = new menu ("Chicken Fillet Burger", 4, 334);
        m[5] = new menu ("Chicken Fillet Sandwich",  6, 373);
        m[6] = new menu ("Chicken Fillet Nugget Snack", 4, 158);
        m[7] = new menu ("Big baik", 12, 862);
        m[8] = new menu ("saj DElite with Delite Sauce", 6, 248);
        m[9] = new menu ("Coleslaw Salad", 4, 260);
        m[10] = new menu ("Fries", 4, 308);
        m[11] = new menu ("Corn on the Cob", 5, 234);
        m[12] = new menu ("Hommos", 4, 412);
        m[13] = new menu ("Ice Cream ", 2, 266);
        m[14] = new menu ("Seven up", 3, 158);     
        for (int i =0; i<m.length; i++){
            baik.add(m[i]);
        }
        
        allRest[count] = baik;
          count++;
    }
    public void herfy (){
        He.Branches ("Al-Aziza");
        He.Branches ("AL-SHOOIYAH");
        He.Branches ("AL-AWALI");
        menu [] m = new menu[13];
        m[0] = new menu ("super herfy", 23, 754);
        m[1] = new menu ("cheese burger", 6, 0);
        m[2] = new menu ("chili chicken", 17, 0);
        m[3] = new menu ("BBQ chicken Tortilla", 21, 0);
        m[4] = new menu ("herfy wrap regular", 14,0);
        m[5] = new menu ("bran bread grilled chicken",  21, 0);
        m[6] = new menu ("super chili chicken ", 23, 0);
        m[7] = new menu ("6 chicken nuggets", 10, 208);
        m[8] = new menu ("big herfy with cheese",17, 0);
        m[9] = new menu ("chicken burgar", 20, 586);
        m[10] = new menu ("double super chicken burgar",28 ,772);
        m[11] = new menu ("large fries", 9, 0);
        m[12] = new menu ("onion rings", 8, 0);
        for (int i =0; i<m.length; i++){
            He.add(m[i]);
        }   
        
        allRest[count] = He;
          count++;
    }
    
    
    
    public void MaestroPizza (){
    Mp.Branches ("Al-Aziza");
    Mp.Branches ("AL-SHOOIYAH");
    Mp.Branches ("AL-AWALI");
   menu[] m = new menu [11];

  m [0]=new menu("ranchy orignal ",36,97);
  m [1]=new menu(" vegetarian",35,92);
  m [2]=new menu("margarita", 35 ,66);
  m [3]=new menu(" arabisque",35 ,98 );
  m [4]=new menu("bbq chicken",35 ,83);
  m [5]=new menu(" steak&cheese ", 35 ,94);
  m [6]=new menu("fresh italian recca", 35 ,69);
  m [7]=new menu(" lahpeno",35,76);
  m [8]=new menu("grilled chicken ",35 ,78) ;
  m [9]=new menu(" delux",35,93);
  m [10]=new menu(" pepperoni",35,77);
  for (int i=0; i<m.length;i++){
    Mp.add(m[i]);
    
    }// for
  allRest[count] = Mp;
          count++;
  }// method

    public void DunkinDounts (){
    DD.Branches ("Al-Aziza");
    DD.Branches ("AL-SHOOIYAH");
    DD.Branches ("AL-AWALI");
   menu[] D = new menu [11];
  D[0]=new menu("Cold brew coffe ",13 ,247);
  D[1]=new menu("Ice caramel macchiatio",16 ,214 );
  D[2]=new menu("ced coffe", 11 ,14);
  D[3]=new menu("Shaken iced tea",13 ,54 );
  D[4]=new menu("Ice latte",12 ,380);
  D[5]=new menu("Dunking orginal coffe ", 7 ,13);
  D[6]=new menu("Dark roast coffe", 7 ,69);
  D[7]=new menu("Caffe latte",9,142);
  D[8]=new menu("Capputccino",9 ,165) ;
  D[9]=new menu("Hot tea",7,47);
  D[10]=new menu("Moch",11,343);
  for (int i =0; i<D.length;i++) {
    DD.add(D[i]);
    }
     allRest[count] = DD;
          count++;
    }
    public void boga (){ // NOUF
        Boga.Branches("Al-Aziza");
        Boga.Branches("AL-SHOQIYAH");
        Boga.Branches("AL-AWALI");
        menu [] m = new menu [29];
        m[0] = new menu ("Classic Chicken", 21, 266);
        m[1] = new menu ("Chicken Club", 24, 225);
        m[2] = new menu ("Arabian", 18, 255);
        m[3] = new menu ("Jinny Shrimp", 28, 311);
        m[4] = new menu ("Smoked Salmon", 31, 269);
        m[5] = new menu ("Roasted Mediterranean", 20, 128);
        m[6] = new menu ("Vegetarian", 17, 183);
        m[7] = new menu ("Italian Bowl", 29, 112);
        m[8] = new menu ("Greek Bowl", 25, 90);
        m[9] = new menu ("Very Berry Bowl", 40, 93);
        m[10] = new menu ("Apple Quinoa Bowl", 26, 94);
        m[11] = new menu ("vegetarian Omelette Sandwich", 14, 217);
        m[12] = new menu ("Toast & Jam", 12, 300);
        m[13] = new menu ("Egg Pesto Sandeich", 16, 273);
        m[14] = new menu ("Boga Oats", 17, 232);
        m[15] = new menu ("Boga Oats & Berries", 23, 238);
        m[16] = new menu ("Granola Bar", 12, 233);
        m[17] = new menu ("Mixed Fruit", 17, 74);
        m[18] = new menu ("Rocky Road Chocolate", 3, 79);
        m[19] = new menu ("Cream Mushroom Soup", 18, 112);
        m[20] = new menu ("Chicken Soup", 15, 81);
        m[21] = new menu ("Carrot&Orange Juice",20,83);
        m[22] = new menu ("Lemon Juice With Ice Tea", 12, 47);
        m[23] = new menu ("Red Apple Juice", 17, 40);
        m[24] = new menu ("Lemon Juice With Mint", 17, 28);
        m[25] = new menu ("Avocado Juice", 21, 83);
        m[26] = new menu ("Mango With Sweet Melon",21, 76);
        m[27] = new menu ("Banana-Rama", 21, 74);
        m[28] = new menu ("Earl Grey Tea", 12, 1);
        
         for (int i =0; i<m.length; i++){
            Boga.add(m[i]);
        }
         
       //  Boga.sort(Boga.allMenu);
             allRest[count] = Boga;
          count++;
    }
    public void starBucks (){
         // Caffأ¨
        sB.Branches("Al-Aziza");
        sB.Branches("AL-SHOQIYAH");
        sB.Branches("AL-AWALI");
        menu [] m = new menu[48];
        m[0] = new menu ("Iced Cafأ© Americano", 14, 10 );
        m[1] = new menu ("Cafأ© Americano", 14, 10);
        m[2] = new menu ("Iced White Chocolate Mocha", 19, 340);
        m[3] = new menu ("White Chocolate Mocha", 19, 400);
        m[4] = new menu ("Iced Caffأ¨ Mocha", 19, 280);
        m[5] = new menu ("Caffأ¨ Mocha", 19, 330);
        m[6] = new menu ("Cappuccino", 16, 140);
        m[7] = new menu ("Iced Caffأ¨ Latte", 16, 120 );
        m[8] = new menu ("Caffأ¨ Latte", 16, 120 );
        m[9] = new menu ("Dulce De Leche Latte", 21, 460);
        m[10] = new menu ("Iced Dulce De Leche Latte", 21, 410);
        m[11] = new menu ("Blonde Latte", 18, 150);
        m[12] = new menu ("Iced Blonde Latte", 18, 120);
        m[13] = new menu ("Cold Brew", 18, 0 );
        m[14] = new menu ("Cold Brew Latte", 18,60 );
        m[15] = new menu ("Freshly Brewed Coffee", 14, 5);
        m[16] = new menu ("Caramel Mecchiato", 19, 210);
        m[17] = new menu ("Iced Caramel Mecchiato", 19, 170);
        m[18] = new menu ("Iced Starbucks signature Chocolate", 20 , 440);
        m[19] = new menu ("Starbucks signature Hot Chocolate", 20, 400);
        m[20] = new menu ("Iced Matcha Latte", 17, 130);
        m[21] = new menu ("Matcha Latte", 17, 140);
        m[22] = new menu ("Espresso Frappuccino", 19, 160);
        m[23] = new menu ("Coffee Frappuccino", 19, 160);
        m[24] = new menu ("Double Caramel Frappuccino", 22, 290);
        m[25] = new menu ("White Chocolate Mocha Frappucino", 20, 310);
        m[26] = new menu ("Mocha Frappuccino", 20, 340);
        m[27] = new menu ("Java chip Frappuccino", 22, 400);
        m[28] = new menu ("Dulce De Leche Frappuccino", 21, 340);
        m[29] = new menu ("DoubleCramel Cream Frappuccino", 22, 280);
        m[30] = new menu ("Vanilla Cream Frappuccino", 20, 260);
        m[31] = new menu ("Dulce De Leche Cream Frappuccino", 21, 320);
        m[32] = new menu ("Chocolate Chip Cream Frappuccino", 22, 390);
        m[33] = new menu ("Strawberry And Cream Frappuccion", 20, 330);
        m[34] = new menu ("Chocolate Cream Frappuccino",20, 330);
        m[35] = new menu ("Iecd Shaken Black Tea", 20, 0 );
        m[36] = new menu ("Iecd Shaken Green Tea", 20, 0);
        m[37] = new menu ("Iecd Shaken Black Tea And Lemonade", 20, 30);
        m[38] = new menu ("Iecd Shaken Green Tea And Lemonade", 20, 30);
        m[39] = new menu ("Peach Iced Tea", 24, 80);
        m[40] = new menu ("Mango Iced Tea", 24, 80);
        m[41] = new menu ("Zaatar And Cheese Croissant", 15, 658);
        m[42] = new menu ("Plain Croissant", 11, 436);
        m[43] = new menu ("Cheese Croissant", 15, 579);
        m[44] = new menu ("Chocolate Cake", 26, 566);
        m[45] = new menu ("Red Velvet Cake", 26, 620);
        m[46] = new menu ("Browine Cookie", 14, 360);
        m[47] = new menu ("Buleberry Muffin", 17, 540);
       // m[] = new menu ();
        for (int i =0; i<m.length; i++){
            sB.add(m[i]);
        }
        
       // sB.sort(sB.allMenu);
         allRest[count] = sB;
          count++;

    }
    public void timHortans (){
        TH.Branches ("AL-AWALI");
      
       menu[] m = new menu [20];
       
       m[0] = new menu ("Coffee", 10, 0);
       m[1] = new menu ("Latte", 18, 149);
       m[2] = new menu ("Iced Frensh Vanilla" , 22, 503);
       m[3] = new menu ("Iced Americano" ,12, 0);
       m[4] = new menu ("French Vanilla" ,17, 316);
       m[5] = new menu ("Coffee Mocha", 18, 135);
       m[6] = new menu ("Iced Cappuccino" , 19, 403);
       m[7] = new menu ("Iced Latte", 18, 124);
       m[8] = new menu ("Cappuccino", 18, 110);
       m[9] = new menu ("Flat White", 16, 121);
       m[10] = new menu ("Frensh Vanilla Latte", 20, 329);
       m[11] = new menu ("Boston Cream Donut", 6, 239);
       m[12] = new menu ("Chocolate Dip Dount", 6, 234);
       m[13] = new menu ("Rainbow Dount", 10, 326);
       m[14] = new menu ("Vanilla Dip Dount" , 6 ,276);
       m[15] = new menu ("Bagel Egg and Cheese",11 , 526);
       m[16] = new menu ("Breakfast Bagel Sandwich", 15, 559);
       m[17] = new menu ("Grilled Cheese Panini", 16, 550);
       m[18] = new menu ("Chicken & Cheese Wrap", 11, 285);
       m[19] = new menu ("Steak & Cheese Wrap", 11, 337);
       
       for (int i=0; i<m.length; i++){
         TH.add(m[i]);
       }
       allRest[count] = TH;
          count++;
    }
    public void burgerKing (){ // salwa 
        BK.Branches("AL-Awali");
        BK.Branches("Makkah mall");
        BK.Branches("Al Diyafa mall");
        menu [] m = new menu[15];
        m[0] = new menu ("Checken Royal Meal", 22 , 479);
        m[1] = new menu ("SPICY CHICKEN DELUXE", 22, 619);
        m[2] = new menu ("Chicken Whopper", 26, 486);
        m[3] = new menu ("BIG KINGâ„¢ CHICKEN", 17, 875);
        m[4] = new menu ("Chicken Steakhouse", 26, 718);
        m[5] = new menu ("DOUBLE WHOPPER",  28, 919);
        m[6] = new menu ("BIG KINGâ„¢ Beef ", 29, 1045);
        m[7] = new menu ("LITE WHOPPER", 21, 592);
        m[8] = new menu ("KING CHICKEN SALAD", 20, 133);
        m[9] = new menu ("Chicken Caesar Salad", 28, 190);
        m[10] = new menu ("KING GARDEN SALAD", 16, 61);
        m[11] = new menu ("BK FUSIONآ® KIT KATآ®", 10, 307);
        m[12] = new menu ("ICE CREAM CONEl", 1, 153);
        m[13] = new menu ("CARAMEL SUNDAE", 5, 201);
        m[14] = new menu ("FANTA", 7, 56);       
        for (int i =0; i<m.length; i++){
            BK.add(m[i]);
        }
        
        allRest[count] = BK;
          count++;
    }
    
    
    public void Roots (){ 
    Ro.Branches("Umm AlQura University");
    Ro.Branches("SNB AlAhli");
    Ro.Branches("Ministry of Health");
        menu[] m = new menu [11];
    m[0] = new menu ("Ceaser Salad",25,315);
    m[1] = new menu ("Fattoush Salad", 25, 451);
    m[2] = new menu ("Pasta Salad", 25, 600);
    m[3] = new menu ("Tuna Salad" , 25, 522);
    m[4] = new menu ("Rocca and Roll", 28, 413);
    m[5] = new menu ("Quinoa Salad" , 32, 527);
    m[6] = new menu ("Granola with Strawberry", 20, 378);
    m[7] = new menu ("Daytuna Tuna Delight", 15, 322);
    m[8] = new menu ("Olifeta Delight", 12, 322);
    m[9] = new menu ("Chicken Mushroom", 17, 232);
    m[10] = new menu ("Chicken Shish Tawouk", 17, 231);
    
    for (int i=0; i<m.length; i++){
         Ro.add(m[i]);
       }
       allRest[count] = Ro;
          count++;
    }
    
    public void signature(){
    SG.Branches("Al-Aziza");
    SG.Branches("AL-SHOQIYAH");
    SG.Branches("AL-AWALI");
    menu [] m = new menu [21];
    m[0] = new menu ("Strawberry Juice",14, 335);
    m[1] = new menu ("Mango Juice",16, 380);
    m[2] = new menu ("Grape Juice", 14, 180);
    m[3] = new menu ("Pineapple Juice", 14, 145);
    m[4] = new menu ("Orange Juice", 13, 180);
    m[5] = new menu ("Lemon With Mint Juice", 13, 285);
    m[6] = new menu ("Carrots Juice", 14, 135);
    m[7] = new menu ("GrapeFruit Juice", 14, 125);
    m[8] = new menu ("Pemegranate Juice", 16, 265);
    m[9] = new menu ("Apple Juice", 14, 180);
    m[10] = new menu ("Watermelon Juice", 13, 150);
    m[11] = new menu ("Avocado Juice", 16, 575);
    m[12] = new menu ("Cantaloupe Juice", 13, 185);
    m[13] = new menu ("Banana Milk", 13, 290);
    m[14] = new menu ("Signature", 17, 460);
    m[15] = new menu ("Paradise", 16, 480);
    m[16] = new menu ("Sunshine", 16, 480);
    m[17] = new menu ("Cocktail Light", 15, 185);
    m[18] = new menu ("Queen Bee", 20, 620);
    m[19] = new menu ("Rainbow", 16, 480);
    m[20] = new menu ("Jamaica", 17, 470);
    
    for (int i =0; i<m.length; i++){
            SG.add(m[i]);
        }
 //   SG.sort(SG.allMenu);
     allRest[count] = SG;
          count++;
    
    }
    
    public void SortRest (){
        resturants temp;
        for (int i = 0; i<allRest.length; i++){
            for (int j =0 ; j<allRest.length; j++){
                if (allRest[i].getName().compareTo(allRest[i].getName())>0);
                 temp = allRest[i];
                 allRest[i] = allRest[j];
                 allRest[j] = temp;
            }
        }
    }
    
    
    public void displayRestaurants(){
    for (int i = 0;i<allRest.length; i++){
        if (allRest[i] != null){
            System.out.println(allRest[i]);
        } // if
        
    } // for
    }// method
    
    public void table (){
        JFrame jF = new JFrame ();
        String [][] tableData = {{"1", "McDonalds", "Fast Food resturant"}, 
            {"2", "burger King", "Fast Food resturant"}, {"3", "herfy", "Fast Food resturant"},
            {"4", "Meastro pizza", "Fast Food resturant"}, {"5", "ALBAIK", "Fast Food resturant"},
            {"6", "BOGA", "Healthy Food rsturant"}, {"7", "Roots", "Healthy Food"},
            {"8", "StarBucks", "Cafe"}, {"9", "Dankin Donuts", "Cafe"}, {"10", "Tim Hortons", "Cafe"},
            {"11", "Signature", "Juice Shop"},{"12","Mini Market", "Market"},{"13- finished ordering","",""}};
        String [] TC = {"", "resturant", "Type"};
        JTable jT = new JTable (tableData, TC);
        jT.setBounds(30, 40, 230, 280);
        JScrollPane JSP = new JScrollPane (jT);
        jF.add(JSP);
        jF.setSize(350, 300);
        jF.setVisible(true);
    }
    
    /*
    System.out.println("12- Finished Ordering");
    ("Signature", "Juice Shop"); //1
    fastFood Mc = new fastFood("McDonalds", "Fast Food");//2
    healthyFood Boga = new healthyFood ("BOGA", "Healthy Food");//3
    Cafes sB = new Cafes("StarBucks", "Cafe");//4
    fastFood Mp = new fastFood("Meastro pizza","Fast Food" );//5
    Drinks DD = new Drinks("Dankin Donuts","Drinks");//6
    healthyFood Ro = new healthyFood("Roots", "Healthy Food");//7
    Cafes TH = new Cafes ("Tim Hortons", "Cafe and Bake shop");//8
    fastFood BK = new fastFood("burger King", "Fast Food");//9
    fastFood baik = new fastFood("ALBAIK","Fast Food" );//10
    fastFood He = new fastFood("herfy", "fastFood");//11
    */
}

  
