/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst5q2;
 
import java.lang.reflect.Array;
/**
 *
 * @author Vinishaah Jeyabalan
 */
public interface StackInterface<T> {
    public boolean isEmpty();
    public boolean isFull();
    public int getSize();
    public void Push(T a);
    public T Pop();
    public T Peek();
    public void showStack();
    
}
