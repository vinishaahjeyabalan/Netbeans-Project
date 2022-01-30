/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8q2;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class BankAccount {
    private String name;
    private int passportnum, amount;
    
    public BankAccount(String name, int passportnum, int amount) {
        this.name = name;
        this.passportnum = passportnum;
        this.amount = amount;
    }
    
    public void deposit(int amount){
        this.amount+=amount;
        System.out.println("Current balance: " + this.amount);
    }
    
    public void withdraw(int amount){
        this.amount-=amount;
        System.out.println("Current balance: " + this.amount);
    }
    
     public void setName(String name) {
        this.name = name;
    }

    public void setPassportnum(int passportnum) {
        this.passportnum = passportnum;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public String getName() {
        return name;
    }

    public int getPassportnum() {
        return passportnum;
    }

    public int getAmount() {
        return amount;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    private String name, ID;
//    private double amount;
//    
//    public BankAccount(String name, String ID, double amount){
//        this.name = name;
//        this.ID = ID;
//        this.amount = amount;
//    }
//
//    
//    
//    
//    public void deposit(int amount){
//        this.amount += amount;
//        System.out.println("Success!");
//        System.out.println("Amount deposited: RM" + amount);
//        System.out.println("Current balance: RM" + this.amount);
//    }
//    
//    public void withdrawn(int amount){
//        if(amount>this.amount){
//            System.out.println("Error");
//        }
//        else{
//            this.amount -= amount;
//            System.out.println("Success!");
//            System.out.println("Amount withdrawn: RM" + amount);
//            System.out.println("Current balance: RM" + this.amount);
//        }
//    }

    

   
    
    
}
