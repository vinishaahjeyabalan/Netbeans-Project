/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.Random;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Queue1<Integer> a = new Queue1<>();
//        System.out.println("Insert three nodes into the queue");
//        a.enqueue(4);
//        a.enqueue(5);
//        a.enqueue(6);
//        a.showQueue();
//        System.out.println("\nThe queue size is " + a.getSize());
//        System.out.println("Remove one node from the queue");
//        a.dequeue();
//        a.showQueue();
//        System.out.println("\nThe queue size is " + a.getSize());
//        System.out.println("The value of the front node is " + a.peek());
//        System.out.println("The queue size is " + a.getSize());
//        System.out.println("\n");
        
        
        
        
        //Bank simulation - All customers queue at the same time
//        String[] name = {"Ahmad", "Ali", "Anuar", "James", "Ramesh"};
//        int cnt1=0, cnt2=0, serviceTime=3;
//        Queue1<String> Q = new Queue1<>();
//        System.out.println("Simulate Waiting Queue in the Bank");
//        System.out.println("Time 0: All customers queue at the same time");
//        int time =0;
//        for(int i=0; i<name.length; i++){  //all the customers are in queue
//            Q.enqueue(name[i]);
//        }
//        System.out.println("The queue is ");
//        Q.showQueue();
//        System.out.println("");
//        
//        while(true){
//            time++;       //time=1
//            if(cnt1==0){
//                if(!Q.isEmpty()){
//                    System.out.println("Time " + time + " Counter 1 serving " + Q.dequeue()); //time=1
//                    cnt1 += serviceTime-1;  //cnt1=2
//                }
//            }
//            else{
//                cnt1--;
//            }
//            if(cnt2==0){
//                if(!Q.isEmpty()){
//                    System.out.println("Time " + time + " Counter 2 serving " + Q.dequeue());
//                    cnt2 += serviceTime-1;
//                }
//            }
//            else{
//                cnt2--;
//            }
//            if(Q.isEmpty()){
//                break;
//            }
//            System.out.println("Time " + time + " The queue is ");
//            Q.showQueue();
//            System.out.println();
//        }
        
        
        
        
        
        //Bank simulation - Customers arrive at different time
//        String[] name = {"Ahmad", "Ali", "Anuar", "James", "Ramesh"};
//        int[] arrive = {1, 2, 2, 4, 6};
//        int time=0, cnt1=0, cnt2=0, serviceTime=3, N=0;
//        Queue1<String> Q ;
//        Q = new Queue1<>();
//        System.out.println("Simulate Waiting Queue in the Bank");
//        System.out.println("Customers arrive at different time");
//        for(int i=0; i<name.length; i++){
//            System.out.print(name[i] + "(" + arrive[i] + ") ");
//        }
//        System.out.println();
//        
//        while(true){
//            time++;
//            while(N<arrive.length && arrive[N]==time){
//                Q.enqueue(name[N]);
//                N++;
//            }
//            if(cnt1==0){
//                 if(!Q.isEmpty()){
//                    System.out.println("Time " + time + " Counter 1 serving " + Q.dequeue());
//                    cnt1 += serviceTime-1;
//                }
//            }
//            else{
//                cnt1--;
//            }
//            if(cnt2==0){
//                 if(!Q.isEmpty()){
//                    System.out.println("Time " + time + " Counter 2 serving " + Q.dequeue());
//                    cnt2 += serviceTime-1;
//                }
//            }
//            else{
//                cnt2--;
//            }
//            if(Q.isEmpty() && N==arrive.length){
//                break;
//            }
//            System.out.println("Time " + time + " The queue is ");
//            Q.showQueue();
//            System.out.println();
//        }



          //Average Waiting Time
          Random r = new Random();
          Request request;
          int NRequest = 10;
          int numberOfQueue = 2;
          Queue1<Request>[]SQ = new Queue1[numberOfQueue];
          Queue1<Request>RQ = new Queue1<>();
          
          for(int i=0; i<numberOfQueue; i++){
              SQ[i] = new Queue1<>();
          }
          
          int currentTime = 0;
          int minIAT = 0, maxIAT = 10, minST = 5, maxST = 15;
          
          int IAT, ST;
          for(int i=0; i<NRequest; i++){
              IAT = minIAT + r.nextInt(maxIAT-minIAT-1);
              ST = minST + r.nextInt(maxST-minST-1);
              currentTime += IAT;
              request = new Request(currentTime, ST);
              RQ.enqueue(request);
          }
          
          int []indexandFT = new int[2];
          int index;
          int WT=0, NProcess=0;
          currentTime=0;
          
          while(true){
              //dequeue all SQ if FT = currentTime
              for(int i=0; i<numberOfQueue; i++){
                  if(!SQ[i].isEmpty()){
                      if(SQ[i].peek().getFT() == currentTime){
                          SQ[i].dequeue();
                      }
                  }
              }
              //process queue if AT=currentTime
              while(!RQ.isEmpty() && RQ.peek().getAT() == currentTime){
                  request = RQ.dequeue();
                  //get the best queue and finish time
                  getBestQueue(request.getAT(), request.getST(), SQ, indexandFT);
                  request.setFT(indexandFT[1]);
                  WT+=request.getWT();
                  index=indexandFT[0];
                  System.out.println("Request " + (NProcess+1) + " : AT = " + request.getAT() + 
                                     " ST = " + request.getST() + " FT = " + request.getFT() +
                                     " WT = " + request.getWT() + " Queue = " + index);
                  SQ[index].enqueue(request);
                  NProcess++;
              }
              currentTime++;
              if(NProcess==NRequest){
                  break;
              }
          }
          System.out.println("The waiting time is : " + WT);
          System.out.println("The average waiting time is : " + WT/(NRequest*1.0));
          
          
          
          public static void getBestQueue(int at, int st, Queue1<Request>[] SQ, int[] indexandFT){
              Queue1<Request> hold = new Queue1<>();
              int temp, FT=0, index=0;
              if(SQ[index].isEmpty()){
                  FT = at+st;
              }
              else{
                  while(SQ[index].getSize()!=1){
                      hold.enqueue(SQ[index].dequeue());
                  }
                  if(at<SQ[index].peek().getFt()){
                      FT = SQ[index].peek().getFT()+st;
                  }
                  else{
                      FT = at + st;
                  }
                  hold.enqueue(SQ[index].dequeue());
                  
                  while(!hold.isEmpty()){
                      SQ[index].enqueue(hold.dequeue());
                  }
              }
              for(int i=1; i<SQ.length; i++){
                  if(SQ[i].isEmpty()){
                      temp = at + st;
                      if(temp<FT){
                          index = 1;
                          FT = temp;
                      }
                  }
                  else{
                      while(SQ[i].getSize()!=1){
                          hold.enqueue(SQ[i].dequeue());
                      }
                      if(at<SQ[i].peek().getFT() + st){
                          temp = SQ[i].peek().getFT() + st;
                      }
                      else{
                          temp = at + st;
                      }
                      if(temp<FT){
                          index=i;
                          FT=temp;
                      }
                      hold.enqueue(SQ[i].dequeue());
                      
                      while(!hold.isEmpty()){
                          SQ[i].enqueue(hold.dequeue());
                      }
                  }
              }
              indexandFT[0]=index;
              indexandFT[1]=FT;
          }
          
          
        
    }
    
    
}

