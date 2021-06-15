package tutorial3;

public class SpaceThreads implements Runnable{
	
	
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
        System.out.println("Hello from " + threadName);

	}
	
	
	public static void main(String[] args) {
		new Thread(new SpaceThreads()).start();


	}

}
