/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deilverysystem;

class InvalidNumberExcption extends Exception  {
    /**
     * Constructs a new exception with null as its detail message.
     */
    public InvalidNumberExcption(){
        super("Invalid number, it should be 1 or 2 ");
    }
    /**
     * Constructs a new exception with the specified detail message.
     */
    public InvalidNumberExcption(String message){
        super(message);
    }
    
}
