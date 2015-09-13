package csv;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ModelSave {

	public static boolean save(Model model, Connection conn) throws Exception {
		String sql = "INSERT INTO tb(name, id) VALUES (?, ?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, model.getName());
		ps.setInt(2, model.getId());
		boolean isOk = true;
		if (ps.executeUpdate() != 1) {
			isOk = false;
		}
		ps.close();
		return isOk;
	}
}
