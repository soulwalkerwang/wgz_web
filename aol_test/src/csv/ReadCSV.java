package csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ReadCSV {
	
	public static ArrayList<Model> readCSV(File file, int from, int count)
			throws Exception {
		ArrayList<Model> list = new ArrayList<Model>();
		BufferedReader br = new BufferedReader(new FileReader(file));
		for (int i = 0; i < from; i++) {
			br.readLine();
		}
		String line = "";
		System.out.println(Thread.currentThread().getName() + "正在读文件...");
		for (int i = 0; i < count; i++) {
			if ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, ",");
				Model model = new Model();
				String name = st.nextToken().trim();
				model.setName(name);
				int id = Integer.parseInt(st.nextToken().trim());
				model.setId(id);
				list.add(model);
			}
		}
		System.out.println(Thread.currentThread().getName() + "读文件结束...");
		br.close();
		return list;
	}
}