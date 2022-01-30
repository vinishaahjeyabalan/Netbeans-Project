/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst6q2;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public interface QueueInterface<T> {
    public boolean isEmpty();
    public boolean isFull();
    public int getSize();
    public void enqueue(T a);
    public T dequeue();
    public T peek();
    public void showQueue();
}
