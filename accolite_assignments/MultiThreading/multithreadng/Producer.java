package multithreadng;

class Producer extends Thread {
	   private Shared_Stack shared;
	   private int number;
	   public Producer(Shared_Stack c, int number) {
	      shared = c;
	      this.number = number;
	   } 
	   public void run() {
		   
	      for (int i = 0; i < 1; i++) {
	         shared.put(i);
	         System.out.println("Producer #" + this.number + " put: " + i);
	         try {
	            sleep((int)(Math.random() * 100));
	         } catch (InterruptedException e) { }
	      } 
	   }
	} 
