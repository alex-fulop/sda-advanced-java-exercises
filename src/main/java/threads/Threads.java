package threads;

public class Threads {
	public static void main(String[] args) throws InterruptedException {
//		Verifica numarul de thread-uri
//		System.out.println("Hey from the main thread!");
//		System.out.println(Thread.activeCount());

//		Verifica prioritate thread
//		System.out.println("Current priority of main thread: " + Thread.currentThread().getPriority());

//		Seteaza prioritate thread
//		Thread.currentThread().setPriority(2);

//		Verifica prioritate thread
//		System.out.println("New priority of main thread: " + Thread.currentThread().getPriority());

//		Verifica daca thread-ul este in viata
//		System.out.println("Thread is alive: " + Thread.currentThread().isAlive());

//		Facem un thread sa astepte
//		for (int i = 3; i > 0; i--) {
//			System.out.println("I is: " + i);
////			Thread.sleep(5000);
//		}
//		System.out.println("You are done!");

//		cream un thread nou
//		MyThread newThread = new MyThread();
//		newThread.setDaemon(false);
//		newThread.start();
//
//		System.out.println("Is our thread a deamon: " + newThread.isDaemon());

//		System.out.println("New Thread status:" + newThread.isAlive());
//
//		System.out.println("heloooooo");
//		System.out.println(Thread.activeCount());
//		Thread.sleep(5000);

//		System.out.println();
//		System.out.println("Is new thread alive: " + newThread.isAlive());

//		System.out.println(Thread.activeCount());

//		Verifica numele thread-ului
//		System.out.println(Thread.currentThread().getName());

//		setam un nume thread-ului nou
//		newThread.setName("2nd thread");

//		System.out.println(newThread.getName());

//		Thread.currentThread().setPriority(10);
//
//		newThread.setPriority(4);

//		Thread.sleep(10000);
//		un thread mosteneste prioritatea thread-ului care l-a creat
//		System.out.println("New thread priority " + newThread.getPriority());
//		System.out.println(Thread.currentThread().getPriority());
//		schimbam prioritatea thread-ului main
//		Thread.currentThread().setPriority(10);

//		newThread.setPriority(10);

//		Thread.sleep(5000);

//		System.out.println("Main thread priority " + Thread.currentThread().getPriority());
//		System.out.println("Second thread priority " + newThread.getPriority());

//		Doua tipuri de thread-uri
//		User thread -> thread-uri create de noi + main thread
//		Daemon thread -> thread care ruleaza in fundal pentru diferite task-uri (ex garbage collection)

//		diferenta intre thread-uri user si daemon
//		programul se incheie in momentul in care toate thread-urile USER sunt moarte, thread-urile deamon nu conteaza

//		MULTI THREADING

		MyThread thread1 = new MyThread();
		MyRunnable runnable = new MyRunnable();

//      oprire program manual
//		Runtime.getRuntime().exit(1);

		Thread thread2 = new Thread(runnable);

		thread1.setDaemon(true);
		thread2.setDaemon(true);

		thread1.start();
		//		THREAD -> JOINING
		//		thread1.join(5000);
		thread2.start();

		System.out.println(Thread.activeCount());
	}
}
