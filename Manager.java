/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deilverysystem;

public interface Manager {
    
    public void add (Object o);
    public void update (Object o, Object NewO);
    public void display_infor();
    public void displayList(int choose, Object o, receipts price, Object m);
}



