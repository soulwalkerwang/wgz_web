package csv;

import java.io.File;
import java.util.ArrayList;

public class OperationThread extends Thread {

	private File file;
	private int from;
	private int count;
	
	public OperationThread(File file, int from, int count) {
		this.file = file;
		this.from = from;
		this.count = count;
	}



	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + "��ʼ����...");
			ArrayList<Model> list = ReadCSV.readCSV(file, from, count);
			WriteToMysql.write(list);
			System.out.println(Thread.currentThread().getName() + "���н���...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
