package 쓰레드;

/**
 * Thread 상속
 * 
 *
 */
public class ThreadTest {

	public static void main(String[] args) {
		Print100 print100 = new Print100();
		print100.setPriority(Thread.MIN_PRIORITY);
		System.out.println(print100.getName());
		print100.start();

//		Print1000 print1000 = new Print1000();
//		print1000.setPriority(Thread.MIN_PRIORITY);
		Thread thread = new Thread(new Print1000());
		thread.start();

		Thread thread1 = new Thread(new Print10000());
		thread1.start();
		
		Thread thread3 = new Thread(new Runnable() {
			public void run() {
				for (int i = 2000; i < 2100; i++) {
					System.out.println(i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread3.start();
		
		//람다식 : 구현클래스 구현메서드가 1개 뿐일때
		Thread thread4 = new Thread(() -> {for (int i = 3000; i < 3100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	});
		thread4.start();
//		thread.join();
		
//		for(int i=1; i<100; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}

//		for(int i=1000; i<1100; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
	}

}
