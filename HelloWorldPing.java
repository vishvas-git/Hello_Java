public class HelloWorldPing {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			System.out.println("Java->GitHub->DockerHub(CI)|Hello World! " + i);
			Thread.sleep(1000);
		}
	}
}
