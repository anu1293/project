package advanceJava;

import java.util.Arrays;

public class CustomArrayList {

	private Object[] arr;
    private int actSize = 0;
     
    public CustomArrayList(){
        arr = new Object[10];
    }
     
    public Object get(int index){
        if(index < actSize){
            return arr[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
     
    public void add(Object obj){
        if(arr.length-actSize <= 1){
            increaseListSize();
        }
        arr[actSize++] = obj;
    }
     
    public Object remove(int index){
        if(index < actSize){
            Object obj = arr[index];
            arr[index] = null;
            int tmp = index;
            while(tmp < actSize){
                arr[tmp] = arr[tmp+1];
                arr[tmp+1] = null;
                tmp++;
            }
            actSize--;
            return obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
         
    }
     
    public int size(){
        return actSize;
    }
     
    private void increaseListSize(){
        arr = Arrays.copyOf(arr, arr.length*2);
        System.out.println("\nNew length: "+arr.length);
}
}
