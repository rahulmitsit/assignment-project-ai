package mypack;

import java.util.ArrayList;
import java.util.List;

public class Question2 extends Thread{

	private Thread t;
	private String threadName;
	Question2(String str){
		threadName=str;
		System.out.println("creating thread "+threadName);
	}
	
	public static void main(String[] args) {

//		System.out.println("inside "+new MultipleThread().getClass());
		Question2 t1=new Question2("Thread-1");
		Question2 t2=new Question2("Thread-2");
		Question2 t3=new Question2("Thread-3");
		Question2 t4=new Question2("Thread-4");
		Question2 t5=new Question2("Thread-5");
		try {
			t1.start();
//			t1.join();
			
			t2.start();
//			t2.join();
			
			t3.start();
//			t3.join();
			
			t4.start();
//			t4.join();
			
//			t5.start();
			
//			if(!Thread.currentThread().isAlive()) {
//				System.out.println("here");
//				t5.start();
//			}
//			System.out.println(Thread.currentThread().getId());
			if(!t1.isAlive() && !t2.isAlive() && !t3.isAlive() && !t4.isAlive()) {
				t5.start();
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
//		System.out.println("priority");
//		System.out.println(t1.getPriority());
//		System.out.println(t2.getPriority());
//		System.out.println(t3.getPriority());
//		System.out.println(t4.getPriority());
//		System.out.println(t5.getPriority());
		
		

	}
//	public void start () {
////	      System.out.println("Starting " +  threadName );
//	      if (t == null) {
//	         t = new Thread (this, threadName);
//	         t.start ();
//	      }
//	   }
	public void run() {
		System.out.println("Running Thread :" +  threadName );
	      try {
	         for(int i = 4; i > 0; i--) {
	            System.out.println("Thread: " + threadName + ", " + i);
	            // Let the thread sleep for a while.
	            Thread.sleep(50);
	            if(threadName.equals("Thread-5")) {
//	            	Thread.currentThread().wait();
	            }
	         }
	      } catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	      }
	      System.out.println("Thread " +  threadName + " exiting.");	
	}

}
class ThreadId {
    private int id;

    public ThreadId() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}