/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyear2018q3;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class PastYear2018Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter font size: ");
//        int fontSize = s.nextInt();
//        System.out.println("Enter font type: ");
//        char fontType = s.next().charAt(0);
//        System.out.println("Enter format [1 - Vertical, 2 - Horizontal]: ");
//        int format = s.nextInt();
//        
//    }
//    
//    public static void display(int fontSize, char fontType, int format){
        




      int fontSize, format;
        String fontType;
        int width, height, middleIndex;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter font size: ");
        fontSize = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter font type: ");
        fontType = scanner.nextLine();
        System.out.print("Enter format [1 - Vertical, 2 - Horizontal]: ");
        format = scanner.nextInt();

        /*
        When printing vertically (format 1)
            If font size 1, width is 3, height is 5
            If font size 3, width is 5, height is 9
            General formula:
                width = n + 2
                height = 2n + 3
            Printing by each row: First, middle, last
            Printing by each column: First and last
        When printing horizontally (format 2)
            If font size 1, width is 5, height is 2
            If font size 4, width is 11, height is 6
            General formula:
                 width = 2n + 3
                 height = n + 2
            Printing by each row: First and last
            Printing by each column: First, middle, last
         */


        if (format == 1) {
            width = fontSize + 2;
            height = 2 * fontSize + 3;
            middleIndex = height / 2;

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (i == 0 || i == middleIndex || i == height - 1) {
                        System.out.print(fontType);
                    } else {
                        if (j == 0 || j == width - 1) {
                            System.out.print(fontType);
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        } else {
            width = 2 * fontSize + 3;
            height = fontSize + 2;
            middleIndex = width / 2;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (i == 0 || i == height - 1) {
                        System.out.print(fontType);
                    } else {
                        if (j == 0 || j == middleIndex || j == width - 1) {
                            System.out.print(fontType);
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }

    }
}
        
    

