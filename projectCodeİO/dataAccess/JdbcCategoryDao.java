package projectCodeİO.dataAccess;

import projectCodeİO.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	public void add(Category category) {
		System.out.println("JDBC ile veritabanına kategori eklendi.");
	}
}
