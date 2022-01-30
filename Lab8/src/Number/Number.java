/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number;

import java.util.Arrays;
import java.util.Random;


/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Number {
    Random r = new Random();
    private int[] numbers;
    private int size;
    private int range;
    

    public Number() {
        size = 10;
        range = 91;
        numbers = new int[size];
        //System.out.println("The 10 random numbers are: ");
        for(int i=0; i<size; i++){
            numbers[i] = r.nextInt(range);
            //System.out.println(numbers[i]);
        }
    }

    public Number(int size) {
        this.size = size;
        range = 101;
        numbers = new int[size];
        //System.out.println("The 5 random numbers are: ");
        for(int i=0; i<size; i++){
            numbers[i] = r.nextInt(range);
            //System.out.println(numbers[i]);
        }
    }

    public Number(int size, int x) {
        this.size = size;
        range = x + 1;
        numbers = new int[size];
        //System.out.println("The 4 random numbers are: ");
        for(int i=0; i<size; i++){
            numbers[i] = r.nextInt(range);
            //System.out.println(numbers[i]);
        }
    }

    public void generate_array() {
        System.out.println(Arrays.toString(numbers));
        
//        numbers = new int[size];
//        for (int i = 0; i < size; i++) {
//            numbers[i] = r.nextInt(range);
//            System.out.println(numbers[i]);
//        }
       // this.numbers = numbers;
    }

    public void displayall(int size, int x) {
        this.size = size;
        range = x + 1;
        System.out.println("The numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(range);
            System.out.println(numbers[i] + " ");
        }
        System.out.println("");
    }

    public void displayeven() {
        System.out.println("The even numbers are: ");
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " ");
            }
        }
        System.out.println("");
    }

    public void displayprime() {
        System.out.println("The prime numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            boolean prime = true;
            if (numbers[i] == 0 && numbers[i] == 1) {
                prime = false;
            }
            for (int j = 2; j < numbers[i]; j++) {
                if (numbers[i] % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime == true) {
                System.out.println(numbers[i] + " ");
            }
        }
        System.out.println("");
    }

    public void displaymax() {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.print("The biggest number is: " + max);
        System.out.println("");
    }

    public void displaymin() {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The smallest number is: " + min);
    }

    public void displayaverage() {
        int ave = 0, sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        ave = sum / numbers.length;
        System.out.println("The average is: " + ave);
    }

    public void displaysquare() {
        int[] squares = new int[size];
        System.out.print("The squares of the numbers are: ");
        for (int i = 0; i < size; i++) {
            squares[i] = numbers[i] * numbers[i];
            System.out.print(squares[i] + " ");
        }
        System.out.println("");
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getSize() {
        return size;
    }

    public int getRange() {
        return range;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setRange(int range) {
        this.range = range;
    }
}

//    public Number(){
//        int[] number = new int[10];
//        Random r=new Random();
//        for(int i=0; i<10; i++){
//            number[i]=r.nextInt(101);
//            System.out.println(number[i]);
//        }
//    }
//    
//    public Number(int a){
//        int[] number = new int[a];
//        Random r=new Random();
//        for(int i=0; i<a; i++){
//            number[i]=r.nextInt(101);
//            System.out.println(number[i]);
//        }
//    }
//    
//    public Number(int a, int b){
//        int[] number = new int[a];
//        Random r=new Random();
//        for(int i=0; i<a; i++){
//            number[i]=r.nextInt(b+1);
//            System.out.println(number[i]);
//    
//        } 

