
 
package deilverysystem;
import java.util.*;


    public class receipts {
    
  private String deliveryTime = "From one To two hours";
    private int price = 18;
    private customer customerInfo;
    ArrayList <menu> menuO = new ArrayList <menu> ();
    ArrayList <items> ItemsList = new ArrayList <items>();
    int num=0;
    String firstCoupon = "First";
    String [] coupon = {"NS", "SSH", "HMW", "XX"};
    fastFood n = new fastFood ();
   healthyFood h = new healthyFood();
   Cafes c = new Cafes ();
   Drinks d = new Drinks();
   int total1 = 0; 
    int total =0;
    
    //Methods list:
    
    public int getTotal (){
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void adddish(menu m) {
        menuO.add(m);
    }
    
    public void addItems(items i){
        ItemsList.add(i);
    }
    
    public void setPrice(int p) {
        this.price=p;
    }
    public void setDeliveryTime(String DTime){
        this.deliveryTime=DTime;
    }
    
    public int getPrice(){
        return price; 
    }
    
    public String getTimeDelivery(){
        return deliveryTime; 
    }
    
    public void paymentMethod(int n){//in main payment method 1- cach 2-Credit Card 
     if (n==2){
     CreditCard();
     } 
    }
    
    
    public void setCusInfo(customer m){  
      customerInfo=m;
    }
    
    public void CreditCard(){
        receipts s = new receipts();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Card info: ");
        System.out.println("Cardholder name:");
        String name = input.next();
        System.out.println("---------------------\nCard number");
        long cardnum = input.nextLong();
        System.out.println("---------------------\nExpirs (mm/yy)");
        String expirs = input.next();
        System.out.println("---------------------\nCVV");
        int cvv =input.nextInt();
    }
    
    public void addCoupon(String c){
        int com ;
        for (int i= 0; i<coupon.length; i++){
            com = coupon[i].compareToIgnoreCase(c);
            if (com == 0){
            total1 = ((15*total)/100);
            total = (total - total1); break;
            } // end if
        } // end loop
        System.out.println( "after coupon: "+total);
    } // method's end
    
    public void giveCoupon(int c){
        int random = (int)(Math.random()*4);
        if (c == 0){
            System.out.println("We're glad that you chose us. this is small givt form us, make sure to use it :) \n" + firstCoupon);
        } // if
        else {
            System.out.println("small givt form us, make sure to use it :)\n" + coupon[random]);
        } // else 
    } // method
    
    public void Bill(Object O){
        
        System.out.println("                   YOUR ODRDER                   "); 
        System.out.println("*************************************************");
        System.out.println(customerInfo+"         Delivery: "+this.price +"        deliveryTime:       "+this.deliveryTime);
        System.out.println("Your items");
        if (O instanceof resturants){
            if (O instanceof fastFood){
                for (int i = 0; i<menuO.size(); i++){
            System.out.println(menuO.get(i).getDishName() +"                "+ menuO.get(i).getDishPrice());
                    System.out.println(n);
           total+= menuO.get(i).getDishPrice();
           
        }
            } // end if
           else if (O instanceof healthyFood){
        for (int i = 0; i<menuO.size(); i++){
            System.out.println(menuO.get(i).getDishName() +"                "+ menuO.get(i).getDishPrice() );
            System.out.println(h);
           total+= menuO.get(i).getDishPrice();
        }
        }
            else if (O instanceof Cafes){
          for (int i = 0; i<menuO.size(); i++){
            System.out.println(menuO.get(i).getDishName() +"                "+ menuO.get(i).getDishPrice() );
            c.displayAddition();
           total+= menuO.get(i).getDishPrice();
        } // for loop
        } // if 
            else if(O instanceof Drinks){
            for (int i = 0; i<menuO.size(); i++){
            System.out.println(menuO.get(i).getDishName() +"                "+ menuO.get(i).getDishPrice() );
            d.displayAddition();
           total+= menuO.get(i).getDishPrice();
        } // for loop
            } // Drinks if
        } // first if 
        if(O instanceof CreatItems){
           for (int i = 0; i<ItemsList.size(); i++){
            System.out.println(ItemsList.get(i).getItemName()+"                "+ ItemsList.get(i).getItemPrice() );
           total+= ItemsList.get(i).getItemPrice();   
        }
        }
        total = total + price;
        System.out.println("Your Total price is : "+ total);
        
        
    }  
    
}
