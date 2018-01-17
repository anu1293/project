package multithreadng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiple_Producer_Consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=-1;
		int noOfProducers=-1;
		int noOfConsumers=-1;
		Consumer consumers[] = null;
		Producer producers[]=null;
		Shared_Stack stack=null;
		try {
			size = Integer.parseInt(br.readLine());
			stack = new Shared_Stack(size,noOfConsumers,noOfProducers);
			noOfProducers=Integer.parseInt(br.readLine());
			noOfConsumers=Integer.parseInt(br.readLine());
			consumers=new Consumer[noOfConsumers];
			producers=new Producer[noOfProducers];
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		 
	     for(int i=0;i<noOfConsumers;i++)
	     {
	    	 consumers[i]=new Consumer(stack,i);
	    	 consumers[i].start();
	     }
	     
	     for(int i=0;i<noOfProducers;i++)
	     {
	    	 producers[i]=new Producer(stack, i);
	    	 producers[i].start();
	     }
	     
		
	}

}
