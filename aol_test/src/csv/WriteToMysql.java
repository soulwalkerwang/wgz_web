package csv;

import java.sql.Connection;
import java.util.ArrayList;

public class WriteToMysql {

	
	public static void write(ArrayList<Model> list) throws Exception {
		Connection conn = DBConnection.getConnection();
		ArrayList<Model> listAgain= new ArrayList<Model>();
		System.out.println(Thread.currentThread().getName() + "����д�ļ�...");
		for(int i=0; i<list.size(); i++) {
			if(!ModelSave.save(list.get(i), conn)){
				listAgain.add(list.get(i));
			}
		}
		if(!listAgain.isEmpty()) {
			write(listAgain);
		}
		System.out.println(Thread.currentThread().getName() + "д�ļ�����...");
		conn.close();	
	} 
}
