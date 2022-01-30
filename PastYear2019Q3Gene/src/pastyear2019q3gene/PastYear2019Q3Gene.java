/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyear2019q3gene;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class PastYear2019Q3Gene {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String genome, gene, temp1="", temp2="";
//        String start = "ATG";
//        String end1="TAG", end2="TAA", end3="TGA";
//        int count=0;
//        
//        System.out.println("Enter genome to process: ");
//        genome = s.nextLine();
//        System.out.println("   ");
//        
//        for(int i=3; i<=genome.length(); i+=3){
//            temp1 += genome.substring(i-3, i);
//            if(temp1.equalsIgnoreCase(start)){
//                for(int k=i+3; k<=genome.length(); k+=3){
//                    temp2 += genome.substring(k-3, k);
//                    if(temp2.equals(end1) || temp2.equals(end2) || temp2.equals(end3)){
//                        gene = genome.substring(i, k-3);
//                        System.out.printf("Gene: %s\n", gene);
//                        break;
//                    }
//                    temp2 = "";
//                }
//                temp1 = "";
//            }
//            else{
//                count+=3;
//                temp1 = "";
//            }
//        }
//        if(count == genome.length()){
//            System.out.println("No Genes Found");
//        }
//                




//            Scanner s = new Scanner(System.in);
//            String start = "ATG";
//            String end1="TAG", end2="TAA", end3="TGA";
//            while(true){
//                System.out.println("Enter genome string [quit to stop] : ");
//                String genome = s.nextLine();
//                if(genome.equals("quit")){
//                    break;
//                }
//                if(genome.contains(start) && genome.contains(end1) || genome.contains(end2) || genome.contains(end3)){
//                    String[] temp = genome.split(start);
//                    String[] temp1 = genome.split(end1);
//                    String[] temp2 = genome.split(end2);
//                    String[] temp3 = genome.split(end3);
//                    
//                    for(int i=0; i<genome.length(); i=+3){
//                        if(temp[i].equals(temp1[i]) || temp[i].equals(temp2[i]) || temp[i].equals(temp3[i])){
//                            System.out.println(temp[i]);
//                        }
//                            
//                        
//                    }







//        int firstIndex = 0, lastIndex = 0;
//        int lastIndexTemp = -1;
//        String[] lastIndexString = {"TAG", "TAA", "TGA"};
//        String input = "";
//        String output = "";
//        Scanner scanner = new Scanner(System.in);
// 
//        while (true) {
//            System.out.print("Enter genome string [quit to stop] : ");
//            input = scanner.nextLine();
// 
//            if (input.equals("quit")) break;
// 
//            while (true)  {
//                // Remove any ATGs in front
//                while (input.contains("ATG")) {
//                    firstIndex = input.indexOf("ATG") + 3;
//                    input = input.substring(firstIndex);
//                    if (!input.startsWith("ATG")) break;
//                }
// 
//                if (input.contains("TAG") || input.contains("TAA") || input.contains("TGA")) {
//                    for (int i = 0; i < lastIndexString.length; i++) {
//                        lastIndex = lastIndexTemp;
//                        if (input.contains(lastIndexString[i])) {
//                            lastIndexTemp = input.indexOf(lastIndexString[i]);
//                        } else {
//                            continue;
//                        }
//                        if (lastIndex > lastIndexTemp) {
//                            lastIndex = lastIndexTemp;
//                        }
//                    }
//                } else {
//                    System.out.println("No gene is found");
//                    break;
//                }
//                output = input.substring(0, lastIndex);
//                if (output.isEmpty() || output.length() % 3 != 0) {
//                    System.out.println("No gene is found");
//                    break;
//                }
//                System.out.println(output);
// 
//                //Loop back by the part after TAG/TGA/TAA
//                input = input.substring(lastIndex + 3);
// 
//                if (!input.contains("ATG")) break;
//            }
//        }





          Scanner s = new Scanner(System.in);
          String input = s.nextLine();
          int output = input.indexOf("ini");
          input = input.substring(output);
          System.out.println(output);
          System.out.println(input);
          
          
          


    }
    }
                
            


            
                        


          


           










                  






// TODO code application logic here
    
    

