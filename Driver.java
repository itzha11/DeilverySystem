/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deilverysystem;
import java.util.*;
public class Driver {
    int R = 0;
    private String driverName;
    private long drivernumber = 0;
    private double rate =0 ;
    private int numOfOrders=0;

    public Driver(String driverName, long drivernumber) {
        this.driverName = driverName;
        this.drivernumber = drivernumber;
    }
    
    public Driver() {
    }
    
    
    public int getNumOfOrders() {
        return numOfOrders;
    }

    public double getRate() {
        return rate;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setDrivernumber(long drivernumber) {
        this.drivernumber = drivernumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public long getDrivernumber() {
        return drivernumber;
    }
    
    
    public double rateDriver(int i){
        R++;
      rate=(rate+i)/(R);
      System.out.println(driverName + " rate: ");
      return  rate;
        
    }
    
    
    public void numOfOrder(){
        numOfOrders++;
    }
    
    

    @Override
    public String toString() {
        return "Driver{" + "driver Name: " + driverName + " , driver Number: " + drivernumber + "}";
    }
   
    
}





