/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinglotlinkedlist;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class ParkingSpace {
    
   static String[][][] pl = new String[4][5][5];
   static LinkedList<String> Info= new LinkedList<>();
   static LinkedList<String> Time= new LinkedList<>();
   static LinkedList<Integer> Clash= new LinkedList<>();
   
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        
     
//        createFile();
    for (int a = 0; a < 4; a++) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                pl[a][i][j] = "0";
            }
        }
    }
        readFile();
        
        System.out.println("Enter Start time: ");
        int start = sc.nextInt();
        System.out.println("Enter Finish time: ");
        int finish = sc.nextInt();
        System.out.println("Enter Floor:");
        int floor = sc.nextInt();
        
        for(int i=0; i<Time.length(); i++){
            String sq = Time.get(i);
            String[] temp = sq.split("\\-");
            int f = Integer.parseInt(temp[1]);
            int s = Integer.parseInt(temp[0]);
            if(start <= f && finish >= s)
                Clash.addNode(i);
                         
            
        }
        
        System.out.print("Booked places during this time priod: ");
        for(int i=0;i<Clash.length();i++){
            //System.out.print(Clash.get(i)+" ");
        }
        //System.out.println("");
        
        System.out.println("\nClashing places during this time: ");
        for(int i=0;i<Clash.length();i++){
            System.out.print(Info.get(Clash.get(i))+", ");
            String[] ss=Info.get(Clash.get(i)).split("\\,");
            int a = Integer.parseInt(ss[0]);
            int x = Integer.parseInt(ss[1]);
            int y = Integer.parseInt(ss[2]);

            pl[a][x][y] = "X";
        }
        
        System.out.println(" ");
        
        Info.showList();
        
        Time.showList();
        

 
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(j%2!=0)
                    System.out.print("\n  ");
                   System.out.print(pl[floor][i][j]);
            }
            
            if(i%2==0)
                System.out.println("");
                 System.out.println("");
        }
        
    }

    public static void readFile(){
        try{

            Scanner read=new Scanner(new FileInputStream("Space.txt"));

            read.nextLine();
            while(read.hasNext()){
                String s= read.nextLine();
                String[] ss=s.split("\\,");
//                for(int i=0;i<ss.length;i++){
//                    System.out.print(ss[i]+" "+i);
//                }
//                System.out.println("");
             
                Time.addNode(ss[3]);
                Info.addNode(ss[0]+","+ss[1]+","+ss[2]);
//                int a=Integer.parseInt(ss[0]);
//                int i=Integer.parseInt(ss[1]);
//                int j=Integer.parseInt(ss[2]);
//              
//                pl[a][i][j]= "X";
               
            }
            
        }catch(FileNotFoundException e){
            System.out.println("Read Error");
        }
    }
        public static void createFile(){
        try{
            PrintWriter write=new PrintWriter(new FileOutputStream("Space.txt"));
            write.println("Book");
            
          
            write.close();
            System.out.println("Register successful");
        }catch(IOException e){
            System.out.println("Output failed");
        }
    }
    
    
    
}
