package threads;

public class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int i = 10; i>0; i--) {
			System.out.println("I in second thread is: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
		System.out.println("Second thread is finished!");
	}
}
