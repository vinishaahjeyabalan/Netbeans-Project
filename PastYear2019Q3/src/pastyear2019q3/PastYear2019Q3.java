/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyear2019q3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class PastYear2019Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N : ");
        int N = s.nextInt();
        int[][] mat1 = new int[N][N];
        int[][] mat2 = new int[N][N];
        System.out.println("Matrix A");
        System.out.println(displayMatrix(mat1[i][j],));
        
    }
        
    
        public static void generateMatrix(int N){
            Random r = new Random();
            int[][] mat1 = new int[N][N];
            int[][] mat2 = new int[N][N];
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    mat1[i][j] = r.nextInt(10);
                    mat2[i][j] = r.nextInt(10);
                }
            }
        }
            
            
        public static int displayMatrix(int[][] mat1, int[][] mat2, int N){
            int i,j=0;
            System.out.println("Matrix A");
            for(i=0; i<N; i++){
                for(j=0; j<N; j++){
                    return mat1[i][j];
                }
            }
                
            System.out.println("Matrix B");
            for(i=0; i<N; i++){
                for(j=0; j<N; j++){
                    return mat2[i][j];
                }
            }
            return mat1[i][j];
            
        }
        
        public static int addMatrix(int[][] mat1, int[][] mat2, int N){
            int i,j=0;
            int[][] mat3 = new int[N][N];
            for(i=0; i<N; i++){
                for(j=0; j<N; j++){
                    mat3[i][j] = mat1[i][j]+mat2[i][j];
                }
            }
            return mat3[i][j];
        }
        
        public static int multiplyMatrix(int[][] mat1, int[][] mat2, int N){
            int i,j=0,k;
            int[][] mat4 = new int[N][N];
            for(i=0; i<N; i++){
                for(j=0; j<N; j++){
                    mat4[i][j]=0;
                    for(k=0; k<N; k++){
                        mat4[i][j] = mat1[i][k]*mat2[k][j];
                    }
                }
            }
            return mat4[i][j];
        }
            
            
            
        
       
        
   
        
        
        
        
        // TODO code application logic here
    }
    

