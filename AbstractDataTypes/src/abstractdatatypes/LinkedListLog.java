/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractdatatypes;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class LinkedListLog<T extends Comparable<T>> implements SimpleLog<T> {
    
    private LinkedList<T> log;
    private int maxsize;
    
    public LinkedListLog(int a){
        maxsize = a;
        log = new LinkedList<>();
    }
    
    public void insert(T t){
        if(!isFull()){
            log.add(t);
        }
        else{
            System.out.println("The log is full");
        }
    }
    
    public boolean isFull(){
        return (maxsize == log.size());
    }
    
    public int size(){
        return log.size();
    }
    
    public void clear(){
        for(int i=size()-1; i>=0; i--){
            log.remove(i);
        }
    }
    
     public boolean search(T t){
        for(int i=0; i<size(); i++){
            if(log.get(i).compareTo(t)==0){
            return true;
            }
        }
        return false;
    }
        
    public String toString(){
        String str = "";
        for(int i=0; i<size(); i++){
            str += log.get(i) + " ";
        }
        return str;
    }
    
    
    
}
