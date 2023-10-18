package it.unipr.informatica.examples;

public class Example00 {
	public static void main(String[] args) {
		
		// System.out.println("Partito");
		
		for(int j = 0; j < 5; ++j) {
			Thread a = new ThreadA(j);
			a.start();
			
			Thread b = new Thread(new ThreadB(j));
			b.start();
			
			Thread c = new ThreadC(j);
			c.start();
		}
	}
	
	// Classe Inner
	private static class ThreadC extends Thread {
		private int id;
		
		private ThreadC(int id) {
			if(id < 0)
				throw new IllegalArgumentException("id");
			
			this.id = id;
			// Se non metto `static` alla classe inner devo usare `Example00.this.id`
		}
		
		@Override
		public void run() {
			for(int i = 0; i < 10; ++i)
				System.out.println("C: " + i + " - id: " + id);
		}
	}
}