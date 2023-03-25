/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deilverysystem;
import java.util.*;
public class orders {
  receipts res1;
    int num;
    int orderCounting;
    ArrayList <receipts> rec= new ArrayList();
    
    public void addReceipt(receipts receipt){
        rec.add(receipt);    
    }

    public void updateReceipts( receipts receipt1 ,receipts receipt2 ){
       int y =  rec.indexOf(receipt1);
       rec.set(y,receipt2);
      }
    
    public void deleteReceipts(receipts receipt){
        int x = rec.indexOf(receipt);
        rec.remove(x);
    }
   
    

}


   
    




