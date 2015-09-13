package csv;

import java.sql.Connection;
import java.util.ArrayList;

public class WriteToMysql {

	
	public static void write(ArrayList<Model> list) throws Exception {
		Connection conn = DBConnection.getConnection();
		ArrayList<Model> listAgain= new ArrayList<Model>();
		System.out.println(Thread.currentThread().getName() + "正在写文件...");
		for(int i=0; i<list.size(); i++) {
			if(!ModelSave.save(list.get(i), conn)){
				listAgain.add(list.get(i));
			}
		}
		if(!listAgain.isEmpty()) {
			write(listAgain);
		}
		System.out.println(Thread.currentThread().getName() + "写文件结束...");
		conn.close();	
	} 
}
