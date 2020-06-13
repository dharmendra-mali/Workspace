package AnonamusInnerClass;

public class ExampleAnonamusInnerClass {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 13; i++) {
					System.out.println("child threads");
				}
			}
		});
		t.start();
		for (int i = 0; i < 13; i++) {
			System.out.println("parant threads");
		}

	}

}
