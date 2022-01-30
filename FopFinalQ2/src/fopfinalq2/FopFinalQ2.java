/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fopfinalq2;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class FopFinalQ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        user(direction, deg, min, sec, direction2, deg2, min2, sec2, direction3, deg3, min3, sec3, direction4, deg4, min4, sec4);
    }
        public static void user(char direction, int deg, int min, int sec, char direction2, int deg2, int min2, int sec2, char direction3, int deg3, int min3, int sec3, char direction4, int deg4, int min4, int sec4){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Location 1");
            System.out.print("Enter Direction: [N, S, E, W]: ");
            direction = s.next().charAt(0);
            System.out.print("Enter Degree, Minute, Second : ");
            deg = s.nextInt();
            min = s.nextInt();
            sec = s.nextInt();
            System.out.print("Enter Direction: [N, S, E, W]: ");
            direction2 = s.next().charAt(0);
            System.out.print("Enter Degree, Minute, Second : ");
            deg2 = s.nextInt();
            min2 = s.nextInt();
            sec2 = s.nextInt();
            System.out.println("Enter Location 2");
            System.out.print("Enter Direction: [N, S, E, W]: ");
            direction3 = s.next().charAt(0);
            System.out.print("Enter Degree, Minute, Second : ");
            deg3 = s.nextInt();
            min3 = s.nextInt();
            sec3 = s.nextInt();
            System.out.print("Enter Direction: [N, S, E, W]: ");
            direction4 = s.next().charAt(0);
            System.out.print("Enter Degree, Minute, Second : ");
            deg4 = s.nextInt();
            min4 = s.nextInt();
            sec4 = s.nextInt();
            
            
    }
        
        public static void decimalDegree(char sign, String type, double dd, double dd2, double dd3, double dd4, char direction, int deg, int min, int sec, char direction2, int deg2, int min2, int sec2, char direction3, int deg3, int min3, int sec3, char direction4, int deg4, int min4, int sec4){
            switch(direction){
                case 'N':
                    sign = '+';
                    type = "Latitude";
                    break;
                case 'S':
                    sign = '-';
                    type = "Latitude";
                    break;
                case 'E':
                    sign = '+';
                    type = "Logitude";
                    break;
                case 'W':
                    sign = '-';
                    type = "Longitude";
                    break;
                    
            }
            
            dd = (sign)*deg + (min*60+sec)/3600;
            dd2 = (sign)*deg2 + (min2*60+sec2)/3600;
            dd3 = (sign)*deg3 + (min3*60+sec3)/3600;
            dd4 = (sign)*deg4 + (min4*60+sec4)/3600;
            
        }
        
        public static void distance(double dd, double dd2, double dd3, double dd4, double latdif, double londif, double a, double c, double d){
            int R = 6371;
            latdif = dd - dd3;
            londif = dd4 - dd2;
            
            a = Math.pow(Math.sin(latdif/2), 2) + Math.cos(dd)*Math.cos(dd3)*Math.pow(Math.sin(londif/2), 2);
            c = 2*Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
            d = R*c;
        }   
    
}
