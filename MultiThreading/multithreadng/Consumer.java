package multithreadng;

class Consumer extends Thread {
	   private Shared_Stack shared;
	   private int number;
	   
	   public Consumer(Shared_Stack c,int number) {
	      shared = c;
	      this.number = number;
	   }
	   public void run() {
	      int value = 0;
	      for (int i = 0; i < 1; i++) {
	         value = shared.get();
	         System.out.println("Consumer #" + this.number + " got: " + value);
	      }
	   }
	}