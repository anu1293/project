package multithreadng;

import java.util.Stack;

public class Shared_Stack {
private  Stack<Integer> stack;
private  int size=5;
private int noOfConsumers=-1;
private int noOfProducers=-1;

public Shared_Stack(int size,int noOfConsumers,int noOfProducers)
{
this.size=size;	
this.noOfConsumers=noOfConsumers;
this.noOfProducers=noOfProducers;
stack=new Stack<Integer>();
}
public synchronized int get() {
    while (stack.empty() == true) {
       try {
          wait();
       } catch (InterruptedException e) {}
    }
    
    notifyAll();
    return stack.pop();
 }
 public synchronized void put(int value) {
    while (stack.size() == size) {
       try {
          wait();
       } catch (InterruptedException e) { } 
    }
    if(noOfConsumers>0){
    stack.push(value);
    noOfConsumers--;
    }
    else
    {
    	
    }
   
    notifyAll();
 }
}
