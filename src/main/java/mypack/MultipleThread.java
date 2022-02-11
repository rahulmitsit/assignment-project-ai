package mypack;

public class MultipleThread implements Runnable{

	private Thread t;
	private String threadName;
	MultipleThread(String str){
		threadName=str;
		System.out.println("creating thread "+threadName);
	}
	
	public static void main(String[] args) {

//		System.out.println("inside "+new MultipleThread().getClass());
		MultipleThread t1=new MultipleThread("Thread-1");
		MultipleThread t2=new MultipleThread("Thread-2");
		MultipleThread t3=new MultipleThread("Thread-3");
		MultipleThread t4=new MultipleThread("Thread-4");
		MultipleThread t5=new MultipleThread("Thread-5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
	public void start () {
//	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	public void run() {
		System.out.println("Running Thread :" +  threadName );
	      try {
	         for(int i = 4; i > 0; i--) {
	            System.out.println("Thread: " + threadName + ", " + i);
	            // Let the thread sleep for a while.
	            Thread.sleep(50);
	         }
	      } catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	      }
	      System.out.println("Thread " +  threadName + " exiting.");	
	}

}
