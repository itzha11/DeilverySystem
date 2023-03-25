/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deilverysystem;
import java.util.*;

public class DeilverySystem {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        String cop;
        CreatItems I = new CreatItems ();
        MiniMarket MK = new MiniMarket();
        items list = new items ();
        orders allOrders = new orders ();
        Driver [] drivers = new Driver [4];
        drivers[0] = new Driver (); drivers[0].setDriverName("Ali"); drivers[0].setDrivernumber(0502002122);
        drivers[1] = new Driver ("Omer",055021132);
        drivers[2] = new Driver ("Leen",0500201342);
        drivers[0] = new Driver ("Asia",0532212221);
        menu dish = new menu();
        declaringRestaurants R = new declaringRestaurants();
        receipts price = new receipts ();
        ArrayList <customer> CUT = new ArrayList<customer>();
        customer NewCus = new customer ();
        String change ;
        int num = 0;
        int randomDriver = (int)(Math.random()*3);

        // ************************ RESTURANTS********************************
        R.McDonalds(); R.burgerKing(); R.herfy(); R.MaestroPizza(); R.Baik(); R.boga(); R.Roots(); R.starBucks(); R.DunkinDounts(); 
        R.timHortans(); R.signature(); 
        I.M_Plist(); I.V_FList(); I.OthersList();
        R.table();
        int choose = 0;
        int F = 0;
        boolean flag = false;
        while (choose != 13 ){
        /* ****************************************************************************
            ************************ CUSTOMER INFORMATION******************************
            ***************************************************************************
        */
      System.out.println("Welcome to \" US TO YOU \" program ");
        System.out.println("1- Sign in           2- Creat new account");
        
        try{
        num = input.nextInt();
        if( num < 1 || num > 2){ throw new InvalidNumberExcption();}
        }
        catch(InvalidNumberExcption ex){
        System.out.println(ex.getMessage());
        } 
        while ( num< 1 || num>2 ){
        System.out.println("1- Sign in           2- Creat new account");
        try{
        num = input.nextInt();
        if( num < 1 || num > 2){ throw new InvalidNumberExcption();}
        }
        catch(InvalidNumberExcption ex){
        System.out.println(ex.getMessage());}}
        boolean C = false;
        if (num == 1){
        System.out.println("Enter your phone number ");
        long phone = input.nextLong();
        System.out.println("Enter password: ");
        String passWord = input.next();
             for (customer CUT1 : CUT) {
                 if (true == CUT1.Checkaccount(phone, passWord)) {
                     System.out.println("Welcome " + CUT1.getCusName());
                     price.setCusInfo(CUT1);
                     C = true;
                     break;
                 } // second if

             } // for loop
        if (C == false) {
            System.out.println("wrong password OR number... Try again :( ");
            System.out.println("Do you want to change your pass word? yse or no");
            change = input.next(); 
            if (change.compareToIgnoreCase("yes") == 0){
            System.out.println("Enter your number: ");
            long num2  = input.nextLong();
            System.out.println("Enter your Email: ");
            String email = input.next();
            int customer = 0;
            for (int i = 0; i<CUT.size(); i++){
            if ( CUT.get(i).CheckPassword(email, num2) == true) {customer  = i; break ;} // if
            } //  second for loop 
            System.out.println("Enter new password: ");
            CUT.get(customer).setPassword(input.next());
            System.out.println("Welcome " + CUT.get(customer).getCusName());
            price.setCusInfo(CUT.get(customer));
            } // if changes the password 
            else
                continue;
        } // if for wrong password 
           
        } // first if
        else {
            NewCus.CustInfor();
            CUT.add(NewCus);
            price.setCusInfo(NewCus);
            System.out.println("Welcome "+ NewCus.getCusName());
        }

        
       /*
        ******************************************************************
        ********************* RETURANTS LIST******************************
        ******************************************************************
        */
        System.out.println("Choose the restaurant you want to order from by its number: ");
        choose = input.nextInt();
        if (choose == 13)continue;
        //***********************************MARKET**************************************************************************************************************
        
        if (choose == 12){
            I.allitems.display_infor();
            MK.displayList(choose, I, price, list);
            System.out.println("");
            price.Bill(I);
            System.out.println("\n Your order will be delivered from our mini market by our driver " + drivers[randomDriver].getDriverName() + " to you soon :)");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("1- Checkout" + "               " + "2- back to the menu");
            F = input.nextInt();
            if (F == 2){
              I.allitems.display_infor();
              MK.displayList(choose, I, price, list);
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
                price.Bill(I);
                System.out.println("\n Your order will be delivered from our mini market by our driver " + drivers[randomDriver].getDriverName() + " to you soon :)");
            } // if 
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Choose the payment method you prefer: \n" + "1- Cash\n2- CreditCard");
            F = input.nextInt();
            price.paymentMethod(F);
            System.out.println("add your coupon here: ");
            cop = input.next(); price.addCoupon(cop);
            System.out.println("****************TOTAL COST******************\n"+ price.getTotal());
            price.giveCoupon(allOrders.orderCounting);
            allOrders.addReceipt(price);
            System.out.println(drivers[randomDriver]);
            System.out.println(drivers[randomDriver].getDriverName()+"'s Delivery orders: "+drivers[randomDriver].getNumOfOrders());
            System.out.println("Please rate our driver so we can get better:) \nOut of 5 : ");
            F = input.nextInt();
            System.out.println(drivers[randomDriver].rateDriver(F));
            drivers[randomDriver].numOfOrder();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Thank you for ordering, Come again");
            price.menuO.clear();
            price.setTotal(0);
             System.out.println("---------------------------------------------------------------------");
            System.out.println("if you want to exit the app enter 13\nif you want to continue enter 1");
            choose = input.nextInt();
            continue;
            //*****************************Market end******************************************************************************
        } // market if
        /*
        ****************************** resturans*************************************************************
        */
            R.allRest[choose-1].displayBranches();
            R.allRest[choose-1].displayList(choose-1,R, price, dish);
            System.out.println("");
            price.Bill(R.allRest[choose]);
            System.out.println("\n Your order will be delivered from  " + R.allRest[choose-1].getName() +" - "+ R.allRest[choose-1].getChosenBranch() + " branch, by our driver " + drivers[randomDriver].getDriverName() + " to you soon :)");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("1- Checkout" + "               " + "2- back to the menu");
            F = input.nextInt();
            if (F == 2){
                R.allRest[choose-1].displayList(choose-1,R, price, dish);
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
                price.Bill(R.allRest[choose]);
                System.out.println("\n Your order will be delivered from  " + R.allRest[choose-1].getName() +" - "+ R.allRest[choose-1].getChosenBranch() + " branch, by our driver" + drivers[randomDriver].getDriverName() + " to you soon :)");
            } // if 
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Choose the payment method you prefer: \n" + "1- Cash\n2- CreditCard");
            F = input.nextInt();
            price.paymentMethod(F);
            System.out.println("add your coupon here: ");
            price.addCoupon(input.next());
            System.out.println("****************TOTAL COST******************\n"+ price.getTotal());
            price.giveCoupon(allOrders.orderCounting);
            allOrders.addReceipt(price);
            System.out.println(drivers[randomDriver]);
            System.out.println(drivers[randomDriver].getDriverName()+"'s Delivery orders: "+drivers[randomDriver].getNumOfOrders());
            System.out.println("Please rate our driver so we can get better:) \nOut of 5 : ");
            F = input.nextInt();
            System.out.println(drivers[randomDriver].rateDriver(F));
            drivers[randomDriver].numOfOrder();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Thank you for ordering, Come again");
            price.menuO.clear();
            price.setTotal(0);
            System.out.println("---------------------------------------------------------------------");
            System.out.println("if you want to exit the app enter 13\nif you want to continue enter 1");
            choose = input.nextInt();
            
        } // while

        System.out.println("Thank you for ordering, Come again"); 
        //} // try Block
        //catch (Exception ex) {
        //    System.err.println("Error: Exception Occured");
       // }
 
    } // main

    
} // class


