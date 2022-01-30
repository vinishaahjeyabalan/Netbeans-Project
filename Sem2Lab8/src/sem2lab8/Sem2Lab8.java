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
public class Sem2Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    BankAccount savings = new BankAccount(2000);
    
    //Check balance:
    savings.checkBalance();
    
    //Withdrawing:
    savings.withdraw(300);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(600);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(600);
    
    //Check balance:
    savings.checkBalance();
    
    System.out.println(savings);
        // TODO code application logic here
    
    

       
  }       
}

