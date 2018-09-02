package threads;

public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	
	public static void main(String[] args) {
		Thread(1);
	}
	
	public static void Thread(int x) {
		if (x == 50) {
			System.out.println("Hello from Thread 50");
		}else {
			Thread t = new Thread(() -> {
				Thread(x+1);
				System.out.println("Hello from Thread " + x);
			});
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
