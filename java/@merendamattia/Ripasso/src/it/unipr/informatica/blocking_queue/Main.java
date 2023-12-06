package it.unipr.informatica.blocking_queue;

public class Main {
	private void go() {
		BlockingQueue<String> q = new ArrayBlockingQueue<String>(5);
		
		System.out.println("isEmpty(): " + q.isEmpty()); // True
		System.out.println("isFull(): " + q.isFull()); // False
		System.out.println("remainingCapacity(): " + q.remainingCapacity()); // 5
		
		q.put("ciao");
		q.put("mi");
		q.put("chiamo");
		
		System.out.println("isEmpty(): " + q.isEmpty()); // False
		System.out.println("isFull(): " + q.isFull()); // False
		System.out.println("remainingCapacity(): " + q.remainingCapacity()); // 2
		q.print();
		
		q.put("mattia");
		q.put("forza");
		
		System.out.println("isEmpty(): " + q.isEmpty()); // False
		System.out.println("isFull(): " + q.isFull()); // True
		System.out.println("remainingCapacity(): " + q.remainingCapacity()); // 0
		q.print();
		
		System.out.println("take(): " + q.take());
		System.out.println("isEmpty(): " + q.isEmpty()); // False
		System.out.println("isFull(): " + q.isFull()); // False
		System.out.println("remainingCapacity(): " + q.remainingCapacity()); // 1
		q.print();
		
		q.clear();
		
		System.out.println("isEmpty(): " + q.isEmpty()); // True
		System.out.println("isFull(): " + q.isFull()); // False
		System.out.println("remainingCapacity(): " + q.remainingCapacity()); // 5
	}
	
	public static void main(String[] args) {
		new Main().go();
	}
}
