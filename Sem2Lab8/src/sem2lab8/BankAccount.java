/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sem2lab8;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class BankAccount {
    int balance;
  
  public BankAccount(int initialBalance){
    balance = initialBalance;
  }
  
  public void checkBalance(){
    System.out.println("Hello!");
    System.out.println("Your balance is "+balance);
  }
  
  public void deposit(int amountToDeposit){
    balance = amountToDeposit + balance;
    System.out.println("You just deposited " + amountToDeposit);
  }
  
  public int withdraw(int amountToWithdraw){
    balance = balance - amountToWithdraw;
    System.out.println("You just withdrew " + amountToWithdraw);
    return amountToWithdraw;
  }
  
  public String toString(){
    return "This is a savings account with " + balance + " saved.";
  }
  
  
    
}
