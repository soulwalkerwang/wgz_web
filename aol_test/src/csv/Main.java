package csv;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File csv = new File(args[0]);
			for (int i = 0; i < 5; i++) {
				Thread thread = new OperationThread(csv, i * 3, 3);
				thread.setName("thread" + i);
				thread.start();
			}


	}

}
