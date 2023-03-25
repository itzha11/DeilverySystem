/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deilverysystem;
import java.util.Scanner;
    
public class customer {
    Scanner input = new Scanner (System.in);
    
    private String cusName;
    private long cusNumber;
    private String email;
    private String password;
    private int custOrders = 0;

    public customer() {
    }


    public void CustOrders() {
        this.custOrders = custOrders ++;
    }

    public int getCustOrders() {
        return custOrders;
    }

    
    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    
    public long getCusNumber() {
        return cusNumber;
    }

    
    public void setCusNumber(long cusNumber) {
        this.cusNumber = cusNumber;
    }

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void CustInfor (){
        System.out.println("Enter your name: ");
        this.cusName = input.next();
        System.out.println("Enter your phone number: ");
        this.cusNumber = input.nextLong();
        System.out.println("Enter your Email: ");
        this.email = input.next();
        System.out.println("Enter a password: ");
        this.password = input.next();
        System.out.println("Your account has been Created :) ");
            System.out.println("Keep your password in mind so that you can sing in from other device) ");
    }
   
    public boolean CheckPassword(String email, long number){
        if (email==email && number==number )
            return true;
        else
            return false;
    }
 
    public boolean Checkaccount (long number, String password){
        int testpass = this.password.compareTo(password);
        return (this.cusNumber == number && testpass == 0);
    }
    
    @Override
    public String toString() {
        return "Customer{" + "Name: " + cusName + ", Number: " + cusNumber + '}';
    }
    
   

}


    
   






