package threads;

public class MyThread extends Thread{
	@Override
	public void run() {
//		if(this.isDaemon()) {
//			System.out.println("This is a daemon thread :)");
//		} else {
//			System.out.println("This is a user thread :)");
//		}

		for (int i = 0; i <10; i++) {
			System.out.println("I in first thread is: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
		System.out.println("First thread is finished!");
	}
}
