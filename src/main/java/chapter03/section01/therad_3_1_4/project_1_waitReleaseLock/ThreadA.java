package chapter03.section01.therad_3_1_4.project_1_waitReleaseLock;

public class ThreadA extends Thread {

	private Object lock;

	public ThreadA(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}

}
